package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logic.Entrevista;
import logic.Empleado;
import logic.DBHandler;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import logic.DBHandler;
import logic.Candidato;

public final class entrevistaInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"EstiloGeneral.css\" />\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Entrevistas</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"EstiloGeneral.css\" />\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Menu superior -->\r\n");
      out.write("        <menu>\r\n");
      out.write("            <a href =\"home.jsp\">Perfil</a>\r\n");
      out.write("            <a href =\"candidatos.jsp\">Candidatos</a>\r\n");
      out.write("            <a href =\"entrevistas.jsp\">Entrevistas</a>\r\n");
      out.write("            <a href =\"empleados.jsp\">Empleados</a>\r\n");
      out.write("            <a href =\"reportes.jsp\">Reportes</a>\r\n");
      out.write("            <a href =\"contactanos.jsp\">Contactanos</a>\r\n");
      out.write("        </menu>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"titulo\">Human Capital</div><br>\r\n");
      out.write("        ");
      logic.DBHandler datos = null;
      synchronized (session) {
        datos = (logic.DBHandler) _jspx_page_context.getAttribute("datos", PageContext.SESSION_SCOPE);
        if (datos == null){
          datos = new logic.DBHandler();
          _jspx_page_context.setAttribute("datos", datos, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        <div id=\"table2\" >\r\n");
      out.write("\r\n");
      out.write("            <table style=\"width:100%\" align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"20\" >\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr class=\"tituloCandRenglon\"><td>Informacion detallada de Entrevista</td></tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                ");
  
                    String sEmpID = request.getParameter("empId");
                    String sCandID = request.getParameter("candId");
                    String sFechaID = request.getParameter("fechaId");
                    String sFeedbackID = request.getParameter("feedbackId");
                    Entrevista ent = DBHandler.obtenerEntrevista(sEmpID, sCandID, sFechaID, sFeedbackID);
                    if (ent == null) {
                
      out.write("\r\n");
      out.write("                <tr class=\"candRenglon\"> Entrevista no encontrada </tr> <br><br>\r\n");
      out.write("\r\n");
      out.write("                ");
 } else {
      out.write(" \r\n");
      out.write("                <tr class=\"candRenglon\"> <td>Entrevistador: ");
      out.print( ent.getEmpEmpleado().getsNombreCompleto() );
      out.write(" </td> </tr>\r\n");
      out.write("                <tr class=\"candRenglon\"> <td>Entrevistado: ");
      out.print( ent.getCandCandidato().getsNombreCompleto() );
      out.write(" </td> </tr>\r\n");
      out.write("                <tr class=\"candRenglon\"> <td>Fecha: ");
      out.print( ent.getsFecha() );
      out.write(" </td> </tr>\r\n");
      out.write("                <tr class=\"candRenglon\"> <td>Plataforma: ");
      out.print( ent.getsPlataforma() );
      out.write(" </td> </tr>\r\n");
      out.write("                <tr class=\"candRenglon\"> <td>Feedback: ");
      out.print( ent.getsFeedback() );
      out.write(" </td> </tr>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("                <tr class=\"candRenglon\"><td><form action=\"/ProyectoJava/entrevistas.jsp\">\r\n");
      out.write("\t\t\t\t\t<center><input type=\"submit\" class=\"myButton\" value=\"Regresar\"></center>\r\n");
      out.write("                </form></td></tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script>\r\n");
      out.write("        ");

            if (ent == null) {
        
      out.write("\r\n");
      out.write("        alert('Advertencia: Esta intentando acceder a la informacion de una entrevista inexistente.');\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
