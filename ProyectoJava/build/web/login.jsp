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
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
    <center>
        <div class="titulo">Human Capital System</div>
        <br><br>
        <h3  class="mensajeTop">Iniciar Sesion</h3>
        <h3  class="mensajeTop">Introduzca su ususario y contrasena:</h3>
        <form action="validateLogin" method="post"> 
            <input type="text" placeholder="Email" name="email" style=" background:transparent; width:300px; height:40px; font-size:18px;">
            <br> <br>
            <input type="password" placeholder="Contrasena" name="password" style=" background:transparent; width:300px; height:40px; font-size:18px;">
            <br> <br> <br> <br>
            <input type ="submit" class="myButton"value="Iniciar Sesion" /> 
        </form> 
        <form action="registro.jsp"> 
            <input type ="submit" class="myButton" value="Registrarse" /> 
        </form>
        <img  id="cuadro" src="cuadro.png" width="420px" height ="250px" style="top:-400px;"></img>
    </center>
</body>
</html>