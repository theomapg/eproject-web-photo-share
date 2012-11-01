<%-- 
    Document   : EditAccount
    Created on : Oct 28, 2012, 2:06:34 AM
    Author     : CMC
--%>

<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Photo Share</title>

        <link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" title="default" />
        <!--[if IE]>
        <link rel="stylesheet" media="all" type="text/css" href="css/pro_dropline_ie.css" />
        <![endif]-->

        <!--  jquery core -->
        <script src="js/jquery/jquery-1.4.1.min.js" type="text/javascript"></script>

        <!--  checkbox styling script -->
        <script src="js/jquery/ui.core.js" type="text/javascript"></script>
        <script src="js/jquery/ui.checkbox.js" type="text/javascript"></script>
        <script src="js/jquery/jquery.bind.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(function(){
                $('input').checkBox();
                $('#toggle-all').click(function(){
                    $('#toggle-all').toggleClass('toggle-checked');
                    $('#mainform input[type=checkbox]').checkBox('toggle');
                    return false;
                });
            });
        </script>  
        <%-- Date time --%>

        <![if !IE 7]>

        <!--  styled select box script version 1 -->
        <script src="js/jquery/jquery.selectbox-0.5.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('.styledselect').selectbox({ inputClass: "selectbox_styled" });
            });
        </script>


        <![endif]>

        <!--  styled select box script version 2 --> 
        <script src="js/jquery/jquery.selectbox-0.5_style_2.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('.styledselect_form_1').selectbox({ inputClass: "styledselect_form_1" });
                $('.styledselect_form_2').selectbox({ inputClass: "styledselect_form_2" });
            });
        </script>

        <!--  styled select box script version 3 --> 
        <script src="js/jquery/jquery.selectbox-0.5_style_2.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('.styledselect_pages').selectbox({ inputClass: "styledselect_pages" });
            });
        </script>

        <!--  styled file upload script --> 
        <script src="js/jquery/jquery.filestyle.js" type="text/javascript"></script>
        <script type="text/javascript" charset="utf-8">
            $(function() {
                $("input.file_1").filestyle({ 
                    image: "images/forms/choose-file.gif",
                    imageheight : 21,
                    imagewidth : 78,
                    width : 310
                });
            });
        </script>

        <!-- Custom jquery scripts -->
        <script src="js/jquery/custom_jquery.js" type="text/javascript"></script>

        <!-- Tooltips -->
        <script src="js/jquery/jquery.tooltip.js" type="text/javascript"></script>
        <script src="js/jquery/jquery.dimensions.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(function() {
                $('a.info-tooltip ').tooltip({
                    track: true,
                    delay: 0,
                    fixPNG: true, 
                    showURL: false,
                    showBody: " - ",
                    top: -35,
                    left: 5
                });
            });
        </script> 




        <!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
        <script src="js/jquery/jquery.pngFix.pack.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $(document).pngFix( );
            });
        </script>
        <%-- Datetime --%>

        <style type="text/css">
