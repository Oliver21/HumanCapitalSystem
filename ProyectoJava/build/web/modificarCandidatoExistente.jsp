<%-- 
    Document   : agregarCandidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

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
		<div class="titulo">Human Capital</div><br>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table2">
            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            <table style="width:100%" align="center" border="0" cellspacing="0" cellpadding="20">
                
				<!-- Titulo de la pagina -->
				<tr class="tituloCandRenglon"><td>Modificación de candidato</td></tr>
				
				<%
                    String sID = request.getParameter("candId");
                    Candidato cand = DBHandler.obtenerCandidato(sID);
                    if (cand != null) {
                %>
                <form action="modificarCandidatoList" method="post">
                    <tr class="candRenglon">
                        <input type="text" name="candId" value="<%= cand.getsID() %>" hidden>
                        <td align="right">
                            Nombre completo:
                            <input type="text" name="nombre" required style="width: 350px;" value="<%= cand.getsNombreCompleto() %>">
                            <br>
                            <br>
                            Domicilio:
                            <input type="text" name="domicilio" required style="width: 350px;" value="<%= cand.getsDomicilio()%>">
                            <br>
                            <br>
                            Telefono:
                            <input type="tel" name="telefono" style="width: 350px;" value="<%= cand.getsTelefono()%>">
                            <br>
                            <br>
                            Correo Electronico:
                            <input type="email" name="correo" required style="width: 350px;" value="<%= cand.getsCorreoElectronico()%>">
                            <br>
                            <br>
                            Titulo Profesional:
                            <input type="text" name="titulo" style="width: 350px;" value="<%= cand.getsTituloProfesional() %>">
                            <br>
                            <br>
                            Universidad:
                            <input type="text" name="universidad" style="width: 350px;" value="<%= cand.getsUniversidad()%>">
                            <br>
                            <br>
                            Certificados:
                            <input type="text" name="certificado" style="width: 350px;" value="<%= cand.getsCertificados()%>">
                            <br>
                            <br>
                            Trabajos anteriores:
                            <input type="text" name="trabajos" multiple style="width: 350px; height: 80px" value="<%= cand.getsTrabajosAnteriores()%>">
                            <br>
                            <br>
                            Expectativas economicas:
                            <input type="number" name="economico" style="width: 350px;" min="0" max ="99999999" value="<%= cand.getsExpectativas()%>">
                            <br>
                            <br>
                            <input type="submit" value="Modificar">
                        </td>
                    </tr>
                </form>
                <% } else {%>
                <tr class="candRenglon"> Candidato no encontrado </tr> <br><br>
                <% } %>

                <td align="center">
                    <br> <br>
                    <form action="modificarCandidatos.jsp">
                        <center><input type="submit" class="myButton" value="Regresar"></center>
                    </form>
                </td>

            </table>
        </div>
    </body>
</html>
