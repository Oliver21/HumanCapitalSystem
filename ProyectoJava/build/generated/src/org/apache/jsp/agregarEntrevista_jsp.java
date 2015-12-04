package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregarEntrevista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"EstiloAgregarCandidatos.css\" />\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Agregar entrevistas</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"oficina2.jpg\" width=\"100%\">\r\n");
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
      out.write("        <br><br>\r\n");
      out.write("    <center>\r\n");
      out.write("        <!-- Menu -->\r\n");
      out.write("        <a href=\"candidatos.jsp\"><img src=\"add.png\" id=\"imagen1\" class=\"menu\" width=\"50px\" height=\"50px\" title=\"Agregar candidato\"></img></a>\r\n");
      out.write("        <a href=\"empleados.jsp\"><img src=\"empleado.png\" id=\"imagen2\" class=\"menu\" width=\"50px\" height=\"50px\" title=\"Agregar empleado\" ></img></a>\r\n");
      out.write("        <a href=\"entrevistas.jsp\"><img src=\"handshake2.png\" id=\"imagen3\" class=\"menu\" width=\"50px\" height=\"50px\" title=\"Entrevistas\"></img></a>\r\n");
      out.write("        <a href=\"reportes.jsp\"><img src=\"reporte2.png\" id=\"imagen4\" class=\"menu\" width=\"50px\" height=\"50px\" title=\"Reportes\"></img></a>\r\n");
      out.write("\r\n");
      out.write("        <!-- Formulario en forma de tabla para separar en columnas y renglones -->\r\n");
      out.write("\r\n");
      out.write("        <br><br><br>\r\n");
      out.write("        <h3  class=\"mensajeTop\">Datos de la Entrevista</h3>\r\n");
      out.write("\r\n");
      out.write("        <form action= \"agregarCandidatoList\" method=\"post\"> \r\n");
      out.write("            Nombre Completo:\r\n");
      out.write("            <input type=\"text\" placeholder=\"Nombre Completo\" name=\"nombre\" required style=\" background:transparent; width:300px; height:40px; font-size:18px; \r\n");
      out.write("                   position:relative; left:23px;\">\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            Domicilio:\r\n");
      out.write("            <input type=\"text\" placeholder=\"Domicilio\" name=\"domicilio\" style=\" background:transparent; width:300px; height:40px; font-size:18px; position:relative; left:51px;\">\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            Telefono:\r\n");
      out.write("            <input type=\"tel\" placeholder=\"Telefono\" name=\"telefono\" style=\" background:transparent; width:300px; height:40px; font-size:18px; position:relative; left:53px;\">\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            Correo Electrónico:\r\n");
      out.write("            <input type=\"email\" placeholder=\"Correo electronico\" name=\"correo\" style=\" background:transparent; width:300px; height:40px; font-size:18px; position:relative; \r\n");
      out.write("                   left:21px;\">\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            Titulo Profesional:\r\n");
      out.write("            <input type=\"text\" placeholder=\"Titutlo Profesional\" name=\"titulo\" style=\" background:transparent; width:300px; height:40px; font-size:18px; position:relative; \r\n");
      out.write("                   left:23px;\">\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            Universidad:\r\n");
      out.write("            <input type=\"text\" placeholder=\"Universidad\" name=\"universidad\" style=\" background:transparent; width:300px; height:40px; font-size:18px; position:relative; \r\n");
      out.write("                   left:40px;\">\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            Certificados:\r\n");
      out.write("            <input type=\"text\" placeholder=\"Certificados\" name=\"certificado\" style=\" background:transparent; width:300px; height:40px; font-size:18px; position:relative; \r\n");
      out.write("                   left:40px;\">\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            Trabajos anteriores:\r\n");
      out.write("            <input type=\"text\" placeholder=\"Trabajos\" name=\"trabajos\" style=\" background:transparent; width:300px; height:40px; font-size:18px; position:relative; left:18px;\">\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            Expectativas económicas:\r\n");
      out.write("            <input type=\"number\" placeholder=\"Salario mensual\" name=\"economico\" style=\" background:transparent; width:300px; height:40px; font-size:18px;\">\r\n");
      out.write("            <br> <br> <br> <br>\r\n");
      out.write("            <input type =\"submit\" class=\"myButton\"value=\"Agregar\" /> \r\n");
      out.write("        </form> \r\n");
      out.write("        <form action= \"entrevistas.jsp\"> \r\n");
      out.write("            <input type =\"submit\" class=\"myButton\" value=\"Regresar\" /> \r\n");
      out.write("        </form>\r\n");
      out.write("        <img  id=\"cuadro\" src=\"cuadro.png\" width=\"840px\" height =\"950px\" style=\"top:-850px;\"></img>\r\n");
      out.write("    </center>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
