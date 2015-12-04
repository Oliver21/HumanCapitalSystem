<%-- 
    Document   : agregarCandidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

<%@page import="logic.Empleado"%>
<%@page import="logic.Candidato"%>
<%@page import="logic.DBHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="EstiloGeneral.css" />
<html>
    <head>
        <title>Modificar candidato</title>
    </head>
    <body>
        <%@ include file="/menu.jsp"  %>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table1">
            <!-- Titulo de la pagina -->
            <h1 align="right">  Modificación de candidato </h1>

            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            <table style="width:140%" >
                <%
                    String sID = request.getParameter("empId");
                    Empleado emp = DBHandler.obtenerEmpleado(sID);
                    if (emp != null) {
                %>
                <form action="modificarEmpleadoList" method="post">
                    <tr>
                        <input type="text" name="empId" value="<%= emp.getsID() %>" hidden>
                        <td align="right">
                            Nombre completo:
                            <input type="text" name="nombre" required style="width: 500px;" value="<%= emp.getsNombreCompleto() %>">
                            <br>
                            <br>
                            Domicilio:
                            <input type="text" name="domicilio" required style="width: 500px;" value="<%= emp.getsDomicilio()%>">
                            <br>
                            <br>
                            Telefono:
                            <input type="tel" name="telefono" style="width: 500px;" value="<%= emp.getsTelefono()%>">
                            <br>
                            <br>
                            Correo Electronico:
                            <input type="email" name="correo" required style="width: 500px;" value="<%= emp.getsCorreoElectronico()%>">
                            <br>
                            <br>
                            Titulo Profesional:
                            <input type="text" name="titulo" style="width: 500px;" value="<%= emp.getsTituloProfesional() %>">
                            <br>
                            <br>
                            Universidad:
                            <input type="text" name="universidad" style="width: 500px;" value="<%= emp.getsUniversidad()%>">
                            <br>
                            <br>
                            Certificados:
                            <input type="text" name="certificado" style="width: 500px;" value="<%= emp.getsCertificados()%>">
                            <br>
                            <br>
                            Trabajos anteriores:
                            <input type="text" name="trabajos" multiple style="width: 500px; height: 80px" value="<%= emp.getsTrabajosAnteriores()%>">
                            <br>
                            <br>
                            Expectativas economicas:
                            <input type="number" name="economico" style="width: 500px;" min="0" max ="99999999" value="<%= emp.getsExpectativas()%>">
                            <br>
                            <br>
                            Puesto:
                            <input type="text" name="puesto" style="width: 500px;" min="0" max ="99999999" value="<%= emp.getsPuesto()%>">
                            <br>
                            <br>
                            Salario:
                            <input type="number" name="salario" style="width: 500px;" min="0" max ="99999999" value="<%= emp.getsSalario()%>">
                            <br>
                            <br>
                            Dias de vacaciones:
                            <input type="number" name="diasvacaciones" style="width: 500px;" min="0" max ="99999999" value="<%= emp.getsDiasVacaciones() %>">
                            <br>
                            <br>
                            <input type="submit" value="Modificar">

                        </td>

                    </tr>

                </form>
                <% } else {%>
                <tr> Empleado no encontrado </tr> <br><br>
                <% } %>

                <td align="center">
                    <br> <br>
                    <form action="modificarEmpleados.jsp">
                        <input type="submit" value="Regresar">
                    </form>
                </td>

            </table>
        </div>
    </body>
</html>
