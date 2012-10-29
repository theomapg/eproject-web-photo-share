<%-- 
    Document   : AdminLogin
    Created on : Oct 27, 2012, 11:30:35 PM
    Author     : CMC
--%>

<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Photo Share Group 195</title>
        <link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" title="default" />
        <!--  jquery core -->
        <script src="js/jquery/jquery-1.4.1.min.js" type="text/javascript"></script>

        <!-- Custom jquery scripts -->
        <script src="js/jquery/custom_jquery.js" type="text/javascript"></script>

        <!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
        <script src="js/jquery/jquery.pngFix.pack.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $(document).pngFix( );
            });
        </script>
    </head>
    <body id="login-bg"> 
        <%
            session = request.getSession();
            Account a = (Account) session.getAttribute("account");
            if (a != null) {
                response.sendRedirect("ManagementAccount.jsp");
            }
        %>
        <%
            if (request.getAttribute("error") != null) {
                out.print("<script>alert('" + request.getAttribute("error").toString() + "');</script>");
            }
            request.setAttribute("error", null);
        %>
        <!-- Start: login-holder -->
        <div id="login-holder">

            <!-- start logo -->
            <div id="logo-login">
                <a href="index.html"><img src="images/login/logo.gif" width="156" height="40" alt="" /></a>
            </div>
            <!-- end logo -->

            <div class="clear"></div>

            <!--  start loginbox ................................................................................. -->
            <div id="loginbox">

                <!--  start login-inner -->
                <div id="login-inner">
                    <form name="login" action="AdminLogin" method="POST">

                        <table border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <th>Username</th>
                                <td><input type="text"  class="login-inp" name="username" /></td>
                            </tr>
                            <tr>
                                <th>Password</th>
                                <td><input type="password" value=""  name="password" onfocus="this.value=''" class="login-inp" /></td>
                            </tr>
                            <tr>
                                <th></th>
                                <td valign="top"><input type="checkbox" class="checkbox-size" id="login-check" /><label for="login-check">Remember me</label></td>
                            </tr>
                            <tr>
                                <th></th>
                                <td><input type="submit" class="submit-login"  /></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <!--  end login-inner -->
                <div class="clear"></div>
            </div>
            <!--  end loginbox -->

            <!--  start forgotbox ................................................................................... -->
            <div id="forgotbox">
                <div id="forgotbox-text">Please send us your email and we'll reset your password.</div>
                <!--  start forgot-inner -->
                <div id="forgot-inner">
                    <table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <th>Email address:</th>
                            <td><input type="text" value=""   class="login-inp" /></td>
                        </tr>
                        <tr>
                            <th> </th>
                            <td><input type="button" class="submit-login"  /></td>
                        </tr>
                    </table>
                </div>
                <!--  end forgot-inner -->
                <div class="clear"></div>
                <a href="" class="back-login">Back to login</a>
            </div>
            <!--  end forgotbox -->

        </div>
        <!-- End: login-holder -->
    </body>
</html>
