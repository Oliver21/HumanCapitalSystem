<%-- 
    Document   : candidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

<%@page import="logic.ReporteFiltro"%>
<%@page import="logic.Entrevista"%>
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
        <title>Candidatos</title>
    </head>
    <body background="oficina2.jpg">

        <!-- Titulo de la pagina -->
        <div class="titulo">Reporte de Entrevistas</div><br>

        <%@ include file="/menu.jsp"  %>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <!-- moved -->
    <center>
        <div >
            <!-- Titulo de la pagina -->
            <%
                String sTitulo = request.getParameter("titulo");
                String sUniversidad = request.getParameter("universidad");
                String sCertificados = request.getParameter("certificados");
                String sEmpleado = request.getParameter("empleado");
                String sPuesto = request.getParameter("puesto");
                
                ReporteFiltro rf = new ReporteFiltro(sTitulo, sUniversidad, sCertificados, sEmpleado, sPuesto);
                ArrayList<Entrevista> ents = DBHandler.obtenerFiltroEmpleados(rf);
                
                %>
            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            

        </div>
    </center>
    <br>

    <br><br><br><br><br><br><br><br><br>
    <div id="table1" style="top: 25px">			
        <!-- Formulario en forma de tabla para separar en columnas y renglones -->
        <div id="table1" >			
        <!-- Formulario en forma de tabla para separar en columnas y renglones -->
        <table border="0" cellspacing="0" cellpadding="6" width="765px">
            <tr class="tituloCandRenglon">
                    <td> Entrevistador </td>
                    <td> Entrevistado </td>
                    <td> Fecha </td>
                    <td> Plataforma </td>
                    <td> Inspeccionar </td>
            </tr>
            <%
                
                for (int i = 0; i < ents.size(); i++) {
            %>
            <tr class="candRenglon"> 
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
