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
        <div class="titulo">Human Capital</div><br>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table2" >

            <table style="width:100%" align="center" border="0" cellspacing="0" cellpadding="20">

                <!-- Titulo de la pagina -->
                <tr class="tituloCandRenglon"><td>Informacion detallada de empleado</td></tr>

                <%  String sID = request.getParameter("empId");
                    Empleado emp = DBHandler.obtenerEmpleado(sID);
                    if (emp == null) {
                %>
                <tr class="candRenglon">  Empleado no encontrado </tr> <br><br>

                <% } else {%> 
                <tr class="candRenglon"> <td>Nombre: <%= emp.getsNombreCompleto()%></td> </tr>
                <tr class="candRenglon"> <td>Domicilio: <%= emp.getsDomicilio()%> </td></tr>
                <tr class="candRenglon"> <td>Telefono: <%= emp.getsTelefono()%> </td></tr>
                <tr class="candRenglon"> <td>Correo electronico: <%= emp.getsCorreoElectronico()%> </td></tr>
                <tr class="candRenglon"> <td>Titulo profesional: <%= emp.getsTituloProfesional()%> </td></tr>
                <tr class="candRenglon"> <td>Universidad: <%= emp.getsUniversidad()%> </td></tr>
                <tr class="candRenglon"> <td>Certificados: <%= emp.getsCertificados()%> </td></tr>
                <tr class="candRenglon"> <td>Trabajos anteriores: <%= emp.getsTrabajosAnteriores()%> </td></tr>
                <tr class="candRenglon"> <td>Expectativas economicas: $<%= emp.getsExpectativas()%> </td></tr>
                <% }%>
                <tr class="candRenglon"><td><form action="/ProyectoJava/empleados.jsp">
                            <center><input type="submit" class="myButton" value="Regresar"></center>
                        </form></td></tr>
            </table>
        </div>
    </body>
</html>
