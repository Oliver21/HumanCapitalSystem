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
        <h3  class="mensajeTop">Registro</h3>
        <h3  class="mensajeTop">Ingrese su correo y contrasena:</h3>
        
        <form action="registerCredentials" method="post"> 
            <input type="text" placeholder="Email" name="email" style=" background:transparent; width:300px; height:40px; font-size:18px;">
            <br> <br>
            <input type="password" placeholder="Contrasena" name="password" style=" background:transparent; width:300px; height:40px; font-size:18px;">
            <br> <br> <br> <br>
            <input type ="submit" class="myButton"value="Registrarse" /> 
        </form> 
        <form action="login.jsp"> 
            <input type ="submit" class="myButton" value="Regresar" /> 
        </form>
        <img  id="cuadro" src="cuadro.png" width="400px" height ="250px" style="top:-400px;"></img>
    </center>
</body>
</html>