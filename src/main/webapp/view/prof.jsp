<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
  box-sizing: border-box;
  font-family: 'Poppins', sans-serif;
}

body {
  margin: 0;
  min-height: 100vh;
  background: linear-gradient(to bottom, #f0f4f8, #ffffff);
}

/* ===== NAV BAR ===== */
.navbar {
  display: flex;
  justify-content: flex-end;
  gap: 10px;
  padding: 20px;
  background: #fff;
  box-shadow: 0 2px 10px rgba(0,0,0,0.05);
}

/* ===== BUTTONS ===== */
.btn {
  padding: 12px 18px;
  border-radius: 6px;
  font-weight: 600;
  text-decoration: none;
  border: 1px solid #0d3b66;
  transition: 0.3s;
}

.btn-primary {
  background: #0d3b66;
  color: white;
}

.btn-primary:hover {
  background: white;
  color: #0d3b66;
}

.container {
  max-width: 900px;
  margin: 40px auto;
  padding: 20px;
}

/* ===== FORM ===== */
.form-card {
  background: white;
  padding: 30px;
  border-radius: 12px;
  box-shadow: 0 10px 30px rgba(0,0,0,0.08);
}

.form-card h3 {
  margin-bottom: 20px;
  color: #0d3b66;
}

.form-group {
  display: flex;
  gap: 15px;
}

input {
  width: 100%;
  padding: 14px;
  border-radius: 8px;
  border: 1px solid #ccc;
}

input:focus {
  outline: none;
  border-color: #0d3b66;
}

/* ===== TABLE ===== */
.table-card {
  background: white;
  padding: 20px;
  border-radius: 12px;
  box-shadow: 0 10px 30px rgba(0,0,0,0.08);
}

table {
  width: 100%;
  border-collapse: collapse;
}

th {
  background: #0d3b66;
  color: white;
  padding: 12px;
}

td {
  padding: 12px;
  border-bottom: 1px solid #eee;
}

tr:hover {
  background: #f5f9ff;
}

.empty {
  text-align: center;
  padding: 20px;
  color: #999;
}
</style>
</head>
<body>
<div class="navbar">
  <a href="${pageContext.request.contextPath}/ControllerEleve?action=create" class="btn btn-primary">Nouveau prof</a>
  <a href="${pageContext.request.contextPath}/ControllerEleve?action=listStudent" class="btn btn-primary">Liste</a> 
</div> 
<div class="container">
	<div class="form-card">
  <h3>Créer un professeur</h3> 

  <form method="post" action="">
    <div class="form-group">
      <input type="text" name="nom" placeholder="Nom" required>
      <input type="text" name="prenom" placeholder="Prénom" required>
    </div>

    <br>

    <input type="text" name="filiere" placeholder="Numero de telephone" required>

    <br><br>

    <button type="submit" class="btn btn-primary" style="width:100%">
      Enregistrer
    </button>
  </form>
</div>
</div>
</body>
</html>