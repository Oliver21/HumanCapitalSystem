<%-- 
    Document: login
    
Created on : Dic 02, 2015, 11:50:29 PM
    Author     : Oliver
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<link rel="stylesheet" type="text/css" href="loginStyle.css" />
<head> 
	<title>HumanCapital</title> 
</head>

<body background="oficina2.jpg"> 
<center>
<div class="titulo">Human Capital System</div>
<br><br>
<h3  class="mensajeTop">Introduzca su ususario y contrasena:</h3>
<img  id="cuadro" src="cuadro.png" width="400px" height ="215px"></img>
<form> 
<input type="text" placeholder="Email" name="email" style=" background:transparent; width:300px; height:40px; font-size:18px;">
<br> <br>
<input type="password" placeholder="Contrasena" name="password" style=" background:transparent; width:300px; height:40px; font-size:18px;">
<br> <br> <br> <br>
<input type ="submit" class="myButton"value="Iniciar Sesion" /> 
</form> 
<form> 
<input type ="submit" class="myButton" value="Registrarse" /> 
</form>
</center>
</body>
</html>