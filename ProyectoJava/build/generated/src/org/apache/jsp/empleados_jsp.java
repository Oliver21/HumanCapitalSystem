package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logic.Empleado;
import logic.DBHandler;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import logic.DBHandler;
import logic.Candidato;

public final class empleados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"EstiloGeneral.css\" />\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Empleados</title>\r\n");
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
      out.write("    <body bgcolor=dddddd>\r\n");
      out.write("        <!-- Menu superior -->\r\n");
      out.write("        <menu>\r\n");
      out.write("            <a href =\"home.jsp\">Perfil</a>\r\n");
      out.write("            <a href =\"candidatos.jsp\">Candidatos</a>\r\n");
      out.write("            <a href =\"entrevistas.jsp\">Entrevistas</a>\r\n");
      out.write("            <a href =\"empleados.jsp\">Empleados</a>\r\n");
      out.write("            <a href =\"reportes.jap\">Reportes</a>\r\n");
      out.write("            <a href =\"contactanos.jsp\">Contactanos</a>\r\n");
      out.write("        </menu>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
      out.write("        <div id=\"table1\" >\r\n");
      out.write("            <!-- Titulo de la pagina -->\r\n");
      out.write("            <h1> <center> Registro de Empleados </center> </h1>\r\n");
      out.write("\r\n");
      out.write("            <!-- Formulario en forma de tabla para separar en columnas y renglones -->\r\n");
      out.write("            <table style=\"width:140%\" >\r\n");
      out.write("\r\n");
      out.write("                <form action=\"agregarEmpleados.jsp\" method=\"post\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Agregar empleados\">\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("                <form action=\"modificarEmpleados.jsp\" method=\"post\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Modificar empleados\">\r\n");
      out.write("                </form>\r\n");
      out.write("                <form action=\"eliminarEmpleados.jsp\" method=\"post\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Eliminar empleados\">\r\n");
      out.write("                </form>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td> Nombre </td>\r\n");
      out.write("                    <td> Email </td>\r\n");
      out.write("                    <td> Titulo profesional </td>\r\n");
      out.write("                    <td> Puesto </td>\r\n");
      out.write("                    <td> Salario </td>\r\n");
      out.write("                    <td> Inspeccionar </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    ArrayList<Empleado> emps = DBHandler.obtenerEmpleados();
                    for (int i = 0; i < emps.size(); i++) {
                
      out.write("\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td> ");
      out.print( emps.get(i).getsNombreCompleto());
      out.write(" </td>\r\n");
      out.write("                    <td> ");
      out.print( emps.get(i).getsCorreoElectronico());
      out.write(" </td>\r\n");
      out.write("                    <td> ");
      out.print( emps.get(i).getsTituloProfesional());
      out.write(" </td>\r\n");
      out.write("                    <td> ");
      out.print( emps.get(i).getsPuesto());
      out.write(" </td>\r\n");
      out.write("                    <td> $");
      out.print( emps.get(i).getsSalario());
      out.write(" </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <form action=\"empleadoInfo.jsp\" method=\"POST\">\r\n");
      out.write("                            <input type=\"text\" name=\"empId\" value=\"");
      out.print( emps.get(i).getsID());
      out.write("\" hidden>\r\n");
      out.write("                            <input type=\"submit\" value=\"Inspeccionar\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                ");
}
      out.write("\r\n");
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
