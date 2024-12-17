package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class appointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Appointment Form</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            padding: 0%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        html, body {\n");
      out.write("            height: 100%;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            width: 50%;\n");
      out.write("            border: 2px solid rgb(0, 0, 0);\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input, textarea {\n");
      out.write("            height: 40px;\n");
      out.write("            width: 90%;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        textarea {\n");
      out.write("            height: 100px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes colorChange {\n");
      out.write("            0% {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            25% {\n");
      out.write("                color: green;\n");
      out.write("            }\n");
      out.write("            50% {\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("            75% {\n");
      out.write("                color: rgb(0, 255, 136);\n");
      out.write("            }\n");
      out.write("            100% {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #h1 {\n");
      out.write("            font-size: xx-large;\n");
      out.write("            font-weight: bolder;\n");
      out.write("            animation: colorChange 5s infinite;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #submit:hover {\n");
      out.write("            background-color: aqua;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-light\">\n");
      out.write("    <center>\n");
      out.write("        <form action=\"backend/processAppointment.jsp\" method=\"post\" name=\"appointmentForm\" class=\"bg-success\">\n");
      out.write("\n");
      out.write("            <h1 id=\"h1\">Book an Appointment</h1>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter your name\" name=\"name\" style=\"margin-top: 20px;\" required>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"email\" placeholder=\"Enter your email\" name=\"email\" required>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"tel\" placeholder=\"Enter your contact number\" name=\"contact\" required>\n");
      out.write("            <br>\n");
      out.write("            <label for=\"date\">Preferred Date:</label>\n");
      out.write("            <input type=\"date\" id=\"date\" name=\"date\" required>\n");
      out.write("            <br>\n");
      out.write("            <label for=\"time\">Preferred Time:</label>\n");
      out.write("            <input type=\"time\" id=\"time\" name=\"time\" required>\n");
      out.write("            <br>\n");
      out.write("            <textarea placeholder=\"Additional Comments\" name=\"comments\"></textarea>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Book Appointment\" id=\"submit\" style=\"margin-bottom: 20px;\">\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
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
