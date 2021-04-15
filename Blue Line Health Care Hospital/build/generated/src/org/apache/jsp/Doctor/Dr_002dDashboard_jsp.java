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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>Doctors Dashboard</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("<body class=\"is-preload\">\n");
      out.write("\n");
      out.write("    <!-- Wrapper -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("      <!-- Main -->\n");
      out.write("        <div id=\"main\">\n");
      out.write("          <div class=\"inner\">\n");
      out.write("\n");
      out.write("            <!-- Header -->\n");
      out.write("            <header id=\"header\">\n");
      out.write("              <div class=\"logo\">\n");
      out.write("                <img class=\"dash\" src=\"assets/images/dashboard.png\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <a href=\"Dr-Dashboard.html\">Dashboard</a>\n");
      out.write("              </div>\n");
      out.write("            </header>\n");
      out.write("            \n");
      out.write("            <div class=\"time\">\n");
      out.write("                ");

                    Date date = new Date();
                    out.print( "<h5 align = \"center\">" +date.toString()+"</h5>");
                
      out.write("\n");
      out.write("            </div><br><br>\n");
      out.write("\n");
      out.write("            <!-- Banner -->\n");
      out.write("            <section class=\"main-banner\">\n");
      out.write("              <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"banner-content\">\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <div class=\"banner-caption\">\n");
      out.write("                            <h4>Hello, this is <em>Doctors</em> Dashboard.</h4>\n");
      out.write("                            <div class=\"primary-button\">\n");
      out.write("                              <a href=\"Dr-Dashboard.html\">WELCOME!</a>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!-- Services -->\n");
      out.write("            <section class=\"services\">\n");
      out.write("              <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"service-item first-item\">\n");
      out.write("                      <div class=\"icon\"></div>\n");
      out.write("                      <h4><a href=\"UpdateForm.jsp\">PROFILE</a></h4>\n");
      out.write("                      <p>Hello,</p><p>Check & Update your profile.</p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"service-item second-item\">\n");
      out.write("                      <div class=\"icon\"></div>\n");
      out.write("                      <h4><a href=\"Appointments.html\">APPOINTMENTS</a></h4>\n");
      out.write("                      <p>Hello,</p><p>Check your upcoming appointments.</p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer id=\"footer\">\n");
      out.write("              <p class=\"copyright1\">Copyright &copy; 2021 Blue Line Health Care Hospital. All rights reserved.\n");
      out.write("              <br>Designed by <a rel=\"nofollow\" href=\"../Home/Home.html\">Our Team</a></p>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      <!-- Sidebar -->\n");
      out.write("        <div id=\"sidebar\">\n");
      out.write("\n");
      out.write("          <div class=\"inner\">\n");
      out.write("              \n");
      out.write("            <!-- Menu -->\n");
      out.write("            <nav id=\"menu\">\n");
      out.write("              <ul>\n");
      out.write("                <li><img class=\"logo1\" src=\"logo.png\"></li>\n");
      out.write("                <li><a href=\"Dr-Dashboard.html\">Home</a></li>\n");
      out.write("                <li><a href=\"UpdateForm.jsp\">Profile</a></li>\n");
      out.write("                <li><a href=\"Appointments.html\">Appointments</a></li>\n");
      out.write("                <li><a href=\"../Home/Home.html\">Logout</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <!-- Featured Posts -->\n");
      out.write("            <div class=\"featured-posts\">\n");
      out.write("              <div class=\"heading\">\n");
      out.write("                <h2>Featured Posts</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"owl-carousel owl-theme\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <div class=\"featured-item\">\n");
      out.write("                    <img src=\"assets/images/featured_post_01.jpg\" alt=\"featured one\">\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <div class=\"featured-item\">\n");
      out.write("                    <img src=\"assets/images/featured_post_02.jpg\" alt=\"featured two\">\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <div class=\"featured-item\">\n");
      out.write("                    <img src=\"assets/images/featured_post_03.jpg\" alt=\"featured three\">\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer id=\"footer\">\n");
      out.write("              <p class=\"copyright\">Copyright &copy; 2021 Blue Line Health Care Hospital. All rights reserved.\n");
      out.write("              <br>Designed by <a rel=\"nofollow\" href=\"../Home/Home.html\">Our Team</a></p>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  <!-- Scripts -->\n");
      out.write("  <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/browser.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/breakpoints.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/transition.js\"></script>\n");
      out.write("    <script src=\"assets/js/owl-carousel.js\"></script>\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
