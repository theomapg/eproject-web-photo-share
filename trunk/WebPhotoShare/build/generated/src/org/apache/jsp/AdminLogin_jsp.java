package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Web Photo Share Group 195</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/screen.css\" type=\"text/css\" media=\"screen\" title=\"default\" />\n");
      out.write("        <!--  jquery core -->\n");
      out.write("        <script src=\"js/jquery/jquery-1.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom jquery scripts -->\n");
      out.write("        <script src=\"js/jquery/custom_jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->\n");
      out.write("        <script src=\"js/jquery/jquery.pngFix.pack.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(document).pngFix( );\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"login-bg\"> \n");
      out.write("        ");

            if(request.getAttribute("error")!=null) {
               out.print("<script>alert('"+request.getAttribute("error").toString()+"');</script>");
            }
            request.setAttribute("error", null);
        
      out.write("\n");
      out.write("        <!-- Start: login-holder -->\n");
      out.write("        <div id=\"login-holder\">\n");
      out.write("\n");
      out.write("            <!-- start logo -->\n");
      out.write("            <div id=\"logo-login\">\n");
      out.write("                <a href=\"index.html\"><img src=\"images/login/logo.gif\" width=\"156\" height=\"40\" alt=\"\" /></a>\n");
      out.write("            </div>\n");
      out.write("            <!-- end logo -->\n");
      out.write("\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            <!--  start loginbox ................................................................................. -->\n");
      out.write("            <div id=\"loginbox\">\n");
      out.write("\n");
      out.write("                <!--  start login-inner -->\n");
      out.write("                <div id=\"login-inner\">\n");
      out.write("                    <form name=\"login\" action=\"AdminLogin\" method=\"POST\">\n");
      out.write("\n");
      out.write("                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Username</th>\n");
      out.write("                                <td><input type=\"text\"  class=\"login-inp\" name=\"username\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Password</th>\n");
      out.write("                                <td><input type=\"password\" value=\"\"  name=\"password\" onfocus=\"this.value=''\" class=\"login-inp\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th></th>\n");
      out.write("                                <td valign=\"top\"><input type=\"checkbox\" class=\"checkbox-size\" id=\"login-check\" /><label for=\"login-check\">Remember me</label></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th></th>\n");
      out.write("                                <td><input type=\"submit\" class=\"submit-login\"  /></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <!--  end login-inner -->\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("            <!--  end loginbox -->\n");
      out.write("\n");
      out.write("            <!--  start forgotbox ................................................................................... -->\n");
      out.write("            <div id=\"forgotbox\">\n");
      out.write("                <div id=\"forgotbox-text\">Please send us your email and we'll reset your password.</div>\n");
      out.write("                <!--  start forgot-inner -->\n");
      out.write("                <div id=\"forgot-inner\">\n");
      out.write("                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Email address:</th>\n");
      out.write("                            <td><input type=\"text\" value=\"\"   class=\"login-inp\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th> </th>\n");
      out.write("                            <td><input type=\"button\" class=\"submit-login\"  /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <!--  end forgot-inner -->\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <a href=\"\" class=\"back-login\">Back to login</a>\n");
      out.write("            </div>\n");
      out.write("            <!--  end forgotbox -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End: login-holder -->\n");
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
