package web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ControllerConnexion
 */
@WebServlet("/ControllerConnexion")
public class ControllerConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerConnexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		//response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		  
		String emailUser = request.getParameter("email");
		String passwordUser = request.getParameter("password");  
		
		 
		if(emailUser == null || !emailUser.equals("moukatemanfred@gmail.com")) {
			 
			request.setAttribute("message", "uthentication failed");
			request.getRequestDispatcher("view/login.jsp").forward(request, response);
			return;
		}  
		if(passwordUser == null || !passwordUser.equals("2580")) { 
			request.setAttribute("message", "uthentication failed");
			request.getRequestDispatcher("view/login.jsp").forward(request, response);
			return; 
		}   
		
		 request.setAttribute("page", "overviewContent");  
		request.getRequestDispatcher("view/overview.jsp").forward(request, response); 
		
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String emailUser = req.getParameter("email"); 
		String passwordUser = req.getParameter("password");  
		
		
		out.println(emailUser);
		out.println(passwordUser); 
		
		if(emailUser == null || !emailUser.equals("moukatemanfred@gmail.com")) {
			out.println("authentication failed "); 
			return;
		} 
		if(passwordUser == null || !passwordUser.equals("2580")) {
			out.println("authentication failed ");
			return; 
		} 
		
		out.println("success"); 
	}

}
