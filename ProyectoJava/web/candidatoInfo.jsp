<%-- 
    Document   : candidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

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
        <title>Candidatos</title>
    </head>
    <body>
        <%@ include file="/menu.jsp"  %>
        <div class="titulo">Human Capital</div><br>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table2" >
            <!-- Titulo de la pagina -->
            <table style="width:100%" align="center" border="0" cellspacing="0" cellpadding="20">

                <tr class="tituloCandRenglon"><td>Informacion detallada de candidato</td></tr>
                <%  String sID = request.getParameter("candId");
                    Candidato cand = DBHandler.obtenerCandidato(sID);
                    if (cand == null) { %>

                <% } else {%> 
                <tr class="candRenglon"> <td><br>Nombre: <%= cand.getsNombreCompleto()%></td></tr> 
                <tr class="candRenglon"> <td> Domicilio: <%= cand.getsDomicilio()%>  </td></tr>
                <tr class="candRenglon"> <td> Telefono: <%= cand.getsTelefono()%> </td></tr>
                <tr class="candRenglon"> <td> Correo electronico: <%= cand.getsCorreoElectronico()%> </td> </tr>
                <tr class="candRenglon"> <td> Titulo profesional: <%= cand.getsTituloProfesional()%> </td> </tr>
                <tr class="candRenglon"> <td> Universidad: <%= cand.getsUniversidad()%> </td> </tr>
                <tr class="candRenglon"> <td> Certificados: <%= cand.getsCertificados()%> </td> </tr>
                <tr class="candRenglon"> <td> Trabajos anteriores: <%= cand.getsTrabajosAnteriores()%> </td> </tr>
                <tr class="candRenglon"> <td> Expectativas economicas: $<%= cand.getsExpectativas()%> </td> </tr>

                <% }%>

                <tr class="candRenglon"><td><form action="/ProyectoJava/candidatos.jsp">
                            <center><input type="submit" class="myButton" value="Regresar"></center>
                        </form></td></tr>

            </table>
        </div>
    </body>
    <script>
        <%
            if (cand == null) {
        %>
        alert('Advertencia: Esta intentando acceder a la informacion de un candidato inexistente.');
        <% }%>
    </script>
</html>
