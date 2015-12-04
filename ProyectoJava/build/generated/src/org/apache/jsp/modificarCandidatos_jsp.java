package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logic.DBHandler;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import logic.DBHandler;
import logic.Candidato;

public final class modificarCandidatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"EstiloGeneral.css\" />\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Candidatos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      logic.DBHandler datos = null;
      synchronized (session) {
        datos = (logic.DBHandler) _jspx_page_context.getAttribute("datos", PageContext.SESSION_SCOPE);
        if (datos == null){
          datos = new logic.DBHandler();
          _jspx_page_context.setAttribute("datos", datos, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        \n");
      out.write("\t\t<!-- Titulo de la pagina -->\n");
      out.write("\t\t<div class=\"titulo\">Modificación de Candidatos</div><br>\n");
      out.write("\t\t\n");
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
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"table1\" >\n");
      out.write("\n");
      out.write("            <!-- Formulario en forma de tabla para separar en columnas y renglones -->\n");
      out.write("            <table border=\"0\" cellspacing=\"0\" cellpadding=\"6\" width=\"765px\" >\n");
      out.write("                <tr class=\"tituloCandRenglon\">\n");
      out.write("                    <td> Nombre </td>\n");
      out.write("                    <td> Email </td>\n");
      out.write("                    <td> Titulo profesional </td>\n");
      out.write("                    <td> Universidad </td>\n");
      out.write("                    <td> Expectativas economicas </td>\n");
      out.write("                    <td> Modificar </td>\n");
      out.write("                </tr>\n");
      out.write("                ");


                    ServletContext context = getServletContext();
                    String relativePath = config.getInitParameter("relativePathToFile");
                    String path = context.getRealPath(relativePath);
                    ArrayList<Candidato> cands = DBHandler.obtenerCandidatos();
                    for (int i = 0; i < cands.size(); i++) {
                
      out.write("\n");
      out.write("                <tr class=\"candRenglon\"> \n");
      out.write("                    <td> ");
      out.print( cands.get(i).getsNombreCompleto());
      out.write(" </td>\n");
      out.write("                    <td> ");
      out.print( cands.get(i).getsCorreoElectronico());
      out.write(" </td>\n");
      out.write("                    <td> ");
      out.print( cands.get(i).getsTituloProfesional());
      out.write(" </td>\n");
      out.write("                    <td> ");
      out.print( cands.get(i).getsUniversidad());
      out.write(" </td>\n");
      out.write("                    <td> $");
      out.print( cands.get(i).getsExpectativas());
      out.write(" </td>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"modificarCandidatoExistente.jsp\" method=\"POST\">\n");
      out.write("                            <input type=\"text\" name=\"candId\" value=\"");
      out.print( cands.get(i).getsID());
      out.write("\" hidden>\n");
      out.write("                            <input type=\"submit\" value=\"Modificar\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"candidatos.jsp\">\n");
      out.write("                            <center><input type=\"submit\" class=\"myButton\" value=\"Regresar\"></center>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
