<%-- 
    Document   : agregarCandidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

<%@page import="logic.Entrevista"%>
<%@page import="logic.Candidato"%>
<%@page import="java.util.ArrayList"%>
<%@page import="logic.Empleado"%>
<%@page import="logic.DBHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="EstiloGeneral.css" />
<html>
    <head>
        <title>Agregar entrevistas</title>
    </head>
    <body background="oficina2.jpg" width="100%">
        <%@ include file="/menu.jsp"  %>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <br><br>
    <center>
        <!-- Formulario en forma de tabla para separar en columnas y renglones -->
        <table style="width:100%" >
            <%
                String sEmpID = request.getParameter("empId");
                String sCandID = request.getParameter("candId");
                String sFechaID = request.getParameter("fechaId");
                String sFeedbackID = request.getParameter("feedbackId");
                Entrevista ent = DBHandler.obtenerEntrevista(sEmpID, sCandID, sFechaID, sFeedbackID);
                if (ent != null) {
            %>
            <h3  class="mensajeTop">Datos de la Entrevista</h3>

            <form action= "modificarEntrevistaList" method="post"> 
                Entrevistador:
                <select name="entrevistadorID" style="background:transparent; width:325px; height:40px; font-size:18px; position:relative; left:51px;">
                    <%
                        ArrayList<Empleado> emps = DBHandler.obtenerEmpleados();
                        for (int i = 0; i < emps.size(); i++) {
                    %>
                    <option value="<%= emps.get(i).getsID()%>"> <%= emps.get(i).getsNombreCompleto()%> </option>

                    <% } %>
                </select>
                <br> <br>
                Entrevistado:
                <select name="entrevistadoID" style="background:transparent; width:325px; height:40px; font-size:18px; position:relative; left:51px;" >
                    <%
                        ArrayList<Candidato> cands = DBHandler.obtenerCandidatos();
                        for (int i = 0; i < cands.size(); i++) {
                    %>
                    <option value="<%= cands.get(i).getsID()%>"> <%= cands.get(i).getsNombreCompleto()%> </option>

                    <% }%>
                </select>
                <br> <br>
                Fecha:
                <input type="date" placeholder="Fecha" name="fecha" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; left:53px;" value="<%= ent.getsFecha() %>">
                <br> <br>
                Plataforma:
                <input type="text" placeholder="Plataforma" name="plataforma" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; 
                       left:21px;" value="<%= ent.getsPlataforma()%>">
                <br> <br>
                Feedback:
                <input type="text" placeholder="Retroalimenacion de la entrevista" name="feedback" style=" background:transparent; width:300px; height:40px; font-size:18px; position:relative; 
                       left:23px;" value="<%= ent.getsFeedback()%>">
                <br> <br>
                <br> <br>
                
                <input type="text" name="oldEMPID" value="<%= sEmpID %>" hidden>
                <input type="text" name="oldCANDID" value="<%= sCandID %>" hidden>
                <input type="text" name="oldFECHAID" value="<%= sFechaID %>" hidden>
                <input type="text" name="oldFEEDBACKID" value="<%= sFeedbackID %>" hidden>
                <input type ="submit" class="myButton"value="Modificar" /> 
            </form> 
            <form action= "entrevistas.jsp"> 
                <input type ="submit" class="myButton" value="Regresar" /> 
            </form>
                <% } else { %>
                <tr> Entrevista no encontrada </tr> <br><br>
                <% } %>
        </table>
        <img src="cuadro.png" width="640px" height ="550px" style="top: 0px; position: absolute; z-index: -1; left: 220px"></img>
    </center>

</body>
</html>
