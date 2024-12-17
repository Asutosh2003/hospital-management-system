package org.apache.jsp.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/dashboard/../component/styleandcss.jsp");
    _jspx_dependants.add("/dashboard/navbar1.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\" integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("                <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-body-success bg-success\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\"><i class=\"fas fa-hospital-user\"></i>MEDCARE</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">DOCTOR</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Patient</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      <!-- Right-aligned dropdown -->\n");
      out.write("      <ul class=\"navbar-nav ms-auto\"> <!-- Ensure this pushes items to the right -->\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Admin\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end\"> <!-- Aligns the dropdown to the right side -->\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"logout.jsp\">Logout</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <h5 class=\"text-center mt-4\">Admin: ");
      out.print( session.getAttribute("name") );
      out.write("</h5>\n");
      out.write("        \n");
      out.write("        <!-- Card Container -->\n");
      out.write("        <div class=\"container mt-5 p-4\" style=\"background-color: azure;\">\n");
      out.write("            <div class=\"row g-4\"> <!-- Use row with gap -->\n");
      out.write("                \n");
      out.write("                <!-- Doctor Card -->\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card text-bg-success\" style=\"height: 15rem;\">\n");
      out.write("                        <div class=\"card-body d-flex flex-column justify-content-center align-items-center\">\n");
      out.write("                            <i class=\"fa-solid fa-user-doctor\" style=\"font-size: 3rem; margin-bottom: 10px;\"></i>\n");
      out.write("                            <div class=\"card-header text-center\">Doctor</div>\n");
      out.write("                            <h5 class=\"card-title text-center mt-2\">Primary card title</h5>\n");
      out.write("                            <p class=\"card-text text-center\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!-- Patient Card -->\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card text-bg-success\" style=\"height: 15rem;\">\n");
      out.write("                        <div class=\"card-body d-flex flex-column justify-content-center align-items-center\">\n");
      out.write("                            <i class=\"fa-solid fa-bed-pulse\" style=\"font-size: 3rem; margin-bottom: 10px;\"></i>\n");
      out.write("                            <div class=\"card-header text-center\">Patient</div>\n");
      out.write("                            <h5 class=\"card-title text-center mt-2\">Primary card title</h5>\n");
      out.write("                            <p class=\"card-text text-center\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!-- Additional Cards -->\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card text-bg-success\" style=\"height: 15rem;\">\n");
      out.write("                        <div class=\"card-body d-flex flex-column justify-content-center align-items-center\">\n");
      out.write("                            <i class=\"fa-solid fa-user-doctor\" style=\"font-size: 3rem; margin-bottom: 10px;\"></i>\n");
      out.write("                            <div class=\"card-header text-center\">Doctor</div>\n");
      out.write("                            <h5 class=\"card-title text-center mt-2\">Primary card title</h5>\n");
      out.write("                            <p class=\"card-text text-center\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card text-bg-success\" style=\"height: 15rem;\">\n");
      out.write("                        <div class=\"card-body d-flex flex-column justify-content-center align-items-center\">\n");
      out.write("                            <i class=\"fa-solid fa-user-doctor\" style=\"font-size: 3rem; margin-bottom: 10px;\"></i>\n");
      out.write("                            <div class=\"card-header text-center\">Doctor</div>\n");
      out.write("                            <h5 class=\"card-title text-center mt-2\">Primary card title</h5>\n");
      out.write("                            <p class=\"card-text text-center\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
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
