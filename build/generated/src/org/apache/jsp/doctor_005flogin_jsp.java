package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doctor_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("        <title>DOCTOR LOGIN</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/styleandcss.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/navbar.jsp", out, false);
      out.write("\n");
      out.write("          <div class=\"container\">\n");
      out.write("    <div class=\"row justify-content-center\">\n");
      out.write("        <div class=\"col-md-6 col-lg-4\">\n");
      out.write("            <div class=\"card shadow-sm border-0\">\n");
      out.write("                <div class=\"card-body p-4\">\n");
      out.write("                    <h3 class=\"card-title text-center mb-4\">DOCTOR LOGIN</h3>\n");
      out.write("                    \n");
      out.write("                    <!-- Admin Login Form -->\n");
      out.write("                    <form action=\"/admin/dashboard\" method=\"post\">\n");
      out.write("                        <!-- Username Field -->\n");
      out.write("                         <div class=\"mb-3\">\n");
      out.write("                            <label for=\"email\" class=\"form-label\">Email:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"username\" name=\"email\" placeholder=\"Enter email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <!-- Password Field -->\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"password\" class=\"form-label\">Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Enter password\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <!-- Login Button -->\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary w-100\">Login</button>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                    <!-- Forgot Password Link -->\n");
      out.write("                    <div class=\"text-center mt-3\">\n");
      out.write("                        <a href=\"#\" class=\"text-decoration-none\">Forgot password?</a><br>\n");
      out.write("                        Don't have an account ?<a href=\"signup.jsp\">Create one</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
