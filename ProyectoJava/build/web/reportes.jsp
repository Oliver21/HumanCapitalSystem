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
        <title>Reportes</title>
    </head>
    <body background="oficina2.jpg">

        <!-- Titulo de la pagina -->
        <div class="titulo">Registro de Candidatos</div><br>

        <%@ include file="/menu.jsp"  %>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <!-- moved -->
    <center>
        <table class="botonesArriba" width="815px">
            <tr>
                <td>
                    <form action="reportesCandidato.jsp" method="post">
                        <input type="submit" class="myButton" value="Reportes candidatos">
                    </form></td>
                <td><form action="reportesEmpleado.jsp" method="post">
                        <input type="submit" class="myButton" value="Reportes empleados">
                    </form></td>
            </tr>
        </table>
    </center>
    <br>

</body>
</html>
