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

public class EliminarCandidatoListServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // get parameters from the request
        String sId = request.getParameter("candId");
        // use regular Java classes
        DBHandler.eliminaCandidato(sId);
        
        // forward request and response objects to JSP page
        String url = "/candidatos.jsp";
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
