package web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import web.model.ObjectsListe;
import web.model.Eleve;
import web.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class ControllerEleve
 */
@WebServlet("/ControllerEleve")
public class ControllerEleve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerEleve() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html; charset=UTF-8");

	        List<Eleve> userList = ObjectsListe.studentList;

	        String page = request.getParameter("page");
	        String action = request.getParameter("action");

	        if (page == null) page = "eleveContent"; 

	        request.setAttribute("page", page);
	        request.setAttribute("action", action);
	        request.setAttribute("users", userList); // 🔥 IMPORTANT

	        request.getRequestDispatcher("/view/overview.jsp")
	               .forward(request, response);
        
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		List<Eleve> userList = ObjectsListe.studentList; 
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String filiere = request.getParameter("filiere");
	}

}
