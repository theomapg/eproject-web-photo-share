package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import java.util.ArrayList;
import model.Account;

public final class ManagementAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Web Photo Share</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/screen.css\" type=\"text/css\" media=\"screen\" title=\"default\" />\n");
      out.write("        <!--[if IE]>\n");
      out.write("        <link rel=\"stylesheet\" media=\"all\" type=\"text/css\" href=\"css/pro_dropline_ie.css\" />\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!--  jquery core -->\n");
      out.write("        <script src=\"js/jquery/jquery-1.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!--  checkbox styling script -->\n");
      out.write("        <script src=\"js/jquery/ui.core.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery/ui.checkbox.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery/jquery.bind.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function(){\n");
      out.write("                $('input').checkBox();\n");
      out.write("                $('#toggle-all').click(function(){\n");
      out.write("                    $('#toggle-all').toggleClass('toggle-checked');\n");
      out.write("                    $('#mainform input[type=checkbox]').checkBox('toggle');\n");
      out.write("                    return false;\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>  \n");
      out.write("\n");
      out.write("        <![if !IE 7]>\n");
      out.write("\n");
      out.write("        <!--  styled select box script version 1 -->\n");
      out.write("        <script src=\"js/jquery/jquery.selectbox-0.5.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('.styledselect').selectbox({ inputClass: \"selectbox_styled\" });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <![endif]>\n");
      out.write("\n");
      out.write("        <!--  styled select box script version 2 --> \n");
      out.write("        <script src=\"js/jquery/jquery.selectbox-0.5_style_2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('.styledselect_form_1').selectbox({ inputClass: \"styledselect_form_1\" });\n");
      out.write("                $('.styledselect_form_2').selectbox({ inputClass: \"styledselect_form_2\" });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!--  styled select box script version 3 --> \n");
      out.write("        <script src=\"js/jquery/jquery.selectbox-0.5_style_2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('.styledselect_pages').selectbox({ inputClass: \"styledselect_pages\" });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!--  styled file upload script --> \n");
      out.write("        <script src=\"js/jquery/jquery.filestyle.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("            $(function() {\n");
      out.write("                $(\"input.file_1\").filestyle({ \n");
      out.write("                    image: \"images/forms/choose-file.gif\",\n");
      out.write("                    imageheight : 21,\n");
      out.write("                    imagewidth : 78,\n");
      out.write("                    width : 310\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- Custom jquery scripts -->\n");
      out.write("        <script src=\"js/jquery/custom_jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- Tooltips -->\n");
      out.write("        <script src=\"js/jquery/jquery.tooltip.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery/jquery.dimensions.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function() {\n");
      out.write("                $('a.info-tooltip ').tooltip({\n");
      out.write("                    track: true,\n");
      out.write("                    delay: 0,\n");
      out.write("                    fixPNG: true, \n");
      out.write("                    showURL: false,\n");
      out.write("                    showBody: \" - \",\n");
      out.write("                    top: -35,\n");
      out.write("                    left: 5\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--  date picker script -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/datePicker.css\" type=\"text/css\" />\n");
      out.write("        <script src=\"js/jquery/date.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery/jquery.datePicker.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("            $(function()\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                // initialise the \"Select date\" link\n");
      out.write("                $('#date-pick')\n");
      out.write("                .datePicker(\n");
      out.write("                // associate the link with a date picker\n");
      out.write("                {\n");
      out.write("                    createButton:false,\n");
      out.write("                    startDate:'01/01/2005',\n");
      out.write("                    endDate:'31/12/2020'\n");
      out.write("                }\n");
      out.write("            ).bind(\n");
      out.write("                // when the link is clicked display the date picker\n");
      out.write("                'click',\n");
      out.write("                function()\n");
      out.write("                {\n");
      out.write("                    updateSelects($(this).dpGetSelected()[0]);\n");
      out.write("                    $(this).dpDisplay();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            ).bind(\n");
      out.write("                // when a date is selected update the SELECTs\n");
      out.write("                'dateSelected',\n");
      out.write("                function(e, selectedDate, $td, state)\n");
      out.write("                {\n");
      out.write("                    updateSelects(selectedDate);\n");
      out.write("                }\n");
      out.write("            ).bind(\n");
      out.write("                'dpClosed',\n");
      out.write("                function(e, selected)\n");
      out.write("                {\n");
      out.write("                    updateSelects(selected[0]);\n");
      out.write("                }\n");
      out.write("            );\n");
      out.write("\t\n");
      out.write("                var updateSelects = function (selectedDate)\n");
      out.write("                {\n");
      out.write("                    var selectedDate = new Date(selectedDate);\n");
      out.write("                    $('#d option[value=' + selectedDate.getDate() + ']').attr('selected', 'selected');\n");
      out.write("                    $('#m option[value=' + (selectedDate.getMonth()+1) + ']').attr('selected', 'selected');\n");
      out.write("                    $('#y option[value=' + (selectedDate.getFullYear()) + ']').attr('selected', 'selected');\n");
      out.write("                }\n");
      out.write("                // listen for when the selects are changed and update the picker\n");
      out.write("                $('#d, #m, #y')\n");
      out.write("                .bind(\n");
      out.write("                'change',\n");
      out.write("                function()\n");
      out.write("                {\n");
      out.write("                    var d = new Date(\n");
      out.write("                    $('#y').val(),\n");
      out.write("                    $('#m').val()-1,\n");
      out.write("                    $('#d').val()\n");
      out.write("                );\n");
      out.write("                    $('#date-pick').dpSetSelected(d.asString());\n");
      out.write("                }\n");
      out.write("            );\n");
      out.write("\n");
      out.write("                // default the position of the selects to today\n");
      out.write("                var today = new Date();\n");
      out.write("                updateSelects(today.getTime());\n");
      out.write("\n");
      out.write("                // and update the datePicker to reflect it...\n");
      out.write("                $('#d').trigger('change');\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->\n");
      out.write("        <script src=\"js/jquery/jquery.pngFix.pack.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(document).pngFix( );\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- Phan Trang ===== Paging -->\n");
      out.write("        <script type=\"text/javascript\" src=\"JavaScript/jquery-1-3-2.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"JavaScript/jquery.tablesorter.pager.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"JavaScript/tablesorter.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"JavaScript/tablesorter_filter.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"cssPT/style.css\" type=\"text/css\"/>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function(){\n");
      out.write("                $(\"#myTable\").tablesorter({debug:false,widgets:['zebra'],sortList:[[0,0]]})\n");
      out.write("                .tablesorterPager({container:$(\"#pager\")})\n");
      out.write("                .tablesorterFilter({filterContainer:$(\"#filter-box\"),filterClearContainer:$(\"filter-clear-button\"),filterColumns:[0],filterCaseSensitive:false});\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        ");

            session = request.getSession();
            Account a= (Account)session.getAttribute("account");
            if(a==null) {
                out.print("<script>alert('You must be login system');window.location='AdminLogin.jsp';</script>");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("         ");

            if(request.getAttribute("msg")!=null) {
               out.print("<script>alert('"+request.getAttribute("msg").toString()+"');</script>");
            }
            request.setAttribute("msg", null);
        
      out.write("\n");
      out.write("        <!-- Start: page-top-outer -->\n");
      out.write("        <div id=\"page-top-outer\">    \n");
      out.write("\n");
      out.write("            <!-- Start: page-top -->\n");
      out.write("            <div id=\"page-top\">\n");
      out.write("\n");
      out.write("                <!-- start logo -->\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <a href=\"\"><img src=\"images/login/logo.gif\" width=\"156\" height=\"40\" alt=\"\" /></a>\n");
      out.write("                </div>\n");
      out.write("                <!-- end logo -->\n");
      out.write("\n");
      out.write("                <!--  start top-search -->\n");
      out.write("                <div id=\"top-search\">\n");
      out.write("                    <form name=\"frmSearch\" method=\"get\" id=\"frmSearch\" action=\"AdminSearch\">\n");
      out.write("                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"text\" value=\"\" class=\"top-search-inp\" name=\"search\"/></td>\n");
      out.write("                                <td>\n");
      out.write("                                    <select class=\"styledselect\" name=\"field\">\n");
      out.write("                                        <option value=\"All\"> All</option>\n");
      out.write("                                        <option value=\"Username\"> UserName</option>\n");
      out.write("                                        <option value=\"Email\"> Email</option>\n");
      out.write("                                        <option value=\"Status\"> Active</option>\n");
      out.write("                                        <option value=\"Admin\"> Admin</option>\n");
      out.write("                                    </select> \n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"submit\" name=\"submit\" value=\"\" id=\"btnSubmit\" style=\"width: 65px; height: 29px; border: none; background-image: url(images/shared/top_search_btn.gif)\"/>\n");
      out.write("                                    <!--<input type=\"image\" src=\"images/shared/top_search_btn.gif\" onclick=\"\"/>-->\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <!--  end top-search -->\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- End: page-top -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End: page-top-outer -->\n");
      out.write("\n");
      out.write("        <div class=\"clear\">&nbsp;</div>\n");
      out.write("\n");
      out.write("        <!--  start nav-outer-repeat................................................................................................. START -->\n");
      out.write("        <div class=\"nav-outer-repeat\"> \n");
      out.write("            <!--  start nav-outer -->\n");
      out.write("            <div class=\"nav-outer\"> \n");
      out.write("\n");
      out.write("                <!-- start nav-right -->\n");
      out.write("                <div id=\"nav-right\">\n");
      out.write("\n");
      out.write("                    <div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("                    <div class=\"showhide-account\"><img src=\"images/shared/nav/nav_myaccount.gif\" width=\"93\" height=\"14\" alt=\"\" /></div>\n");
      out.write("                    <div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("                    <a href=\"AdminLogout\" id=\"logout\"><img src=\"images/shared/nav/nav_logout.gif\" width=\"64\" height=\"14\" alt=\"\" /></a>\n");
      out.write("                    <div class=\"clear\">&nbsp;</div>\n");
      out.write("\n");
      out.write("                    <!--  start account-content -->\t\n");
      out.write("\n");
      out.write("                    <!--  end account-content -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- end nav-right -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--  start nav -->\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <div class=\"table\">\n");
      out.write("\n");
      out.write("                        <ul class=\"current\"><li><a href=\"ManagementAccount.jsp\"><b>Account</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("                                <!--[if lte IE 6]><table><tr><td><![endif]-->\n");
      out.write("\n");
      out.write("                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\n");
      out.write("                        <ul class=\"select\"><li><a href=\"#nogo\"><b>Albums</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("                                <!--[if lte IE 6]><table><tr><td><![endif]-->\n");
      out.write("\n");
      out.write("                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\n");
      out.write("                        <ul class=\"select\"><li><a href=\"#nogo\"><b>Photos</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("                                <!--[if lte IE 6]><table><tr><td><![endif]-->\n");
      out.write("\n");
      out.write("                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\n");
      out.write("                        <ul class=\"select\"><li><a href=\"#nogo\"><b>FeedBack</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("                                <!--[if lte IE 6]><table><tr><td><![endif]-->\n");
      out.write("\n");
      out.write("                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\n");
      out.write("                        <ul class=\"select\"><li><a href=\"#nogo\"><b>FAQs</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("                                <!--[if lte IE 6]><table><tr><td><![endif]-->\n");
      out.write("\n");
      out.write("                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("                <!--  start nav -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <!--  start nav-outer -->\n");
      out.write("        </div>\n");
      out.write("        <!--  start nav-outer-repeat................................................... END -->\n");
      out.write("\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("        <!-- start content-outer ........................................................................................................................START -->\n");
      out.write("        <div id=\"content-outer\">\n");
      out.write("            <!-- start content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <!--  start page-heading -->\n");
      out.write("                <div id=\"page-heading\">\n");
      out.write("                    <h1>Management Account</h1>\n");
      out.write("                </div>\n");
      out.write("                <!-- end page-heading -->\n");
      out.write("\n");
      out.write("                <table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" id=\"content-table\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th rowspan=\"3\" class=\"sized\"><img src=\"images/shared/side_shadowleft.jpg\" width=\"20\" height=\"300\" alt=\"\" /></th>\n");
      out.write("                        <th class=\"topleft\"></th>\n");
      out.write("                        <td id=\"tbl-border-top\">&nbsp;</td>\n");
      out.write("                        <th class=\"topright\"></th>\n");
      out.write("                        <th rowspan=\"3\" class=\"sized\"><img src=\"images/shared/side_shadowright.jpg\" width=\"20\" height=\"300\" alt=\"\" /></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"tbl-border-left\"></td>\n");
      out.write("                        <td>\n");
      out.write("                            <!--  start content-table-inner ...................................................................... START -->\n");
      out.write("                            <div id=\"content-table-inner\">\n");
      out.write("\n");
      out.write("                                <!--  start table-content  -->\n");
      out.write("                                <div id=\"table-content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    ");

                                        ArrayList arr = new ArrayList();
                                        if (request.getAttribute("info") != null) {
                                            arr = (ArrayList) request.getAttribute("info");
                                        } else {
                                            Account acc = new Account();
                                            arr = acc.getAll();
                                        }

                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <!--  start product-table ..................................................................................... -->\n");
      out.write("                                    <!--                                    <form id=\"mainform\" action=\"\">-->\n");
      out.write("                                    <form name=\"frmView\" id=\"frmView\" method=\"post\" action=\"AdminDeletes\">\n");
      out.write("                                        <table border=\"1\" id=\"myTable\" class=\"tablesorter\">\n");
      out.write("\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th></th>\n");
      out.write("                                                    <th>Account ID</th>\n");
      out.write("                                                    <th>UserName</th>\n");
      out.write("                                                    <th>FullName</th>\n");
      out.write("                                                    <th>Gender</th>\n");
      out.write("                                                    <th>Address</th>\n");
      out.write("                                                    <th>Birthday</th>\n");
      out.write("                                                    <th>Email</th>\n");
      out.write("                                                    <th>Date Create</th>\n");
      out.write("                                                    <th>Role Name</th>\n");
      out.write("                                                    <th>Active</th>\n");
      out.write("                                                    <th>Edit</th>\n");
      out.write("                                                    <th>Del</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");


                                                    for (Object o : arr) {
                                                        Account s = new Account();
                                                        s = (Account) o;
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td><input type=\"checkbox\" name=\"items\" value=\"");
 out.print(s.getAccountId()); 
      out.write("\" /></td>\n");
      out.write("                                                    <td>");
 out.print(s.getAccountId());
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.print(s.getUserName());
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.print(s.getFullName());
      out.write("</td>  \n");
      out.write("                                                    <td>");

                                                        if (s.isGender()) {
                                                            out.print("Male");
                                                        } else {
                                                            out.print("Female");
                                                        }
                                                        
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.print(s.getAddress());
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.print(s.getBirthday());
      out.write("</td> \n");
      out.write("                                                    <td>");
 out.print(s.getEmail());
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.print(s.getDateCreate().toString());
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.print(s.getRoleName());
      out.write("</td>\n");
      out.write("                                                    <td>");

                                                        if (s.isStatus()) {
                                                        
      out.write("\n");
      out.write("                                                        <input type=\"checkbox\" name=\"status\" disabled=\"true\" checked=\"true\" />\n");
      out.write("                                                        ");
                                                            } else {
                                                        
      out.write("\n");
      out.write("                                                        <input type=\"checkbox\" name=\"status\" disabled=\"true\" />\n");
      out.write("                                                        ");
                                                                }
                                                        
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");

                                                            if (s.getRoleId() == 0) {
                                                        
      out.write("\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                        ");

                                                            } else {
                                                        
      out.write("\n");
      out.write("                                                            <a href=\"EditAccount.jsp\"><img src=\"images/user_edit.png\" alt=\"\" title=\"\" border=\"0\" /></a>\n");
      out.write("                                                            ");
                                                                    }
                                                            
      out.write("\n");
      out.write("                                                       </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");

                                                            if (s.getRoleId() == 0) {
                                                        
      out.write("\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                        ");

                                                            } else {
                                                        
      out.write("\n");
      out.write("                                                            <a onClick=\"if(confirm('Are you sure?')) {window.location='AdminDelete?accid=");
out.print(s.getAccountId());
      out.write("';}\"><img src=\"images/trash.png\" alt=\"\" title=\"\" border=\"0\" /></a>\n");
      out.write("                                                            ");
                                                                    }
                                                            
      out.write("\n");
      out.write("\n");
      out.write("                                                    </td>             \n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
                                                
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div id=\"pager\" class=\"pager\">\n");
      out.write("                                                <input type=\"button\" value=\"<<\" name=\"first\" class=\"first\"/>\n");
      out.write("                                                <input type=\"button\" value=\"<\" name=\"prev\" class=\"prev\"/>\n");
      out.write("                                                <input type=\"text\" name=\"pagedisplay\" class=\"pagedisplay\"/>\n");
      out.write("                                                <input type=\"button\" value=\">\" name=\"next\" class=\"next\"/>\n");
      out.write("                                                <input type=\"button\" value=\">>\" name=\"last\" class=\"last\"/>\n");
      out.write("                                                <select class=\"pagesize\">\n");
      out.write("                                                    <option value=\"2\">2</option>\n");
      out.write("                                                    <option value=\"10\" selected=\"selected\">10</option>\n");
      out.write("                                                    <option value=\"20\">20</option>\n");
      out.write("                                                    <option value=\"40\">40</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"width: 100px; float: right; text-align: right\">\n");
      out.write("                                                <input type=\"submit\" name=\"button\" value=\"Deletes\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                    <!--  end product-table................................... --> \n");
      out.write("                                    <!--</form>-->\n");
      out.write("                                </div>\n");
      out.write("                                <!--  end content-table  -->\n");
      out.write("\n");
      out.write("                                <!--  start actions-box ............................................... -->\n");
      out.write("\n");
      out.write("                                <!-- end actions-box........... -->\n");
      out.write("\n");
      out.write("                                <!--  start paging..................................................... -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!--  end paging................ -->\n");
      out.write("\n");
      out.write("                                <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!--  end content-table-inner ............................................END  -->\n");
      out.write("                        </td>\n");
      out.write("                        <td id=\"tbl-border-right\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"sized bottomleft\"></th>\n");
      out.write("                        <td id=\"tbl-border-bottom\">&nbsp;</td>\n");
      out.write("                        <th class=\"sized bottomright\"></th>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <div class=\"clear\">&nbsp;</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!--  end content -->\n");
      out.write("            <div class=\"clear\">&nbsp;</div>\n");
      out.write("        </div>\n");
      out.write("        <!--  end content-outer........................................................END -->\n");
      out.write("\n");
      out.write("        <div class=\"clear\">&nbsp;</div>\n");
      out.write("\n");
      out.write("        <!-- start footer -->         \n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <!--  start footer-left -->\n");
      out.write("            <div id=\"footer-left\">\n");
      out.write("\n");
      out.write("                Admin Skin . <span id=\"spanYear\"></span> <a href=\"\">www.Group_195</a>. All rights reserved.</div>\n");
      out.write("            <!--  end footer-left -->\n");
      out.write("            <div class=\"clear\">&nbsp;</div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end footer -->\n");
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
