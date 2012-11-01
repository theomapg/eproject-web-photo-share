<%-- 
    Document   : ManagementAccount
    Created on : Oct 28, 2012, 12:43:26 AM
    Author     : CMC
--%>

<%@page import="model.Feedback"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="model.Account"%>
<!DOCTYPE html>
<html>
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


        <!--  date picker script -->
        <link rel="stylesheet" href="css/datePicker.css" type="text/css" />
        <script src="js/jquery/date.js" type="text/javascript"></script>
        <script src="js/jquery/jquery.datePicker.js" type="text/javascript"></script>
        <script type="text/javascript" charset="utf-8">
            $(function()
            {

                // initialise the "Select date" link
                $('#date-pick')
                .datePicker(
                // associate the link with a date picker
                {
                    createButton:false,
                    startDate:'01/01/2005',
                    endDate:'31/12/2020'
                }
            ).bind(
                // when the link is clicked display the date picker
                'click',
                function()
                {
                    updateSelects($(this).dpGetSelected()[0]);
                    $(this).dpDisplay();
                    return false;
                }
            ).bind(
                // when a date is selected update the SELECTs
                'dateSelected',
                function(e, selectedDate, $td, state)
                {
                    updateSelects(selectedDate);
                }
            ).bind(
                'dpClosed',
                function(e, selected)
                {
                    updateSelects(selected[0]);
                }
            );
	
                var updateSelects = function (selectedDate)
                {
                    var selectedDate = new Date(selectedDate);
                    $('#d option[value=' + selectedDate.getDate() + ']').attr('selected', 'selected');
                    $('#m option[value=' + (selectedDate.getMonth()+1) + ']').attr('selected', 'selected');
                    $('#y option[value=' + (selectedDate.getFullYear()) + ']').attr('selected', 'selected');
                }
                // listen for when the selects are changed and update the picker
                $('#d, #m, #y')
                .bind(
                'change',
                function()
                {
                    var d = new Date(
                    $('#y').val(),
                    $('#m').val()-1,
                    $('#d').val()
                );
                    $('#date-pick').dpSetSelected(d.asString());
                }
            );

                // default the position of the selects to today
                var today = new Date();
                updateSelects(today.getTime());

                // and update the datePicker to reflect it...
                $('#d').trigger('change');
            });
        </script>

        <!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
        <script src="js/jquery/jquery.pngFix.pack.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $(document).pngFix( );
            });
        </script>
        <!-- Phan Trang ===== Paging -->
        <script type="text/javascript" src="JavaScript/jquery-1-3-2.js"></script>
        <script type="text/javascript" src="JavaScript/jquery.tablesorter.pager.js"></script>
        <script type="text/javascript" src="JavaScript/tablesorter.js"></script>
        <script type="text/javascript" src="JavaScript/tablesorter_filter.js"></script>
        <link rel="stylesheet" href="cssPT/style.css" type="text/css"/>
        <script type="text/javascript">
            jQuery(document).ready(function(){
                $("#myTable").tablesorter({debug:false,widgets:['zebra'],sortList:[[0,0]]})
                .tablesorterPager({container:$("#pager")})
                .tablesorterFilter({filterContainer:$("#filter-box"),filterClearContainer:$("filter-clear-button"),filterColumns:[0],filterCaseSensitive:false});
            });
        </script>
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
                    <form name="frmSearch" method="get" id="frmSearch" action="FeedBackSearch">
                        <table border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td><input type="text" value="" class="top-search-inp" name="search"/></td>
                                <td>
                                    <select class="styledselect" name="field">
                                        <option value="All"> All</option>
                                        <option value="Username"> UserName</option>
                                        <option value="DateCreate"> DateCreate</option>
                                        <option value="status"> Status</option>
                                    </select> 
                                </td>
                                <td>
                                    <input type="submit" name="submit" value="" id="btnSubmit" style="width: 65px; height: 29px; border: none; background-image: url(images/shared/top_search_btn.gif)"/>
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
                <%--  <div id="nav-right">

                    <div class="nav-divider">&nbsp;</div>
                    <div class="showhide-account"><img src="images/shared/nav/nav_myaccount.gif" width="93" height="14" alt="" /></div>
                    <div class="nav-divider">&nbsp;</div>
                    <a href="AdminLogout" id="logout"><img src="images/shared/nav/nav_logout.gif" width="64" height="14" alt="" /></a>
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

                        <!--                        <div class="nav-divider">&nbsp;</div>
                        
                                                <ul class="select"><li><a href="#nogo"><b>Albums</b>[if IE 7]><!</a><![endif]
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

                        <ul class="current"><li><a href="ManagementFeedback.jsp"><b>FeedBack</b><!--[if IE 7]><!--></a><!--<![endif]-->
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
                    <h1>Management Account</h1>
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
                            <!--  start content-table-inner ...................................................................... START -->
                            <div id="content-table-inner">

                                <!--  start table-content  -->
                                <div id="table-content">


                                    <%
                                        ArrayList arr = new ArrayList();
                                        if (request.getAttribute("info") != null) {
                                            arr = (ArrayList) request.getAttribute("info");
                                        } else {
                                            Feedback f = new Feedback();
                                            arr = f.getAll();
                                        }
                                         if(arr!=null){
                                    %>

                                    <!--  start product-table ..................................................................................... -->
                                    <!--                                    <form id="mainform" action="">-->
                                    <form name="frmView" id="frmView" method="post" action="FeedBackDeletes" onsubmit="return confirm('Are you sure?');">
                                        <table border="1" id="myTable" class="tablesorter">

                                            <thead>
                                                <tr>
                                                    <th></th>
                                                    <th>Feedback ID</th>
                                                    <th>Question</th>
                                                    <th>Username</th>
                                                    <th>DateCreate</th>
                                                    <th>Status</th>
                                                    <th>Edit</th>
                                                    <th>Delete</th>
                                                </tr>
                                            </thead>

                                            <tbody>
                                                <%

                                                    for (Object o : arr) {
                                                        Feedback s = new Feedback();
                                                        s = (Feedback) o;
                                                %>
                                                <tr>
                                                    <td><input type="checkbox" name="items" value="<% out.print(s.getFeedbackId());%>" /></td>
                                                    <td><% out.print(s.getFeedbackId());%></td>
                                                    <td><% out.print(s.getQuestionF());%></td>
                                                    <td><% out.print(s.getUsername());%></td>  
                                                    <td><% out.print(s.getDateCreate());%></td>  
                                                    <td><%
                                                        if (s.isStatus()==true) {
                                                            out.print("Read");
                                                        } else {
                                                            out.print("UnRead");
                                                        }
                                                        %></td>
                                                    
                                                    <td><a href="EditFeedBack.jsp?fid=<%out.print(s.getFeedbackId());%>"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
                                                    <td><a onClick="if(confirm('Are you sure?')) {window.location='FeedBackDelete?fid=<%out.print(s.getFeedbackId());%>';}"><img src="images/trash.png" alt="" title="" border="0" /></a></td>           
                                                </tr>
                                                <%}
                                                %>
                                            </tbody>
                                        </table>
                                        <div>
                                            <div id="pager" class="pager">
                                                <input type="button" value="<<" name="first" class="first"/>
                                                <input type="button" value="<" name="prev" class="prev"/>
                                                <input type="text" name="pagedisplay" class="pagedisplay"/>
                                                <input type="button" value=">" name="next" class="next"/>
                                                <input type="button" value=">>" name="last" class="last"/>
                                                <select class="pagesize">
                                                    <option value="2">2</option>
                                                    <option value="10" selected="selected">10</option>
                                                    <option value="20">20</option>
                                                    <option value="40">40</option>
                                                </select>
                                            </div>
                                            <div style="width: 100px; float: right; text-align: right">
                                                <input type="submit" name="button" value="Deletes"/>
                                            </div>
                                        </div>

                                    </form>
                                    <%}else{
                                        out.print("<center><h1>Empty Data</h1></center>");
                                    }%>
                                    <!--  end product-table................................... --> 
                                    <!--</form>-->
                                </div>
                                <!--  end content-table  -->

                                <!--  start actions-box ............................................... -->

                                <!-- end actions-box........... -->

                                <!--  start paging..................................................... -->



                                <!--  end paging................ -->

                                <div class="clear"></div>

                            </div>
                            <!--  end content-table-inner ............................................END  -->
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

                Admin Skin . <span id="spanYear"></span> <a href="">www.Group_195</a>. All rights reserved.</div>
            <!--  end footer-left -->
            <div class="clear">&nbsp;</div>
        </div>
        <!-- end footer -->
        <%}%>
    </body>
</html>
