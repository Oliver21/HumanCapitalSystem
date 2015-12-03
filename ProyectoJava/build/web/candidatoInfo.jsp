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
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table1" >
            <!-- Titulo de la pagina -->
            <h1> <center> Informacion detallada de candidato </center> </h1>
            <table style="width:140%" >

                <%  String sID = request.getParameter("candId");
                    Candidato cand = DBHandler.obtenerCandidato(sID);
                    if (cand == null) {
                %>
                <tr> Candidato no encontrado </tr> <br><br>

                <% } else {%> 
                <tr> Nombre: <%= cand.getsNombreCompleto()%> </tr> <br><br>
                <tr> Domicilio: <%= cand.getsDomicilio()%> </tr><br><br>
                <tr> Telefono: <%= cand.getsTelefono()%> </tr><br><br>
                <tr> Correo electronico: <%= cand.getsCorreoElectronico()%> </tr><br><br>
                <tr> Titulo profesional: <%= cand.getsTituloProfesional()%> </tr><br><br>
                <tr> Universidad: <%= cand.getsUniversidad()%> </tr><br><br>
                <tr> Certificados: <%= cand.getsCertificados()%> </tr><br><br>
                <tr> Trabajos anteriores: <%= cand.getsTrabajosAnteriores()%> </tr><br><br>
                <tr> Expectativas economicas: $<%= cand.getsExpectativas()%> </tr><br><br>

                <% }%>
                <form action="/ProyectoJava/candidatos.jsp">
                    <input type="submit" value="Regresar">
                </form>
            </table>
        </div>
    </body>
</html>
