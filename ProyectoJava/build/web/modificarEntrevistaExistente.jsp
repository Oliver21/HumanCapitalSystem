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
<link rel="stylesheet" type="text/css" href="EstiloAgregarCandidatos.css" />
<html>
    <head>
        <title>Agregar entrevistas</title>
    </head>
    <body background="oficina2.jpg" width="100%">
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <br><br>
    <center>
        <!-- Menu -->
        <a href="candidatos.jsp"><img src="add.png" id="imagen1" class="menu" width="50px" height="50px" title="Agregar candidato"></img></a>
        <a href="empleados.jsp"><img src="empleado.png" id="imagen2" class="menu" width="50px" height="50px" title="Agregar empleado" ></img></a>
        <a href="entrevistas.jsp"><img src="handshake2.png" id="imagen3" class="menu" width="50px" height="50px" title="Entrevistas"></img></a>
        <a href="reportes.jsp"><img src="reporte2.png" id="imagen4" class="menu" width="50px" height="50px" title="Reportes"></img></a>

        <br><br><br>
        <!-- Formulario en forma de tabla para separar en columnas y renglones -->
        <table style="width:140%" >
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
        <img  id="cuadro" src="cuadro.png" width="840px" height ="950px" style="top:-850px;"></img>
    </center>

</body>
</html>