<!--
.style1 {color: #FFFFFF}
.style5 {color: #FFFFFF; font-weight: bold; font-size: 18px; }
-->
</style>
    </head>
    <body> 
        <%
            session = request.getSession();
            Account a = (Account) session.getAttribute("account");
            if (a == null) {
                out.print("<script>alert('You must be login system');window.location='AdminLogin.jsp';</script>");
            } else {
        %>

        <%
            if (request.getAttribute("msg") != null) {
                out.print("<script>alert('" + request.getAttribute("msg").toString() + "');</script>");
            }
            request.setAttribute("msg", null);
        %>
        <!-- Start: page-top-outer -->
        <div id="page-top-outer">    

            <!-- Start: page-top -->
            <div id="page-top">

                <!-- start logo -->
                <div id="logo">
                    <a href=""><img src="images/login/logo.gif" width="156" height="40" alt="" /></a>
                </div>
                <!-- end logo -->

                <!--  start top-search -->
                <div id="top-search">
                    <form name="frmSearch" method="get" id="frmSearch" action="AdminSearch">
                        <table border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td><input type="text" value="" class="top-search-inp" name="search" disabled="true"/></td>
                                <td>
                                    <select class="styledselect" name="field" disabled="true">
                                        <option value="All"> All</option>
                                        <option value="Username"> UserName</option>
                                        <option value="Email"> Email</option>
                                        <option value="Status"> Active</option>
                                        <option value="Admin"> Admin</option>
                                    </select> 
                                </td>
                                <td>
                                    <input type="submit" name="submit" value="" disabled="false" id="btnSubmit" style="width: 65px; height: 29px; border: none; background-image: url(images/shared/top_search_btn.gif)"/>
                                    <!--<input type="image" src="images/shared/top_search_btn.gif" onclick=""/>-->
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
                <!--  end top-search -->
                <div class="clear"></div>

            </div>
            <!-- End: page-top -->

        </div>
        <!-- End: page-top-outer -->

        <div class="clear">&nbsp;</div>

        <!--  start nav-outer-repeat................................................................................................. START -->
        <div class="nav-outer-repeat"> 
            <!--  start nav-outer -->
            <div class="nav-outer"> 

                <!-- start nav-right -->
                <div class="nava">
                    <div class="table">

                        <ul class="select"><li><a><b>Hi! <% out.print(a.getUserName());%></b><!--[if IE 7]><!--></a><!--<![endif]-->
                                <!--[if lte IE 6]><table><tr><td><![endif]-->

                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->
                            </li>
                        </ul>

                        <div class="nav-divider">&nbsp;</div>

                        <ul class="current"><li><a href="AdminLogout"><b>Logout</b><!--[if IE 7]><!--></a><!--<![endif]-->
                                <!--[if lte IE 6]><table><tr><td><![endif]-->

                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->
                            </li>
                        </ul>

                    </div>
                </div>
                <%--   <div id="nav-right">

                    <div class="nav-divider">&nbsp;</div>
                    <div class="showhide-account"><img src="images/shared/nav/nav_myaccount.gif" width="93" height="14"/></div>
                    <div class="nav-divider">&nbsp;</div>
                    <a href="" id="logout"><img src="images/shared/nav/nav_logout.gif" width="64" height="14"/></a>
                    <div class="clear">&nbsp;</div>

                    <!--  start account-content -->	

                    <!--  end account-content -->

                </div> --%>
                <!-- end nav-right -->


                <!--  start nav -->
                <div class="nav">
                    <div class="table">

                        <ul class="select"><li><a href="ManagementAccount.jsp"><b>Account</b><!--[if IE 7]><!--></a><!--<![endif]-->
                                <!--[if lte IE 6]><table><tr><td><![endif]-->

                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->
                            </li>
                        </ul>

                        <!--<div class="nav-divider">&nbsp;</div>-->

                        <!--                        <ul class="select"><li><a href="#nogo"><b>Albums</b>[if IE 7]><!</a><![endif]
                                                        [if lte IE 6]><table><tr><td><![endif]
                        
                                                        [if lte IE 6]></td></tr></table></a><![endif]
                                                    </li>
                                                </ul>-->

                        <div class="nav-divider">&nbsp;</div>

                        <ul class="select"><li><a href="#nogo"><b>Category</b><!--[if IE 7]><!--></a><!--<![endif]-->
                                <!--[if lte IE 6]><table><tr><td><![endif]-->

                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->
                            </li>
                        </ul>

                        <div class="nav-divider">&nbsp;</div>

                        <ul class="select"><li><a href="ManagementFeedback.jsp"><b>FeedBack</b><!--[if IE 7]><!--></a><!--<![endif]-->
                                <!--[if lte IE 6]><table><tr><td><![endif]-->

                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->
                            </li>
                        </ul>

                        <div class="nav-divider">&nbsp;</div>

                        <ul class="select"><li><a href="ManagementFaqs.jsp"><b>FAQs</b><!--[if IE 7]><!--></a><!--<![endif]-->                      
                                <!--[if lte IE 6]><table><tr><td><![endif]-->

                                <!--[if lte IE 6]></td></tr></table></a><![endif]-->
                            </li>
                        </ul>

                        <div class="clear"></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <!--  start nav -->

            </div>
            <div class="clear"></div>
            <!--  start nav-outer -->
        </div>
        <!--  start nav-outer-repeat................................................... END -->

        <div class="clear"></div>

        <!-- start content-outer ........................................................................................................................START -->
        <div id="content-outer">
            <!-- start content -->
            <div id="content">

                <!--  start page-heading -->
                <div id="page-heading">
                    <h1>Edit Account</h1>
                </div>
                <!-- end page-heading -->
                <table border="0" width="100%" cellpadding="0" cellspacing="0" id="content-table">
                    <tr>
                        <th rowspan="3" class="sized"><img src="images/shared/side_shadowleft.jpg" width="20" height="300" alt="" /></th>
                        <th class="topleft"></th>
                        <td id="tbl-border-top">&nbsp;</td>
                        <th class="topright"></th>
                        <th rowspan="3" class="sized"><img src="images/shared/side_shadowright.jpg" width="20" height="300" alt="" /></th>
                    </tr>
                    <tr>
                        <td id="tbl-border-left"></td>
                        <td>
                            <!--  start content-table-inner -->
                            <div id="content-table-inner">
                                <%
                                    int accid = Integer.parseInt(request.getParameter("accid"));
                                    Account aEdit = new Account().getById(accid);
                                %>
                                <table border="0" width="100%" cellpadding="0" cellspacing="0">
                                    <tr valign="top">
                                        <td>
                                            <form name="frmEdit" action="AdminEditAccout" method="post">
                                                <!-- start id-form -->
                                                 <table width="100%" border="1" cellspacing="1" cellpadding="1" style="height: 300px">
  <tr>
    <td bgcolor="#666666"><div align="center" class="style5">Module</div></td>
    <td bgcolor="#666666"><div align="center" class="style5">Content</div></td>
    <td bgcolor="#666666"><div align="center" class="style5">Value</div></td>
  </tr>
  <tr>
    <td rowspan="2"><div align="center"><strong>Account</strong></div></td>
    <td><div align="left">Already Activated</div></td>
    <td><div align="center"></div></td>
  </tr>
  <tr>
    <td><div align="left">Not Activated</div></td>
    <td><div align="center"></div></td>
  </tr>
  <tr>
    <td rowspan="2"><div align="center" class="style1">Albums</div></td>
    <td><div align="left">Old Albums</div></td>
    <td><div align="center"></div></td>
  </tr>
  <tr>
    <td><div align="left">New Albums</div></td>
    <td><div align="center"></div></td>
  </tr>
  <tr>
    <td rowspan="2"><div align="center"><strong>Feedback</strong></div></td>
    <td><div align="left">Question Feedback</div></td>
    <td><div align="center"></div></td>
  </tr>
  <tr>
    <td><div align="left">Answer Feedback</div></td>
    <td><div align="center"></div></td>
  </tr>
</table>

                                                <!-- end id-form  -->
                                            </form>
                                        </td>
                                        <td>

                                            <!--  start related-activities -->
                                            <div id="related-activities">

                                                <!--  start related-act-top -->
                                                <div id="related-act-top">
                                                    <img src="images/forms/header_related_act.gif" width="271" height="43" alt="" />
                                                </div>
                                                <!-- end related-act-top -->

                                                <!--  start related-act-bottom -->
                                                <div id="related-act-bottom">

                                                    <!--  start related-act-inner -->
                                                    <div id="related-act-inner">

                                                        <div class="left"><a href=""><img src="images/forms/icon_plus.gif" width="21" height="21" alt="" /></a></div>
                                                        <div class="right">
                                                            <h5>Add New Account</h5>

                                                            <ul class="greyarrow">
                                                                <li><a href="Register.jsp">Click here to visit</a></li> 

                                                            </ul>
                                                        </div>


                                                        <div class="clear"></div>
                                                        <div class="lines-dotted-short"></div>

                                                        <div class="left"><a href=""><img src="images/forms/icon_edit.gif" width="21" height="21" alt="" /></a></div>
                                                        <div class="right">
                                                            <h5>View List Account</h5>

                                                            <ul class="greyarrow">
                                                                <li><a href="ManagementAccount.jsp">Click here to visit</a></li> 

                                                            </ul>
                                                        </div>
                                                        <div class="clear"></div>

                                                    </div>
                                                    <!-- end related-act-inner -->
                                                    <div class="clear"></div>

                                                </div>
                                                <!-- end related-act-bottom -->

                                            </div>
                                            <!-- end related-activities -->

                                        </td>
                                    </tr>
                                    <tr>
                                        <td><img src="images/shared/blank.gif" width="695" height="1" alt="blank" /></td>
                                        <td></td>
                                    </tr>
                                </table>

                                <div class="clear"></div>


                            </div>
                            <!--  end content-table-inner  -->
                        </td>
                        <td id="tbl-border-right"></td>
                    </tr>
                    <tr>
                        <th class="sized bottomleft"></th>
                        <td id="tbl-border-bottom">&nbsp;</td>
                        <th class="sized bottomright"></th>
                    </tr>
                </table>
                <div class="clear">&nbsp;</div>

            </div>
            <!--  end content -->
            <div class="clear">&nbsp;</div>
        </div>
        <!--  end content-outer........................................................END -->

        <div class="clear">&nbsp;</div>

        <!-- start footer -->         
        <div id="footer">
            <!--  start footer-left -->
            <div id="footer-left">

                Admin Skin &copy; Group 195 <span id="spanYear"></span> <a href="">www.Group195.com</a>. All rights reserved.</div>
            <!--  end footer-left -->
            <div class="clear">&nbsp;</div>
        </div>
        <!-- end footer -->
        <%}%>
    </body>
</html>
