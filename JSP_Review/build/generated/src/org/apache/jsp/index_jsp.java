package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int num1; 
 int num2; 
 int ans; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/date.jsp");
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
      			"error.jsp", true, 8192, true);
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .big{\n");
      out.write("                font-family: Arial,Verdana,sans-serif;\n");
      out.write("                font-size: 2em;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");
out.println("This is JSP page");
      out.write("\n");
      out.write("        <p align=\"center\">\n");
      out.write("            <font color=\"red\" size=\"7\">\n");
      out.write("                ");
      out.print( "Java Server Pages" );
      out.write("\n");
      out.write("            </font>\n");
      out.write("        </p>\n");
      out.write("        <p align=\"\"center>\n");
      out.write("            <font color=\"green\" size=\"15\" face=\"Arial\">\n");
      out.write("                ");
      out.print( "Welcome to JSP coding" );
      out.write("\n");
      out.write("            </font>\n");
      out.write("        </p>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 
                num1=45;
                num2=Integer.parseInt("32");
                ans = num1 + num2;
                out.println("The result is = " + ans);
        
      out.write("\n");
      out.write("        <p class=\"big\"> Current Date & Time is :-\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            Date d = new Date();
        
      out.write("\n");
      out.write("        <h1>\n");
      out.write("            ");
 out.println(d.toString());
      out.write("\n");
      out.write("        </h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter a number: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtNum\" />\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td><input type=\"submit\" name=\"B1\" value=\"Divide by zero\" />\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        ");

        if(request.getParameter("txtNum") != null)
        {
            if(!request.getParameter("txtNum").equals(" "))
            {
                int div = Integer.parseInt(request.getParameter("txtNum")) / 0;
                out.println("Answer is: " + div);
            }
        }
        else
        {
            out.println("<html><font color=red>Please enter a number!</font></html>");
        }
        
      out.write("\n");
      out.write("    </body>\n");
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
