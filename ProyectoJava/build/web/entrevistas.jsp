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
<%@page import="logic.Entrevista"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="EstiloGeneral.css" />
<html>
    <head>
        <title>Entrevistas</title>
    </head>
    <body>
        <%@ include file="/menu.jsp"  %>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table1" >
            <!-- Titulo de la pagina -->
            <h1> <center> Registro de Entrevistas </center> </h1>

            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            <table style="width:140%" >

                <form action="agregarEntrevistas.jsp" method="post">
                    <input type="submit" value="Agregar entrevistas">

                </form>
                <form action="modificarEntrevistas.jsp" method="post">
                    <input type="submit" value="Modificar entrevistas">
                </form>
                <form action="eliminarEntrevistas.jsp" method="post">
                    <input type="submit" value="Eliminar entrevistas">
                </form>
                <br>
                <br>
                <tr>
                    <td> Entrevistador </td>
                    <td> Entrevistado </td>
                    <td> Fecha </td>
                    <td> Plataforma </td>
                    <td> Inspeccionar </td>
                </tr>
                <%
                    ArrayList<Entrevista> ents = DBHandler.obtenerEntrevistas();
                    for (int i = 0; i < ents.size(); i++) {
                %>
                <tr> 
                    <td> <%= ents.get(i).getEmpEmpleado().getsNombreCompleto() %> </td>
                    <td> <%= ents.get(i).getCandCandidato().getsNombreCompleto() %> </td>
                    <td> <%= ents.get(i).getsFecha() %> </td>
                    <td> <%= ents.get(i).getsPlataforma() %> </td>
                    <td>
                        <form action="entrevistaInfo.jsp" method="POST">
                            <input type="text" name="candId" value="<%= ents.get(i).getCandCandidato().getsID() %>" hidden>
                            <input type="text" name="empId" value="<%= ents.get(i).getEmpEmpleado().getsID() %>" hidden>
                            <input type="text" name="fechaId" value="<%= ents.get(i).getsFecha() %>" hidden>
                            <input type="text" name="feedbackId" value="<%= ents.get(i).getsFeedback()%>" hidden>
                            <input type="submit" value="Inspeccionar">
                        </form>
                    </td>
                </tr>

                <%}%>
            </table>
        </div>
    </body>
</html>
