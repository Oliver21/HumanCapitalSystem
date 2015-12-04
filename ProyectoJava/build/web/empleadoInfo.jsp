<%-- 
    Document   : candidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

<%@page import="logic.Empleado"%>
<%@page import="logic.DBHandler"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.util.ArrayList"%>
<%@page import="logic.DBHandler"%>
<%@page import="logic.Candidato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="EstiloGeneral.css" />
<html>
    <head>
        <title>Empleados</title>
    </head>
    <body>
        <%@ include file="/menu.jsp"  %>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table1" >
            <!-- Titulo de la pagina -->
            <h1> <center> Informacion detallada de empleado </center> </h1>
            <table style="width:140%" >

                <%  String sID = request.getParameter("empId");
                    Empleado emp = DBHandler.obtenerEmpleado(sID);
                    if (emp == null) {
                %>
                <tr> Empleado no encontrado </tr> <br><br>

                <% } else {%> 
                <tr> Nombre: <%= emp.getsNombreCompleto()%> </tr> <br><br>
                <tr> Domicilio: <%= emp.getsDomicilio()%> </tr><br><br>
                <tr> Telefono: <%= emp.getsTelefono()%> </tr><br><br>
                <tr> Correo electronico: <%= emp.getsCorreoElectronico()%> </tr><br><br>
                <tr> Titulo profesional: <%= emp.getsTituloProfesional()%> </tr><br><br>
                <tr> Universidad: <%= emp.getsUniversidad()%> </tr><br><br>
                <tr> Certificados: <%= emp.getsCertificados()%> </tr><br><br>
                <tr> Trabajos anteriores: <%= emp.getsTrabajosAnteriores()%> </tr><br><br>
                <tr> Expectativas economicas: $<%= emp.getsExpectativas()%> </tr><br><br>

                <% }%>
                <form action="/ProyectoJava/empleados.jsp">
                    <input type="submit" value="Regresar">
                </form>
            </table>
        </div>
    </body>
    <script>
        <%
            if (emp == null) {
        %>
        alert('Advertencia: Esta intentando acceder a la informacion de un candidato inexistente.');
        <% }%>
    </script>
</html>
