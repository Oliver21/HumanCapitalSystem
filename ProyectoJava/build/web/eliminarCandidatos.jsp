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
            <h1> <center> Eliminación de Candidatos </center> </h1>

            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            <table style="width:140%" >
                <br>
                <br>
                <tr>
                    <td> Nombre </td>
                    <td> Email </td>
                    <td> Titulo profesional </td>
                    <td> Universidad </td>
                    <td> Expectativas economicas </td>
                    <td> Eliminar </td>
                </tr>
                <%

                    ServletContext context = getServletContext();
                    String relativePath = config.getInitParameter("relativePathToFile");
                    String path = context.getRealPath(relativePath);
                    ArrayList<Candidato> cands = DBHandler.obtenerCandidatos();
                    for (int i = 0; i < cands.size(); i++) {
                %>
                <tr> 
                    <td> <%= cands.get(i).getsNombreCompleto()%> </td>
                    <td> <%= cands.get(i).getsCorreoElectronico()%> </td>
                    <td> <%= cands.get(i).getsTituloProfesional()%> </td>
                    <td> <%= cands.get(i).getsUniversidad()%> </td>
                    <td> $<%= cands.get(i).getsExpectativas()%> </td>
                    <td>
                        <form action="eliminarCandidatoList" method="post">
                            <input type="text" name="candId" value="<%= cands.get(i).getsID()%>" hidden>
                            <input type="submit" value="Eliminar">
                        </form>
                    </td>
                </tr>

                <%}%>
            </table>
            <table style="width:140%">
                <tr>
                    <td align="center">
                        <br> <br>
                        <form action="candidatos.jsp">
                            <input type="submit" value="Regresar">
                        </form>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
