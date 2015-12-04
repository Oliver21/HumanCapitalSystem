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
        <div id="table2">

            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            <table style="width:100%" align="center" border="0" cellspacing="0" cellpadding="20">
			
				<!-- Titulo de la pagina -->
				<tr class="tituloCandRenglon"><td>Modificación de empleado</td></tr>
			
                <%
                    String sID = request.getParameter("empId");
                    Empleado emp = DBHandler.obtenerEmpleado(sID);
                    if (emp != null) {
                %>
                <form action="modificarEmpleadoList" method="post">
                    <tr class="candRenglon">
                        <input type="text" name="empId" value="<%= emp.getsID() %>" hidden>
                        <td align="right">
                            Nombre completo:
                            <input type="text" name="nombre" required style="width: 350px;" value="<%= emp.getsNombreCompleto() %>">
                            <br>
                            <br>
                            Domicilio:
                            <input type="text" name="domicilio" required style="width: 350px;" value="<%= emp.getsDomicilio()%>">
                            <br>
                            <br>
                            Telefono:
                            <input type="tel" name="telefono" style="width: 350px;" value="<%= emp.getsTelefono()%>">
                            <br>
                            <br>
                            Correo Electronico:
                            <input type="email" name="correo" required style="width: 350px;" value="<%= emp.getsCorreoElectronico()%>">
                            <br>
                            <br>
                            Titulo Profesional:
                            <input type="text" name="titulo" style="width: 350px;" value="<%= emp.getsTituloProfesional() %>">
                            <br>
                            <br>
                            Universidad:
                            <input type="text" name="universidad" style="width: 350px;" value="<%= emp.getsUniversidad()%>">
                            <br>
                            <br>
                            Certificados:
                            <input type="text" name="certificado" style="width: 350px;" value="<%= emp.getsCertificados()%>">
                            <br>
                            <br>
                            Trabajos anteriores:
                            <input type="text" name="trabajos" multiple style="width: 350px; height: 80px" value="<%= emp.getsTrabajosAnteriores()%>">
                            <br>
                            <br>
                            Expectativas economicas:
                            <input type="number" name="economico" style="width: 350px;" min="0" max ="99999999" value="<%= emp.getsExpectativas()%>">
                            <br>
                            <br>
                            Puesto:
                            <input type="text" name="puesto" style="width: 350px;" min="0" max ="99999999" value="<%= emp.getsPuesto()%>">
                            <br>
                            <br>
                            Salario:
                            <input type="number" name="salario" style="width: 350px;" min="0" max ="99999999" value="<%= emp.getsSalario()%>">
                            <br>
                            <br>
                            Dias de vacaciones:
                            <input type="number" name="diasvacaciones" style="width: 350px;" min="0" max ="99999999" value="<%= emp.getsDiasVacaciones() %>">
                            <br>
                            <br>
                            <input type="submit" value="Modificar">

                        </td>

                    </tr>

                </form>
                <% } else {%>
                <tr class="candRenglon"> Empleado no encontrado </tr> <br><br>
                <% } %>

                <td align="center">
                    <br> <br>
                    <form action="modificarEmpleados.jsp">
                        <center><input type="submit" class="myButton" value="Regresar"></center>
                    </form>
                </td>

            </table>
        </div>
    </body>
</html>
