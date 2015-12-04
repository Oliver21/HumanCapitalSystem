<%-- 
    Document   : candidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

<%@page import="logic.Entrevista"%>
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
            <h1> <center> Informacion detallada de Entrevista </center> </h1>
            <table style="width:140%" >

                <%  
                    String sEmpID = request.getParameter("empId");
                    String sCandID = request.getParameter("candId");
                    String sFechaID = request.getParameter("fechaId");
                    String sFeedbackID = request.getParameter("feedbackId");
                    Entrevista ent = DBHandler.obtenerEntrevista(sEmpID, sCandID, sFechaID, sFeedbackID);
                    if (ent == null) {
                %>
                <tr> Entrevista no encontrada </tr> <br><br>

                <% } else {%> 
                <tr> Entrevistador: <%= ent.getEmpEmpleado().getsNombreCompleto() %> </tr> <br><br>
                <tr> Entrevistado: <%= ent.getCandCandidato().getsNombreCompleto() %> </tr> <br><br>
                <tr> Fecha: <%= ent.getsFecha() %> </tr> <br><br>
                <tr> Plataforma: <%= ent.getsPlataforma() %> </tr> <br><br>
                <tr> Feedback: <%= ent.getsFeedback() %> </tr> <br><br>
                

                <% }%>
                <form action="/ProyectoJava/entrevistas.jsp">
                    <input type="submit" value="Regresar">
                </form>
            </table>
        </div>
    </body>
    <script>
        <%
            if (ent == null) {
        %>
        alert('Advertencia: Esta intentando acceder a la informacion de una entrevista inexistente.');
        <% }%>
    </script>
</html>
