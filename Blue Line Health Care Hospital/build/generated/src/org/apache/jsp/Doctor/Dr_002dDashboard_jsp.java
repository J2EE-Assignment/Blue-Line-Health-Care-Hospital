package org.apache.jsp.Doctor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class Dr_002dDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <title>Doctors Dashboard</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Additional CSS Files -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"is-preload\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Wrapper -->\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Main -->\r\n");
      out.write("        <div id=\"main\">\r\n");
      out.write("          <div class=\"inner\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Header -->\r\n");
      out.write("            <header id=\"header\">\r\n");
      out.write("              <div class=\"logo\">\r\n");
      out.write("                <img class=\"dash\" src=\"assets/images/dashboard.png\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                <a href=\"Dr-Dashboard.html\">Dashboard</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </header>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"time\">\r\n");
      out.write("                ");

                    Date date = new Date();
                    out.print( "<h5 align = \"center\">" +date.toString()+"</h5>");
                
      out.write("\r\n");
      out.write("            </div><br><br>\r\n");
      out.write("\r\n");
      out.write("            <!-- Banner -->\r\n");
      out.write("            <section class=\"main-banner\">\r\n");
      out.write("              <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"banner-content\">\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                          <div class=\"banner-caption\">\r\n");
      out.write("                            <h4>Hello, this is <em>Doctors</em> Dashboard.</h4>\r\n");
      out.write("                            <div class=\"primary-button\">\r\n");
      out.write("                              <a href=\"Dr-Dashboard.html\">WELCOME!</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <!-- Services -->\r\n");
      out.write("            <section class=\"services\">\r\n");
      out.write("              <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"service-item first-item\">\r\n");
      out.write("                      <div class=\"icon\"></div>\r\n");
      out.write("                      <h4><a href=\"UpdateForm.jsp\">PROFILE</a></h4>\r\n");
      out.write("                      <p>Hello,</p><p>Check & Update your profile.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"service-item second-item\">\r\n");
      out.write("                      <div class=\"icon\"></div>\r\n");
      out.write("                      <h4><a href=\"Appointments.html\">APPOINTMENTS</a></h4>\r\n");
      out.write("                      <p>Hello,</p><p>Check your upcoming appointments.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("            <footer id=\"footer\">\r\n");
      out.write("              <p class=\"copyright1\">Copyright &copy; 2021 Blue Line Health Care Hospital. All rights reserved.\r\n");
      out.write("              <br>Designed by <a rel=\"nofollow\" href=\"../Home/Home.html\">Our Team</a></p>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar -->\r\n");
      out.write("        <div id=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"inner\">\r\n");
      out.write("              \r\n");
      out.write("            <!-- Menu -->\r\n");
      out.write("            <nav id=\"menu\">\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><img class=\"logo1\" src=\"logo.png\"></li>\r\n");
      out.write("                <li><a href=\"Dr-Dashboard.html\">Home</a></li>\r\n");
      out.write("                <li><a href=\"UpdateForm.jsp\">Profile</a></li>\r\n");
      out.write("                <li><a href=\"Appointments.html\">Appointments</a></li>\r\n");
      out.write("                <li><a href=\"../Home/Home.html\">Logout</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <!-- Featured Posts -->\r\n");
      out.write("            <div class=\"featured-posts\">\r\n");
      out.write("              <div class=\"heading\">\r\n");
      out.write("                <h2>Featured Posts</h2>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"owl-carousel owl-theme\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                  <div class=\"featured-item\">\r\n");
      out.write("                    <img src=\"assets/images/featured_post_01.jpg\" alt=\"featured one\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                  <div class=\"featured-item\">\r\n");
      out.write("                    <img src=\"assets/images/featured_post_02.jpg\" alt=\"featured two\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                  <div class=\"featured-item\">\r\n");
      out.write("                    <img src=\"assets/images/featured_post_03.jpg\" alt=\"featured three\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("            <footer id=\"footer\">\r\n");
      out.write("              <p class=\"copyright\">Copyright &copy; 2021 Blue Line Health Care Hospital. All rights reserved.\r\n");
      out.write("              <br>Designed by <a rel=\"nofollow\" href=\"../Home/Home.html\">Our Team</a></p>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Scripts -->\r\n");
      out.write("  <!-- Bootstrap core JavaScript -->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"assets/js/browser.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/transition.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/owl-carousel.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
