<%-- 
    Document   : agregarCandidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

<%@page import="logic.Candidato"%>
<%@page import="java.util.ArrayList"%>
<%@page import="logic.Empleado"%>
<%@page import="logic.DBHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="EstiloAgregarCandidatos.css" />
<html>
    <%@ include file="/menu.jsp"  %>
    <head>
        <title>Agregar entrevistas</title>
    </head>
    <body background="oficina2.jpg" width="100%">
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <br><br>
    <center>
       <div style="position:absolute; left:480px; top:0px;"> 

        <!-- Formulario en forma de tabla para separar en columnas y renglones -->

        <br><br><br>
        <h3  class="mensajeTop">Datos de la Entrevista</h3>

        <form action= "agregarEntrevistaList" method="post"> 
            Entrevistador:
            <select name="entrevistadorID" style="background:transparent; width:325px; height:40px; font-size:18px; position:relative; left:51px;">
                <%
                    ArrayList<Empleado> emps = DBHandler.obtenerEmpleados();
                    for(int i=0; i < emps.size(); i++){
                %>
                <option value="<%= emps.get(i).getsID() %>"> <%= emps.get(i).getsNombreCompleto() %> </option>
                
                <% } %>
            </select>
            <br> <br>
            Entrevistado:
            <select name="entrevistadoID" style="background:transparent; width:325px; height:40px; font-size:18px; position:relative; left:51px;">
                <%
                    ArrayList<Candidato> cands = DBHandler.obtenerCandidatos();
                    for(int i=0; i < cands.size(); i++){
                %>
                <option value="<%= cands.get(i).getsID() %>"> <%= cands.get(i).getsNombreCompleto() %> </option>
                
                <% } %>
            </select>
            <br> <br>
            Fecha:
            <input type="date" placeholder="Fecha" name="fecha" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; left:53px;">
            <br> <br>
            Plataforma:
            <input type="text" placeholder="Plataforma" name="plataforma" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; 
                   left:21px;">
            <br> <br>
            Feedback:
            <input type="text" placeholder="Retroalimenacion de la entrevista" name="feedback" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; 
                   left:23px;">
            <br> <br>
            <br> <br>
            <input type ="submit" class="myButton"value="Agregar" /> 
        </form> 
        <form action= "entrevistas.jsp"> 
            <input type ="submit" class="myButton" value="Regresar" /> 
        </form>
        </div>
            <img  id="cuadro" src="cuadro.png" width="640px" height ="650px" style="top:-30px; left:390px;"></img>
    </center>

</body>
</html>
