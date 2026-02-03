package web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import web.model.ObjectsListe;
import web.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class ControllerUser
 */
@WebServlet("/ControllerUser")
public class ControllerUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        List<User> userList = ObjectsListe.userList;

        String page = request.getParameter("page");
        String action = request.getParameter("action");

        if (page == null) page = "user"; 

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
		List<User> userList = ObjectsListe.userList; 
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String grade = request.getParameter("grade");
		String email = request.getParameter("email");
		String motDePass = request.getParameter("password");
		String rMotDePass = request.getParameter("password-repeat");
		
		if(nom == null || nom.isEmpty()) {
			out.println("Veuillez renseigner le nom");
			return;
		}
		if(prenom == null || prenom.isEmpty()) {
			out.println("Veuillez renseigner le prenom");
			return;
		}
		if(grade == null ||  grade.isEmpty()) {
			out.println("Veuillez renseigner le grade");
			return;
		}
		if(email == null ||  email.isEmpty()) {
			out.println("Veuillez renseigner le email");
			return;
		}
		if(motDePass == null || motDePass.isEmpty()) {
			out.println("Veuillez renseigner le motDePass");
			return;
		}
		if(rMotDePass == null || rMotDePass.isEmpty()) {
			out.println("Veuillez renseigner le second mot de passe");
			return;
		} 
		 
		if(!motDePass.equals(rMotDePass)) {
			out.println("Les deux mot de passe ne sont pas correct");
			return;
		}
		
		
		User user = new User(nom, prenom, grade, email, motDePass, rMotDePass);
		
		userList.add(user); 
		 

        request.setAttribute("page", "user");   
      
	request.getRequestDispatcher("/view/overview.jsp").forward(request, response);
	}

}
