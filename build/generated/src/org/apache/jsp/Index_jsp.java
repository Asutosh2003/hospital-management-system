package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/component/navbar.jsp");
    _jspx_dependants.add("/image/imag.jsp");
    _jspx_dependants.add("/component/footer.jsp");
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
      out.write("        <title>Index page</title>\n");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\" integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <style>\n");
      out.write("            .card{\n");
      out.write("                box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-body-success bg-success\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"Index.jsp\"><i class=\"fas fa-hospital-user\"></i></i>MEDCARE</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\"> <!for right side use ms instead of me >\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"admin_login.jsp\"><i class=\"fas fa-sign-in-alt\"></i> ADMIN</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"doctor_login.jsp\">DOCTOR</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">APPOINTMENT</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"user_login.jsp\">USER</a>\n");
      out.write("        </li>\n");
      out.write("<!--        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Dropdown\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\n");
      out.write("            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>-->\n");
      out.write("<!--        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link disabled\" aria-disabled=\"true\">Disabled</a>\n");
      out.write("        </li>-->\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<div id=\"carouselExampleAutoplaying\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("        <img src=\"https://images.pexels.com/photos/40568/medical-appointment-doctor-healthcare-40568.jpeg\" class=\"d-block w-100\" height=\"500px\" alt=\"...\" >\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"https://plus.unsplash.com/premium_photo-1658506671316-0b293df7c72b?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\" class=\"d-block w-100\" height=\"500px\" alt=\"...\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"https://img.freepik.com/free-vector/doctors-concept-illustration_114360-1515.jpg?t=st=1731301803~exp=1731305403~hmac=26375402f351bae3f03cddfb47d62873b3433afea4f77b918edb8a177ef41d3d&w=826\" class=\"d-block w-100\" height=\"500px\" alt=\"\">\n");
      out.write("<!--    </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("      <img src=\"...\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("    </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("      <img src=\"...\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("    </div>-->\n");
      out.write("  </div>\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleAutoplaying\" data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("  </button>\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleAutoplaying\" data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\n");
      out.write("  </button>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        <div class=\"container p-3\">\n");
      out.write("  <!-- Content here -->\n");
      out.write("  <p class=\"text-center fs-2\">Key Feature of Our Hospital</p>\n");
      out.write("  <div style=\"display: flex\">\n");
      out.write("  <div class=\"row row-cols-1 row-cols-md-2 g-4\">\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  <div class=\"col-md-4\">\n");
      out.write("      <img src=\"https://img.freepik.com/free-photo/portrait-young-doctor-holding-stethoscope_23-2148352015.jpg?t=st=1731302962~exp=1731306562~hmac=062879dc242d53f8dd800b32ca28e3bec10c667a7c6661bd410c57bceac3d3fb&w=826\" height=\"300px\" style=\"margin-left: 15px\" width=\"100%\">\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-group\">\n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img src=\"...\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("      <h5 class=\"card-title\">Card title</h5>\n");
      out.write("      <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("      <p class=\"card-text\"><small class=\"text-body-secondary\">Last updated 3 mins ago</small></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img src=\"...\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("      <h5 class=\"card-title\">Card title</h5>\n");
      out.write("      <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("      <p class=\"card-text\"><small class=\"text-body-secondary\">Last updated 3 mins ago</small></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img src=\"...\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("      <h5 class=\"card-title\">Card title</h5>\n");
      out.write("      <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\n");
      out.write("      <p class=\"card-text\"><small class=\"text-body-secondary\">Last updated 3 mins ago</small></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img src=\"...\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("      <h5 class=\"card-title\">Card title</h5>\n");
      out.write("      <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\n");
      out.write("      <p class=\"card-text\"><small class=\"text-body-secondary\">Last updated 3 mins ago</small></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        ");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"bg-success text-white pt-4\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!-- About Section -->\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("                <h5>About Us</h5>\n");
      out.write("                <p>We are dedicated to providing quality content and services to our users. Our team works hard to bring the best experience to you.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Links Section -->\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("                <h5>Quick Links</h5>\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\">Home</a></li>\n");
      out.write("                    <li><a href=\"about.html\" class=\"text-white text-decoration-none\">About</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\">Services</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"text-white text-decoration-none\">Contact</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Social Media Section -->\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("                <h5>Follow Us</h5>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"#\" class=\"text-white me-3\"><i class=\"bi bi-facebook\"></i> Facebook</a>\n");
      out.write("                    <a href=\"#\" class=\"text-white me-3\"><i class=\"bi bi-twitter\"></i> Twitter</a>\n");
      out.write("                    <a href=\"#\" class=\"text-white\"><i class=\"bi bi-instagram\"></i> Instagram</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <hr class=\"bg-white\">\n");
      out.write("        \n");
      out.write("        <!-- Copyright -->\n");
      out.write("        <div class=\"text-center pb-3\">\n");
      out.write("            <p class=\"mb-0\">© 2024 Your Company Name. All Rights Reserved.</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Icons (for social media icons) -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.3/font/bootstrap-icons.min.css\" rel=\"stylesheet\">");
      out.write("\n");
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
