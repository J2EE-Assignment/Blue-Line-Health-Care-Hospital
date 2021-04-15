package org.apache.jsp.Doctor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class UpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Personal Information Form</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\" integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"UpdateForm.css\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div>\n");
      out.write("      <img src=\"logo.png\" class=\"logo\">\n");
      out.write("      <h1 class=\"head\">Blue Line Health Care Hospital</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"testbox\">\n");
      out.write("    <form action=\"/\">\n");
      out.write("      <legend>Doctor Personal Information</legend>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <div class=\"name-item\">\n");
      out.write("          <div>\n");
      out.write("            <label for=\"title\">Title<span>*</span></label>\n");
      out.write("                <select required class=\"drop\">\n");
      out.write("                  <option selected value=\"\" disabled selected>Title</option>\n");
      out.write("                  <option value=\"1\">Dr.</option>\n");
      out.write("                  <option value=\"2\">Ms.</option>\n");
      out.write("                  <option value=\"3\">Mrs.</option>\n");
      out.write("                </select>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("      <label for=\"name\">Name<span>*</span></label>\n");
      out.write("      <div class=\"name-item\">\n");
      out.write("      <input id=\"name\" type=\"text\" name=\"name\" placeholder=\"First\" required/>\n");
      out.write("      <input id=\"name\" type=\"text\" name=\"name\" placeholder=\"Last\" required/>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("      <label for=\"nic\">NIC<span>*</span></label>\n");
      out.write("      <div class=\"name-item\">\n");
      out.write("      <input id=\"nic\" type=\"text\" name=\"name\" disabled required/>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("      <label for=\"bdate\">Date of Birth<span>*</span></label>\n");
      out.write("      <input id=\"bdate\" type=\"date\" name=\"bdate\" disabled required/>\n");
      out.write("      <i class=\"fas fa-calendar-alt\"></i>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <div class=\"name-item\">\n");
      out.write("          <div>\n");
      out.write("            <label for=\"gender\">Gender<span>*</span></label>\n");
      out.write("                <select required class=\"drop\" disabled>\n");
      out.write("                  <option selected value=\"\" disabled selected>Gender</option>\n");
      out.write("                  <option value=\"1\">Male</option>\n");
      out.write("                  <option value=\"2\">Female</option>\n");
      out.write("                  <option value=\"3\">Other</option>\n");
      out.write("                </select>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <div class=\"name-item\">\n");
      out.write("          <div>\n");
      out.write("            <label for=\"maritalstatus\">Marital status</label>\n");
      out.write("              <select required class=\"drop\">\n");
      out.write("                <option selected value=\"\" disabled selected>Marital status</option>\n");
      out.write("                <option value=\"1\">Single</option>\n");
      out.write("                <option value=\"2\">Married</option>\n");
      out.write("                <option value=\"3\">Divorced</option>\n");
      out.write("                <option value=\"4\">Legal Separated</option>\n");
      out.write("              </select>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("      <label for=\"religion\">Religion</label>\n");
      out.write("      <input id=\"religion\" type=\"text\" name=\"text\" placeholder=\"Religion\" />\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("        <div class=\"item\">\n");
      out.write("          <label for=\"address\">Address<span>*</span></label>\n");
      out.write("          <input id=\"address\" type=\"text\" name=\"text\" placeholder=\"Street Address\" required/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("          <div class=\"name-item\">\n");
      out.write("            <div>\n");
      out.write("              <input type=\"text\" name=\"city\" placeholder=\"City\" />\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <input type=\"text\" name=\"state\" placeholder=\"State/region\" />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <div class=\"name-item\">\n");
      out.write("              <div>\n");
      out.write("                <input type=\"text\" name=\"code\" placeholder=\"ZIP Code\" />\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <select class=\"drop\">\n");
      out.write("                  <option selected value=\"\" disabled selected>Country</option>\n");
      out.write("                  <option value=\"1\">Australia</option>\n");
      out.write("                  <option value=\"2\">Brazil</option>\n");
      out.write("                  <option value=\"3\">Chaina</option>\n");
      out.write("                  <option value=\"4\">Denmark</option>\n");
      out.write("                  <option value=\"5\">France</option>\n");
      out.write("                  <option value=\"6\">Germany</option>\n");
      out.write("                  <option value=\"7\">Italy</option>\n");
      out.write("                  <option value=\"8\">Jermany</option>\n");
      out.write("                  <option value=\"9\">Korea</option>\n");
      out.write("                  <option value=\"10\">Lebanan</option>\n");
      out.write("                  <option value=\"11\">Mongolia</option>\n");
      out.write("                  <option value=\"12\">Nepal</option>\n");
      out.write("                  <option value=\"13\">Rusia</option>\n");
      out.write("                  <option value=\"14\">Sri Lanka</option>\n");
      out.write("                  <option value=\"15\">United Kingdom</option>\n");
      out.write("                  <option value=\"16\">United State of America</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"email\">Email<span>*</span></label>\n");
      out.write("            <input id=\"email\" type=\"text\" name=\"text\" placeholder=\"Email\" required/>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"phone\">Phone<span>*</span></label>\n");
      out.write("            <input id=\"phone\" type=\"text\" name=\"text\" placeholder=\"### ### ## ##\" required />\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <div class=\"name-item\">\n");
      out.write("          <div>\n");
      out.write("            <label for=\"bloodGroup\">Blood Group</label>\n");
      out.write("              <select required class=\"drop\" disabled>\n");
      out.write("                <option selected value=\"\" disabled selected>Blood Group</option>\n");
      out.write("                <option value=\"1\">O+</option>\n");
      out.write("                <option value=\"2\">O-</option>\n");
      out.write("                <option value=\"3\">A+</option>\n");
      out.write("                <option value=\"4\">A-</option>\n");
      out.write("                <option value=\"5\">B+</option>\n");
      out.write("                <option value=\"6\">B-</option>\n");
      out.write("                <option value=\"7\">AB+</option>\n");
      out.write("                <option value=\"8\">AB-</option>\n");
      out.write("              </select>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <fieldset>\n");
      out.write("      ");

         Date date = new Date();
         out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
      
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"btn-block\">\n");
      out.write("      <button type=\"submit\" href=\"/\">UPDATE</button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </body>\n");
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
