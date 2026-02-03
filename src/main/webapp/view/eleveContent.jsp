<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="web.model.Eleve" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
 <style>
    body {
      margin: 0;
      padding: 0;
      font-family: 'Poppins', sans-serif;
      min-height: 100vh;
      display: flex;
      flex-direction: row;
      background: linear-gradient(
        to bottom,
        rgba(13, 59, 102, 0.05),
        rgba(13, 59, 102, 0)
      ); 
    }
    .btnPart{
      display: flex;
      flex-direction: row;
      width: 100%;
      justify-content: end;
      height: 50px;
      gap: 10px;
      padding: 20px 15px;
    }
    .btnPaty1{
      border: 1px solid #0d3b66;
      background-color: #0d3b66;
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 15px;
      border-radius: 5px;
      color: #ffffff;
      cursor: pointer;
      font-weight: bold;
    }
    .btnPaty1:hover{
      background-color: #ffffff;
      border: 1px solid #0d3b66;
      color: #0d3b66;
    }
    .btnPaty2{
      border: 1px solid #0d3b66;
      background-color: #ffff;
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 15px;
      border-radius: 5px;
      color: #0d3b66;
      cursor: pointer;
      font-weight: bold;
    }
    .btnPaty2:hover{
      background-color: #0d3b66;
      border: 1px solid #0d3b66;
      color: #ffffff;
    }
  
    p{
      padding: 0;
      margin: 0;
    }
        input{
      padding: 14px;
      border-radius: 10px;
      border: 1px solid #ccc;
    }
    input:focus{
      border-color: #0d3b66;
    }
     .inputPart{
      display: flex;
      flex-direction: row;
      gap: 10px;
    }
    a{
    text-decoration: none
    }
     form{
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      gap: 25px;
      width: 100%;
    }
  </style>
</head>
<body> 
	<div class="btnPart"> 
		  <a href="${pageContext.request.contextPath}/ControllerEleve?action=create" class="btnPaty1"> 
		      Nouvel eleve	 
		  </a>
		  <div class="btnPaty">
		   <a href="${pageContext.request.contextPath}/ControllerEleve?action=listStudent"
		   class="btnPaty1">
		   Voir la liste
		</a>
		  </div> 
		    <div class="btnPaty">
		   <a href="${pageContext.request.contextPath}/ControllerEleve?action=calcumMoyen"
		   class="btnPaty1">
		   Moyenne
		</a>
	  </div> 
    <%
     String action = request.getParameter("action");
     %>
<%
if ("create".equals(action)) {
%> 	

    <!-- FORMULAIRE -->
    <div class="formPart">																																								
        <form method="post"
              action="${pageContext.request.contextPath}/ControllerEleve"
              style="padding: 20px;">

            <h3>Créer un eleve</h3>

            <div class="inputPart">
                <input type="text" name="nom" placeholder="Nom" required>
                <input type="text" name="prenom" placeholder="Prénom" required>
            </div>

            <div class="inputPart">
                <input type="text" name=filiere placeholder="Entrer la filiere" required> 
            </div>

       

            <button type="submit" class="btnPaty1" style="width: 480px">
                Enregistrer
            </button>
        </form>
    </div>

<%
} else if ("listUser".equals(action)) {
%>

    <!-- LISTE DES UTILISATEURS -->
    <h3>Liste des utilisateurs</h3>

    <table border="1" cellpadding="10" cellspacing="0" width="100%">
        <tr>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Filiere</th> 
        </tr> 
 
        <%
          LElevedent> users = (LElevedent>) request.getAttribute("users");
                  if (users != null && !users.isEmpty()) {
                      fElevedent u : users) {
          %>
            <tr>
                <td><%= u.getNom()%></td>
                <td><%= u.getPrenom() %></td>
                <td><%= u.getFiliere() %></td>  
            </tr>
        <% 
            }
        } else {
        %>
            <tr>
                <td colspan="4">Aucun eleve</td>
            </tr>
        <%
        }
        %>
    </table>

<% } %>
</body>
</html>