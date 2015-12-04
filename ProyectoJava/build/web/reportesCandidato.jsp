<%-- 
    Document   : candidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

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
    <body background="oficina2.jpg"">

        <!-- Titulo de la pagina -->
        <div class="titulo">Reporte de Entrevistas</div><br>

        <%@ include file="/menu.jsp"  %>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <!-- moved -->
    <center>
        <div >
            <!-- Titulo de la pagina -->
            <h1 align="right">  Filtros Candidato </h1>

            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            <table>
                
                <form action="reportesFiltroCandidato.jsp" method="post">
                    <tr>
                        <td align="left">
                            Titulo profesional:
                            <input type="text" name="titulo" style="width: 500px;">
                            Universidad:
                            <input type="text" name="universidad" style="width: 500px;">
                            <br>
                            <br>
                            Certificados:
                            <input type="text" name="certificados" style="width: 500px;">
                            Entrevistador:
                            <select name="empleado" style="width:325px; height:18px; font-size:12px; position:relative; left:0px;">
                                <option value="CONST_BLANK"> </option> 
                                <%
                                    ArrayList<Empleado> emps = DBHandler.obtenerEmpleados();
                                    for (int i = 0; i < emps.size(); i++) {
                                %>
                                <option value="<%= emps.get(i).getsID()%>"> <%= emps.get(i).getsNombreCompleto()%> </option>

                                <% } %>
                            </select>
                            <br>
                            <br>
                            <input type="text" name="puesto" style="width: 500px;" hidden>
                            <br>
                            <br>
                            <input type="submit" value="Filtrar">

                        </td>

                    </tr>

                </form>

            </table>

        </div>
    </center>
    <br>

    <br><br><br><br><br><br><br><br><br>
    <div id="table1" style="top: 225px">			
        <!-- Formulario en forma de tabla para separar en columnas y renglones -->
        <div id="table1" >			
        <!-- Formulario en forma de tabla para separar en columnas y renglones -->
        <table border="0" cellspacing="0" cellpadding="6" width="765px">
            <tr class="tituloCandRenglon">
                    <td> Entrevistador </td>
                    <td> Entrevistado </td>
                    <td> Fecha </td>
                    <td> Plataforma </td>
            </tr>
            <%
                ArrayList<Entrevista> ents = DBHandler.obtenerEntrevistas();
                for (int i = 0; i < ents.size(); i++) {
            %>
            <tr class="candRenglon"> 
                    <td> <%= ents.get(i).getEmpEmpleado().getsNombreCompleto() %> </td>
                    <td> <%= ents.get(i).getCandCandidato().getsNombreCompleto() %> </td>
                    <td> <%= ents.get(i).getsFecha() %> </td>
                    <td> <%= ents.get(i).getsPlataforma() %> </td>
                </tr>

            <%}%>
        </table>
    </div>
</body>
</html>
