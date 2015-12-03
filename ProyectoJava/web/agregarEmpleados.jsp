<%-- 
    Document   : agregarCandidatos
    Created on : Oct 29, 2015, 10:38:59 PM
    Author     : Tony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="EstiloGeneral.css" />
<html>
    <head>
        <title>Agregar empleados</title>
    </head>
    <body>
        <%@ include file="/menu.jsp"  %>
        <jsp:useBean id = "datos" scope= "session" class = "logic.DBHandler" />
        <div id="table1">
            <!-- Titulo de la pagina -->
            <h1 align="right">  Registro de Empleados </h1>

            <!-- Formulario en forma de tabla para separar en columnas y renglones -->
            <table style="width:140%" >

                <form action="agregarEmpleadoList" method="post">
                    <tr>
                        <td align="right">
                            Nombre completo:
                            <input type="text" name="nombre" required style="width: 500px;">
                            <br>
                            <br>
                            Domicilio:
                            <input type="text" name="domicilio" required style="width: 500px;">
                            <br>
                            <br>
                            Telefono:
                            <input type="tel" name="telefono" style="width: 500px;">
                            <br>
                            <br>
                            Correo Electronico:
                            <input type="email" name="correo" required style="width: 500px;">
                            <br>
                            <br>
                            Titulo Profesional:
                            <input type="text" name="titulo" style="width: 500px;">
                            <br>
                            <br>
                            Universidad:
                            <input type="text" name="universidad" style="width: 500px;">
                            <br>
                            <br>
                            Certificados:
                            <input type="text" name="certificado" style="width: 500px;">
                            <br>
                            <br>
                            Trabajos anteriores:
                            <input type="text" name="trabajos" multiple style="width: 500px; height: 80px">
                            <br>
                            <br>
                            Expectativas economicas:
                            <input type="number" name="economico" style="width: 500px;" min="0" max ="99999999">
                            <br>
                            <br>
                            Puesto:
                            <input type="text" name="puesto" style="width: 500px;">
                            <br>
                            <br>
                            Salario:
                            <input type="number" name="salario" style="width: 500px;" min="0" max ="99999999">
                            <br>
                            <br>
                            Dias de vacaciones:
                            <input type="number" name="diasvacaciones" style="width: 500px;" min="0" max ="99999999">
                            <br>
                            <br>
                            <input type="submit" value="Agregar">

                        </td>

                    </tr>

                </form>
                
                
                <td align="center">
                    <br> <br>
                    <form action="empleados.jsp">
                        <input type="submit" value="Regresar">
                    </form>
                </td>
                
            </table>
        </div>
    </body>
</html>
