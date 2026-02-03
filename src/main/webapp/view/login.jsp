<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="">
<head>
  <meta charset="UTF-8">
  <title>Login page</title>
  <style type="text/css">
    h2{
      padding: 0;
      margin: 0;
    }
    p{
      padding: 0;
      margin: 0;
    }
    body{
      margin: 0;
      padding: 0;
      font-family: 'Poppins', sans-serif;
      min-height: 100vh;
      background: linear-gradient(
        to bottom,
        rgba(13, 59, 102, 0.05),
        rgba(13, 59, 102, 0)
      );

    }

    label{
      display: flex;
      flex-direction: column;
      gap: 10px;
    }
    input{
      padding: 14px;
      border-radius: 10px;
      border: 1px solid #ccc;
    }
    input:focus{
      border-color: #0d3b66;
    }
    .containerParent{
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      width: 100%;
      height: 100%;
    }
    .btnPart{
      border: 1px solid #0d3b66;
      cursor: pointer;
      display: flex;
      justify-content: center;
      border-radius: 10px;
      background-color: #0d3b66;
      color: #ffffff;
      padding: 13px;
      font-weight: bold;
      font-size: 18px;
    }
    .btnPart:hover{
      border: 1px solid #0d3b66;
      background-color: #ffffff;
      color: #0d3b66;
    }
    .loginParent{
      gap: 20px;
      display: flex;
      flex-direction: column;
      width: 400px;
      height: 500px;
      justify-content: center;
      align-content: center;


    }
    .inputPart{
      display: flex;
      flex-direction: column;
      gap: 10px;
    }
    .labelDescrp{
      text-align: center;
      font-size: 15px;
      font-weight: inherit;
      color: #888888;
         }
    form{
      display: flex;
      flex-direction: column;
      gap: 20px;
    }
  </style>
 
</head>
<body>
<div class="containerParent">
  <div class="loginParent"> 
    <div style="text-align: center;"> 
      <h2 style="color:#00031e;">Connexion</h2>
      <p class="labelDescrp" style="padding-top: 5px; font-weight: 300">Entrez vos identifiants pour vous connecter</p>
    </div>
    <form action="${pageContext.request.contextPath}/ControllerConnexion" method="post">
      <div class="inputPart">
        <label>
          <div>Email <span style="color: red;">*</span></div>
          <input required="required" placeholder="Entrer votre email" type="email" name="email"> 
        </label>
        <label>
          <div>Mot de passe <span style="color: red;">*</span></div> 
          <input required="required" placeholder="Entrer votre mot de passe" type="password" name="password"> 
        </label>
      </div>
      <button class="btnPart" type="submit">Se connecter</button>

    </form>

  </div>
</div>
</body>
</html>
