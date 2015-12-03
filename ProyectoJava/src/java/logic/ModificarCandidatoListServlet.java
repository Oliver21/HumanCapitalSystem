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

public class ModificarCandidatoListServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // get parameters from the request
        Candidato cand = new Candidato();
        cand.setsID(request.getParameter("candId"));
        cand.setsNombreCompleto(request.getParameter("nombre"));
        cand.setsDomicilio(request.getParameter("domicilio"));
        cand.setsTelefono(request.getParameter("telefono"));
        cand.setsCorreoElectronico(request.getParameter("correo"));
        cand.setsTituloProfesional(request.getParameter("titulo"));
        cand.setsUniversidad(request.getParameter("universidad"));
        cand.setsCertificados(request.getParameter("certificado"));
        cand.setsTrabajosAnteriores(request.getParameter("trabajos"));
        cand.setsExpectativas(request.getParameter("economico"));
        
        // use regular Java classes
        DBHandler.modificaCandidato(cand);
        
        // forward request and response objects to JSP page
        String url = "/modificarCandidatos.jsp";
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
