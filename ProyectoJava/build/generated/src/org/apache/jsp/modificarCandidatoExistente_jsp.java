package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logic.Candidato;
import logic.DBHandler;

public final class modificarCandidatoExistente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"EstiloGeneral.css\" />\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Modificar candidato</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("\n");
      out.write("\t\t<div class=\"titulo\">Human Capital</div><br>\n");
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
      out.write("        <div id=\"table2\">\n");
      out.write("            <!-- Formulario en forma de tabla para separar en columnas y renglones -->\n");
      out.write("            <table style=\"width:100%\" align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"20\">\n");
      out.write("                \n");
      out.write("\t\t\t\t<!-- Titulo de la pagina -->\n");
      out.write("\t\t\t\t<tr class=\"tituloCandRenglon\"><td>Modificación de candidato</td></tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");

                    String sID = request.getParameter("candId");
                    Candidato cand = DBHandler.obtenerCandidato(sID);
                    if (cand != null) {
                
      out.write("\n");
      out.write("                <form action=\"modificarCandidatoList\" method=\"post\">\n");
      out.write("                    <tr class=\"candRenglon\">\n");
      out.write("                        <input type=\"text\" name=\"candId\" value=\"");
      out.print( cand.getsID() );
      out.write("\" hidden>\n");
      out.write("                        <td align=\"right\">\n");
      out.write("                            Nombre completo:\n");
      out.write("                            <input type=\"text\" name=\"nombre\" required style=\"width: 500px;\" value=\"");
      out.print( cand.getsNombreCompleto() );
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Domicilio:\n");
      out.write("                            <input type=\"text\" name=\"domicilio\" required style=\"width: 500px;\" value=\"");
      out.print( cand.getsDomicilio());
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Telefono:\n");
      out.write("                            <input type=\"tel\" name=\"telefono\" style=\"width: 500px;\" value=\"");
      out.print( cand.getsTelefono());
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Correo Electronico:\n");
      out.write("                            <input type=\"email\" name=\"correo\" required style=\"width: 500px;\" value=\"");
      out.print( cand.getsCorreoElectronico());
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Titulo Profesional:\n");
      out.write("                            <input type=\"text\" name=\"titulo\" style=\"width: 500px;\" value=\"");
      out.print( cand.getsTituloProfesional() );
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Universidad:\n");
      out.write("                            <input type=\"text\" name=\"universidad\" style=\"width: 500px;\" value=\"");
      out.print( cand.getsUniversidad());
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Certificados:\n");
      out.write("                            <input type=\"text\" name=\"certificado\" style=\"width: 500px;\" value=\"");
      out.print( cand.getsCertificados());
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Trabajos anteriores:\n");
      out.write("                            <input type=\"text\" name=\"trabajos\" multiple style=\"width: 500px; height: 80px\" value=\"");
      out.print( cand.getsTrabajosAnteriores());
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            Expectativas economicas:\n");
      out.write("                            <input type=\"number\" name=\"economico\" style=\"width: 500px;\" min=\"0\" max =\"99999999\" value=\"");
      out.print( cand.getsExpectativas());
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"submit\" value=\"Modificar\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </form>\n");
      out.write("                ");
 } else {
      out.write("\n");
      out.write("                <tr class=\"candRenglon\"> Candidato no encontrado </tr> <br><br>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                <td align=\"center\">\n");
      out.write("                    <br> <br>\n");
      out.write("                    <form action=\"modificarCandidatos.jsp\">\n");
      out.write("                        <center><input type=\"submit\" class=\"myButton\" value=\"Regresar\"></center>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("\n");
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
