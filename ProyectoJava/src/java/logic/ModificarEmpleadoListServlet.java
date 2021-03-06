package logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tony
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ModificarEmpleadoListServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // get parameters from the request
        Empleado emp = new Empleado();
        emp.setsID(request.getParameter("empId"));
        emp.setsNombreCompleto(request.getParameter("nombre"));
        emp.setsDomicilio(request.getParameter("domicilio"));
        emp.setsTelefono(request.getParameter("telefono"));
        emp.setsCorreoElectronico(request.getParameter("correo"));
        emp.setsTituloProfesional(request.getParameter("titulo"));
        emp.setsUniversidad(request.getParameter("universidad"));
        emp.setsCertificados(request.getParameter("certificado"));
        emp.setsTrabajosAnteriores(request.getParameter("trabajos"));
        emp.setsExpectativas(request.getParameter("economico"));
        emp.setsSalario(request.getParameter("salario"));
        emp.setsPuesto(request.getParameter("puesto"));
        emp.setsDiasVacaciones(request.getParameter("diasvacaciones"));
        
        // use regular Java classes
        DBHandler.modificaEmpleado(emp);
        
        // forward request and response objects to JSP page
        String url = "/modificarEmpleados.jsp";
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
