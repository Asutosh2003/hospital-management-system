package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign up</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: cornsilk;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                background-color: antiquewhite;\n");
      out.write("                width: 50%;\n");
      out.write("                height: 100%;\n");
      out.write("                margin-top: 50px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                margin-top: 20px;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/styleandcss.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/navbar.jsp", out, false);
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div>\n");
      out.write("            <form name='f1' method=\"post\" action=\"backend/regn.jsp\">\n");
      out.write("                <h1>Sign Up</h1><br>\n");
      out.write("                <label for=\"name\">Name:</label>\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Enter your name\">\n");
      out.write("                <br>\n");
      out.write("                <label for=\"email\">Email:</label>\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"Enter your email\">\n");
      out.write("                <br>\n");
      out.write("                <label for=\"password\">Password</label>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                <br>\n");
      out.write("                <label for=\"catagory\">Choose a catagory:\n");
      out.write("                <input type=\"radio\" name=\"catagory\" value=\"admin\">Admin\n");
      out.write("                <input type=\"radio\" name=\"catagory\" value=\"user\">User\n");
      out.write("                <input type=\"radio\" name=\"catagory\"  value=\"doctor\">Doctor\n");
      out.write("                </label>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"Register\" style=\"margin-bottom: 20px; margin-top: 10px;\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
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
