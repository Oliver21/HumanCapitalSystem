package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"loginStyle.css\" />\r\n");
      out.write("    <head> \r\n");
      out.write("        <title>HumanCapital</title> \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body background=\"oficina2.jpg\">\r\n");
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
      out.write("    <center>\r\n");
      out.write("        <div class=\"titulo\">Human Capital System</div>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <h3  class=\"mensajeTop\">Introduzca su ususario y contrasena:</h3>\r\n");
      out.write("        <img  id=\"cuadro\" src=\"cuadro.png\" width=\"400px\" height =\"215px\"></img>\r\n");
      out.write("        <form action=\"validateLogin\" method=\"post\"> \r\n");
      out.write("            <input type=\"text\" placeholder=\"Email\" name=\"email\" style=\" background:transparent; width:300px; height:40px; font-size:18px;\">\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            <input type=\"password\" placeholder=\"Contrasena\" name=\"password\" style=\" background:transparent; width:300px; height:40px; font-size:18px;\">\r\n");
      out.write("            <br> <br> <br> <br>\r\n");
      out.write("            <input type =\"submit\" class=\"myButton\"value=\"Iniciar Sesion\" /> \r\n");
      out.write("        </form> \r\n");
      out.write("        <form action=\"/login.jsp\"> \r\n");
      out.write("            <input type =\"submit\" class=\"myButton\" value=\"Regresar\" /> \r\n");
      out.write("        </form>\r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
