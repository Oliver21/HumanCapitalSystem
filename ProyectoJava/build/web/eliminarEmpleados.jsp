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
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        
		<!-- Titulo de la pagina -->
		<div class="titulo">Eliminación de Empleados</div><br>
		
		<%@ include file="/menu.jsp"  %>
		
		<div id="table1" >

            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            <table border="0" cellspacing="0" cellpadding="6" width="765px" >
                <tr class="tituloCandRenglon">
                    <td> Nombre </td>
                    <td> Email </td>
                    <td> Titulo profesional </td>
                    <td> Universidad </td>
                    <td> Expectativas economicas </td>
                    <td> Eliminar </td>
                </tr>
                <%
                    ArrayList<Empleado> emps = DBHandler.obtenerEmpleados();
                    for (int i = 0; i < emps.size(); i++) {
                %>
                <tr class="candRenglon"> 
                    <td> <%= emps.get(i).getsNombreCompleto()%> </td>
                    <td> <%= emps.get(i).getsCorreoElectronico()%> </td>
                    <td> <%= emps.get(i).getsTituloProfesional()%> </td>
                    <td> <%= emps.get(i).getsUniversidad()%> </td>
                    <td> $<%= emps.get(i).getsExpectativas()%> </td>
                    <td>
                        <form action="eliminarEmpleadoList" method="post">
                            <input type="text" name="empId" value="<%= emps.get(i).getsID()%>" hidden>
                            <input type="submit" value="Eliminar">
                        </form>
                    </td>
                </tr>

                <%}%>
                <tr>
                    <td align="center">
                        <form action="empleados.jsp">
                            <center><input type="submit" class="myButton" value="Regresar"></center>
                        </form>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
