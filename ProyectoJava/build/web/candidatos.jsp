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
                    <form action="agregarCandidatos.jsp" method="post">
                        <input type="submit" class="myButton" value="Agregar candidatos">
                    </form></td>
                <td><form action="modificarCandidatos.jsp" method="post">
                        <input type="submit" class="myButton" value="Modificar candidatos">
                    </form></td>
                <td><form action="eliminarCandidatos.jsp" method="post">
                        <input type="submit" class="myButton" value="Eliminar candidatos">
                    </form></td>
            </tr>
        </table>
    </center>
    <br>

    <div id="table1" >			
        <!-- Formulario en forma de tabla para separar en columnas y renglones -->
        <table border="0" cellspacing="0" cellpadding="6" width="765px">
            <tr class="tituloCandRenglon">
                <td> Nombre </td>
                <td> Email </td>
                <td> Titulo profesional </td>
                <td> Universidad </td>
                <td> Expectativas economicas </td>
                <td> Inspeccionar </td>
            </tr>
            <%
                ArrayList<Candidato> cands = DBHandler.obtenerCandidatos();
                for (int i = 0; i < cands.size(); i++) {
            %>
            <tr class="candRenglon"> 
                <td> <%= cands.get(i).getsNombreCompleto()%> </td>
                <td> <%= cands.get(i).getsCorreoElectronico()%> </td>
                <td> <%= cands.get(i).getsTituloProfesional()%> </td>
                <td> <%= cands.get(i).getsUniversidad()%> </td>
                <td> $<%= cands.get(i).getsExpectativas()%> </td>
                <td>
                    <form action="candidatoInfo.jsp" method="POST">
                        <input type="text" name="candId" value="<%= cands.get(i).getsID()%>" hidden>
                        <input type="submit" value="Inspeccionar">
                    </form>
                </td>
            </tr>

            <%}%>
        </table>
    </div>
</body>
</html>
