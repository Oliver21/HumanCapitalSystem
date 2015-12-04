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

public class EliminarEntrevistaListServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // get parameters from the request
        String sEmpID = request.getParameter("empId");
        String sCandID = request.getParameter("candId");
        String sFechaID = request.getParameter("fechaId");
        String sFeedbackID = request.getParameter("feedbackId");
        // use regular Java classes
        DBHandler.eliminaEntrevista(sEmpID, sCandID, sFechaID, sFeedbackID);
        
        // forward request and response objects to JSP page
        String url = "/entrevistas.jsp";
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
