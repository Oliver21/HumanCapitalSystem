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

public final class modificarEntrevistas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      logic.DBHandler datos = null;
      synchronized (session) {
        datos = (logic.DBHandler) _jspx_page_context.getAttribute("datos", PageContext.SESSION_SCOPE);
        if (datos == null){
          datos = new logic.DBHandler();
          _jspx_page_context.setAttribute("datos", datos, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\t<!-- Titulo de la pagina -->\r\n");
      out.write("\t\t<div class=\"titulo\">Eliminación de Entrevistas</div><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
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
      out.write("        <div id=\"table1\" >\r\n");
      out.write("            <!-- Formulario en forma de tabla para separar en columnas y renglones -->\r\n");
      out.write("            <table border=\"0\" cellspacing=\"0\" cellpadding=\"6\" width=\"765px\" >\r\n");
      out.write("                <tr class=\"tituloCandRenglon\">\r\n");
      out.write("                    <td> Entrevistador </td>\r\n");
      out.write("                    <td> Entrevistado </td>\r\n");
      out.write("                    <td> Fecha </td>\r\n");
      out.write("                    <td> Plataforma </td>\r\n");
      out.write("                    <td> Modificar </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    ArrayList<Entrevista> ents = DBHandler.obtenerEntrevistas();
                    for (int i = 0; i < ents.size(); i++) {
                
      out.write("\r\n");
      out.write("                <tr class=\"candRenglon\"> \r\n");
      out.write("                    <td> ");
      out.print( ents.get(i).getEmpEmpleado().getsNombreCompleto() );
      out.write(" </td>\r\n");
      out.write("                    <td> ");
      out.print( ents.get(i).getCandCandidato().getsNombreCompleto() );
      out.write(" </td>\r\n");
      out.write("                    <td> ");
      out.print( ents.get(i).getsFecha() );
      out.write(" </td>\r\n");
      out.write("                    <td> ");
      out.print( ents.get(i).getsPlataforma() );
      out.write(" </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <form action=\"modificarEntrevistaExistente.jsp\" method=\"POST\">\r\n");
      out.write("                            <input type=\"text\" name=\"candId\" value=\"");
      out.print( ents.get(i).getCandCandidato().getsID() );
      out.write("\" hidden>\r\n");
      out.write("                            <input type=\"text\" name=\"empId\" value=\"");
      out.print( ents.get(i).getEmpEmpleado().getsID() );
      out.write("\" hidden>\r\n");
      out.write("                            <input type=\"text\" name=\"fechaId\" value=\"");
      out.print( ents.get(i).getsFecha() );
      out.write("\" hidden>\r\n");
      out.write("                            <input type=\"text\" name=\"feedbackId\" value=\"");
      out.print( ents.get(i).getsFeedback() );
      out.write("\" hidden>\r\n");
      out.write("                            <input type=\"submit\" value=\"Modificar\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <form action=\"entrevistas.jsp\">\r\n");
      out.write("                            <center><input type=\"submit\" class=\"myButton\" value=\"Regresar\"></center>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
