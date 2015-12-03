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

public class ValidateLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String sUsername = request.getParameter("email");
        String sPassword = request.getParameter("password");

        boolean bSuccess = DBHandler.validarSesion(sUsername, sPassword);
        String url = "/login.jsp";
        if(bSuccess){
            request.getSession().setAttribute("user", sUsername);
            url = "/home.jsp";
        }
        
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
