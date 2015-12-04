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

public class ModificarEntrevistaListServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // get parameters from the request
        Entrevista ent = new Entrevista();
        String sEntrevistadorID = request.getParameter("entrevistadorID");
        String sEntrevistadoID = request.getParameter("entrevistadoID");
        ent.setsFecha(request.getParameter("fecha"));
        ent.setsFeedback(request.getParameter("feedback"));
        ent.setsPlataforma(request.getParameter("plataforma"));

        String sOldEmpID = request.getParameter("oldEMPID");
        String sOldCANDID = request.getParameter("oldCANDID");
        String sOldFECHAID = request.getParameter("oldFECHAID");
        String sOldFEEDBACKID = request.getParameter("oldFEEDBACKID");
        
        
        // use regular Java classes
        DBHandler.modificaEntrevista(ent, sEntrevistadorID, sEntrevistadoID, sOldEmpID, sOldCANDID, sOldFECHAID, sOldFEEDBACKID);
        
        // forward request and response objects to JSP page
        String url = "/modificarEntrevistas.jsp";
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
