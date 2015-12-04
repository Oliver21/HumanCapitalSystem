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
        <title>Entrevistas</title>
    </head>
    <body>
        <%@ include file="/menu.jsp"  %>
		<div class="titulo">Human Capital</div><br>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table2" >

            <table style="width:70%" align="center" border="0" cellspacing="0" cellpadding="20" >
			
				<tr class="tituloCandRenglon"><td>Informacion detallada de Entrevista</td></tr>
				
                <%  
                    String sEmpID = request.getParameter("empId");
                    String sCandID = request.getParameter("candId");
                    String sFechaID = request.getParameter("fechaId");
                    String sFeedbackID = request.getParameter("feedbackId");
                    Entrevista ent = DBHandler.obtenerEntrevista(sEmpID, sCandID, sFechaID, sFeedbackID);
                    if (ent == null) {
                %>
                <tr class="candRenglon"> Entrevista no encontrada </tr> <br><br>

                <% } else {%> 
                <tr class="candRenglon"> <td>Entrevistador: <%= ent.getEmpEmpleado().getsNombreCompleto() %> </td> </tr>
                <tr class="candRenglon"> <td>Entrevistado: <%= ent.getCandCandidato().getsNombreCompleto() %> </td> </tr>
                <tr class="candRenglon"> <td>Fecha: <%= ent.getsFecha() %> </td> </tr>
                <tr class="candRenglon"> <td>Plataforma: <%= ent.getsPlataforma() %> </td> </tr>
                <tr class="candRenglon"> <td>Feedback: <%= ent.getsFeedback() %> </td> </tr>
                

                <% }%>
                <tr class="candRenglon"><td><form action="/ProyectoJava/entrevistas.jsp">
					<center><input type="submit" class="myButton" value="Regresar"></center>
                </form></td></tr>
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
