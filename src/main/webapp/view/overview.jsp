<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>

    <!-- CSS -->
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Poppins', sans-serif;
            min-height: 100vh;
            display: flex;
            background: linear-gradient(
                to bottom,
                rgba(13, 59, 102, 0.05),
                rgba(13, 59, 102, 0)
            );
        }

        /* Sidebar */
        .nav {
            width: 250px;
            min-height: 100vh;
            background-color: #ffffff;
            box-shadow: 2px 0 8px rgba(0, 0, 0, 0.08);
            padding-top: 20px;
        }

        .nav ul {
            list-style: none;
            padding: 0;
            margin: 0;
        }

        .nav li {
            margin: 4px 10px;
        }

        .nav a {
            display: block;
            padding: 12px 16px;
            text-decoration: none;
            color: #0d3b66;
            font-weight: 500;
            border-radius: 8px;
            transition: background-color 0.25s ease, color 0.25s ease;
        }

        .nav a:hover {
            background-color: #0d3b66;
            color: #ffffff;
        }

        .nav a.active {
            background-color: rgba(13, 59, 102, 0.1);
            font-weight: 600;
        }

        /* Contenu */
        .content-wrapper {
            flex: 1;
            display: flex;
            flex-direction: column;
        }

        /* Header */
        .header {
            height: 60px;
            background-color: #ffffff;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.08);
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 0 24px;
        }

        .header h2 {
            margin: 0;
            font-size: 18px;
            color: #0d3b66;
        }

        /* Main content */
        .main-content {
            flex: 1;
            padding: 24px;
        }

        .card {
            background: #ffffff;
            border-radius: 12px;
            padding: 20px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.08);
        }
    </style>
</head>
 
<body>

<!-- SIDEBAR -->
<nav class="nav"> 
     <ul>
      <li>
            <a href="${pageContext.request.contextPath}/ControllerUser?page=user"
               class="${page == 'user' ? 'active' : ''}">
                Utilisateurs
            </a>
        </li>
      <li>
            <a href="${pageContext.request.contextPath}/ControllerEleve?page=eleveContent"
               class="${page == 'eleveContent' ? 'active' : ''}">
                Élèves
            </a>
           </ul> 
    
        <li> 
            <a href="${pageContext.request.contextPath}/ControllerUser?page=prof"
               class="${page == 'prof' ? 'active' : ''}">
                Profs
            </a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/ControllerUser?page=prof"
               class="${page == 'classe' ? 'active' : ''}">
                Classes
            </a>
        </li>
        <li>  
            <a href="${pageContext.request.contextPath}/ControllerUser?page=prof"
               class="${page == 'matiere' ? 'active' : ''}">
                Matières
            </a>
        </li>
    </ul> <%--   </li>--%>
</nav>

<!-- CONTENU -->
<div class="content-wrapper">

    <!-- HEADER -->
    <header class="header">
        <h2>Dashboard</h2>
        <div>
            Bienvenue Manfred MOUKATE
        </div>
    </header>  
	
     <!-- MAIN -->
    <main class="main-content"> 
        <div class="card"> 
            <jsp:include page="/view/${page}.jsp" />  
        </div>
    </main>

</div>

</body>
</html>
