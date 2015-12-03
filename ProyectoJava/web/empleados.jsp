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
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table1" >
            <!-- Titulo de la pagina -->
            <h1> <center> Registro de Empleados </center> </h1>

            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            <table style="width:140%" >

                <form action="agregarEmpleados.jsp" method="post">
                    <input type="submit" value="Agregar empleados">

                </form>
                <form action="modificarEmpleados.jsp" method="post">
                    <input type="submit" value="Modificar empleados">
                </form>
                <form action="eliminarEmpleados.jsp" method="post">
                    <input type="submit" value="Eliminar empleados">
                </form>
                <br>
                <br>
                <tr>
                    <td> Nombre </td>
                    <td> Email </td>
                    <td> Titulo profesional </td>
                    <td> Puesto </td>
                    <td> Salario </td>
                    <td> Inspeccionar </td>
                </tr>
                <%
                    ArrayList<Empleado> emps = DBHandler.obtenerEmpleados();
                    for (int i = 0; i < emps.size(); i++) {
                %>
                <tr> 
                    <td> <%= emps.get(i).getsNombreCompleto()%> </td>
                    <td> <%= emps.get(i).getsCorreoElectronico()%> </td>
                    <td> <%= emps.get(i).getsTituloProfesional()%> </td>
                    <td> <%= emps.get(i).getsPuesto()%> </td>
                    <td> $<%= emps.get(i).getsSalario()%> </td>
                    <td>
                        <form action="empleadoInfo.jsp" method="POST">
                            <input type="text" name="empId" value="<%= emps.get(i).getsID()%>" hidden>
                            <input type="submit" value="Inspeccionar">
                        </form>
                    </td>
                </tr>

                <%}%>
            </table>
        </div>
    </body>
</html>
