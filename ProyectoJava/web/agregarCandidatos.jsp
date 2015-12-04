<%-- 
    Document   : agregarCandidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="EstiloAgregarCandidatos.css" />
<html>
  <%@ include file="/menu.jsp"  %>
    <head>
        <title>Agregar candidatos</title>
    </head>
    <body background="oficina2.jpg" width="100%">
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <br><br>
        <center>
        <!-- Formulario en forma de tabla para separar en columnas y renglones -->
     <div style="position:absolute; left:480px; top:0px;">
        <br><br><br>
        <h3  class="mensajeTop">Datos del Candidato</h3>
        
        <form action= "agregarCandidatoList" method="post"> 
            Nombre Completo:
            <input type="text" placeholder="Nombre Completo" name="nombre" required style=" background:transparent; width:300px; height:40px; font-size:18px; 
                   position:relative; left:23px;">
            <br> <br>
            Domicilio:
            <input type="text" placeholder="Domicilio" name="domicilio" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; left:51px;">
            <br> <br>
            Telefono:
            <input type="tel" placeholder="Telefono" name="telefono" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; left:53px;">
            <br> <br>
            Correo Electrónico:
            <input type="email" placeholder="Correo electronico" name="correo" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; 
                   left:21px;">
            <br> <br>
            Titulo Profesional:
            <input type="text" placeholder="Titutlo Profesional" name="titulo" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; 
                   left:23px;">
            <br> <br>
            Universidad:
            <input type="text" placeholder="Universidad" name="universidad" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; 
                   left:40px;">
            <br> <br>
            Certificados:
            <input type="text" placeholder="Certificados" name="certificado" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; 
                   left:40px;">
            <br> <br>
            Trabajos anteriores:
            <input type="text" placeholder="Trabajos" name="trabajos" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; left:18px;">
            <br> <br>
            Expectativas económicas:
            <input type="number" placeholder="Salario mensual" name="economico" style=" background:transparent; width:300px; height:40px; font-size:18px;">
            <br> <br> <br> <br>
            <input type ="submit" class="myButton"value="Agregar" /> 
        </form> 
        <form action= "candidatos.jsp"> 
            <input type ="submit" class="myButton" value="Regresar" /> 
        </form>
        </div>
    <img  id="cuadro" src="cuadro.png" width="740px" height ="950px" style="top:-30px; left:350px;"></img>
    </center>

</body>
</html>
