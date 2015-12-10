package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./style.css\" /> \n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add a new Customer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("            <div class=\"Header\">\n");
      out.write("                <h1>Add a new Customer</h1>\n");
      out.write("                <p1>\n");
      out.write("                    <form name=\"searchForm\" action=\"search\" method=\"get\">\n");
      out.write("\n");
      out.write("                        <input type=\"text\" name=\"searchVal\" value=\"Search by Last Name\"/>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" name=\"submit\" value=\"Search\"/>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </p1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <form name=\"addForm\" action=\"addcustomer\" method=\"get\"/>\n");
      out.write("                <p>\n");
      out.write("                    <label>First Name</label>\n");
      out.write("                    <input type=\"text\" name=\"firstName\" value=\"\"/>\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("\n");
      out.write("                    <label>Last Name</label>\n");
      out.write("                    <input type=\"text\" name=\"lastName\" value=\"\"/>\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <label>Address 1</label>\n");
      out.write("                    <input type=\"text\" name=\"addr1\" value=\"\"/>\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <label>Address 2</label>\n");
      out.write("                    <input type=\"text\" name=\"addr2\" value=\"\"/>\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <label>City</label>\n");
      out.write("                    <input type=\"text\" name=\"city\" value=\"\"/>\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <label>State</label>\n");
      out.write("                    <input type=\"text\" name=\"state\" value=\"\"/>\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <label>Zip</label>\n");
      out.write("                    <input type=\"text\" name=\"zip\" value=\"\"/>\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <label>Email Address</label>\n");
      out.write("                    <input type=\"text\" name=\"emailAddr\" value=\"\"/>\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <label>Age</label>\n");
      out.write("                    <input type=\"text\" name=\"age\" value=\"\"/>\n");
      out.write("                    <br>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\"  name=\"submit\" value=\"Submit\"/>\n");
      out.write("                </p>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <h2>\n");
      out.write("                    Software Development and Design. Ahmad Wagdy\n");
      out.write("                </h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
