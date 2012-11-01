<%-- 
    Document   : register
    Created on : Oct 26, 2012, 5:02:09 PM
    Author     : CMC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        
<link rel="stylesheet" href="css1/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css1/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css1/style.css" type="text/css" media="all">
<script type="text/javascript" src="jsIndex/jquery-1.5.2.js" ></script>
<script type="text/javascript" src="jsIndex/cufon-yui.js"></script>
<script type="text/javascript" src="jsIndex/cufon-replace.js"></script> 
<script type="text/javascript" src="jsIndex/Terminal_Dosis_300.font.js"></script>
<script type="text/javascript" src="jsIndex/atooltip.jquery.js"></script>
<script type="text/javascript" src="jsIndex/script.js"></script>
    </head>
    <body id="page6">
<div class="body1">
	<div class="body2">
		<div class="body3">
			<div class="main">
<!-- header -->
				<header>
					<div class="wrapper">
						<h1><a href="index.html" id="logo"></a></h1>
						<form id="search" method="post">
							<div>
								<input type="submit" class="submit" value="">
								<input class="input" type="text" value="Site Search" onBlur="if(this.value=='') this.value='Site Search'" onFocus="if(this.value =='Site Search' ) this.value=''">
							</div>
						</form>
						<nav>
							<ul id="menu">
								<li><a href="Home.jsp">Home</a></li>
								<li><a href="">MyPhotos</a></li>
								<li><a href="">FeedBack</a></li>
								<li><a href="">FAQs</a></li>
								<li><a href="Register.jsp">Register</a></li>
								<li id="active" class="end"><a href="Contact.jsp">Login</a></li>
							</ul>
						</nav>
					</div>
				</header><div class="ic">More Website Templates at TemplateMonster.com!</div>
<!-- / header-->
<!-- content -->
				<section id="content">
					<div class="wrapper">
						<h2>Register Form</h2>
						<table width="100%" border="0" cellspacing="3" cellpadding="3">
                                    <tr>
                                        <td width="20%">&nbsp;</td>
                                        <td align="center">
                                                <table border="0" cellpadding="0" cellspacing="0"  id="id-form">

                                                <tr>
                                                    <th valign="top">UserName:</th>
                                                    <td><input type="text" class="inp-form" /></td>
                                                    <td>
                                                        This field is required
                                                        </td>
                                                </tr>
                                                <tr>
                                                    <th valign="top">Password:</th>
                                                    <td><input type="password" class="inp-form" /></td>
                                                    <td>
                                                        This field is required
                                                        </td>
                                                </tr>
                                                
                                                <tr>
                                                    <th valign="top">FullName:</th>
                                                    <td><input type="text" class="inp-form" /></td>
                                                    <td>
                                                        This field is required
                                                        </td>
                                                </tr>
                                                <tr>
                                                    <th valign="top">Address:</th>
                                                    <td><textarea rows="" cols="" class="form-textarea"></textarea></td>
                                                    <td> Loi o day</td>
                                                </tr>
                                                <tr>
                                                    <th valign="top">Gender:</th>
                                                    <td>	
                                                        <select class="styledselect-day">
                                                            <option value="">Male</option>
                                                            <option value="">Female</option>
                                                            <option value="">null</option>
                                                        </select>
                                                    </td>
                                                    <td></td>
                                                </tr>
                                                <tr>
                                                    <th valign="top">Birthday:</th>
                                                    <td class="noheight">

                                                        <table border="0" cellpadding="0" cellspacing="0">
                                                            <tr  valign="top">
                                                                <td>
                                                                    <form id="chooseDateForm" action="#">

                                                                        <select id="d" class="styledselect-day">
                                                                            <option value="">dd</option>
                                                                            <option value="1">1</option>
                                                                            <option value="2">2</option>
                                                                            <option value="3">3</option>
                                                                            <option value="4">4</option>
                                                                            <option value="5">5</option>
                                                                            <option value="6">6</option>
                                                                            <option value="7">7</option>
                                                                            <option value="8">8</option>
                                                                            <option value="9">9</option>
                                                                            <option value="10">10</option>
                                                                            <option value="11">11</option>
                                                                            <option value="12">12</option>
                                                                            <option value="13">13</option>
                                                                            <option value="14">14</option>
                                                                            <option value="15">15</option>
                                                                            <option value="16">16</option>
                                                                            <option value="17">17</option>
                                                                            <option value="18">18</option>
                                                                            <option value="19">19</option>
                                                                            <option value="20">20</option>
                                                                            <option value="21">21</option>
                                                                            <option value="22">22</option>
                                                                            <option value="23">23</option>
                                                                            <option value="24">24</option>
                                                                            <option value="25">25</option>
                                                                            <option value="26">26</option>
                                                                            <option value="27">27</option>
                                                                            <option value="28">28</option>
                                                                            <option value="29">29</option>
                                                                            <option value="30">30</option>
                                                                            <option value="31">31</option>
                                                                        </select>
                                                                </td>
                                                                <td>
                                                                    <select id="m" class="styledselect-month">
                                                                        <option value="">mmm</option>
                                                                        <option value="1">Jan</option>
                                                                        <option value="2">Feb</option>
                                                                        <option value="3">Mar</option>
                                                                        <option value="4">Apr</option>
                                                                        <option value="5">May</option>
                                                                        <option value="6">Jun</option>
                                                                        <option value="7">Jul</option>
                                                                        <option value="8">Aug</option>
                                                                        <option value="9">Sep</option>
                                                                        <option value="10">Oct</option>
                                                                        <option value="11">Nov</option>
                                                                        <option value="12">Dec</option>
                                                                    </select>
                                                                </td>
                                                                <td>
                                                                    <select  id="y"  class="styledselect-year">
                                                                        <option value="">yyyy</option>
                                                                        <option value="1982">1982</option>
                                                                        <option value="1983">1983</option>
                                                                        <option value="1984">1984</option>
                                                                        <option value="1985">1985</option>
                                                                        <option value="1986">1986</option>
                                                                        <option value="1987">1987</option>
                                                                        <option value="1988">1988</option>
                                                                        <option value="1989">1989</option>
                                                                        <option value="1990">1990</option>
                                                                        <option value="1991">1991</option>
                                                                        <option value="1992">1992</option>
                                                                        <option value="1993">1993</option>
                                                                        <option value="1994">1994</option>
                                                                        <option value="1995">1995</option>
                                                                        <option value="1996">1996</option>
                                                                        <option value="1997">1997</option>
                                                                        <option value="1998">1998</option>
                                                                        <option value="1999">1999</option>
                                                                        <option value="2000">2000</option>
                                                                        <option value="2001">2001</option>
                                                                        <option value="2002">2002</option>
                                                                        <option value="2003">2003</option>
                                                                        <option value="2004">2004</option>
                                                                        <option value="2005">2005</option>
                                                                        <option value="2006">2006</option>
                                                                        <option value="2007">2007</option>
                                                                        <option value="2008">2008</option>
                                                                        <option value="2009">2009</option>
                                                                        <option value="2010">2010</option>
                                                                        <option value="2011">2011</option>
                                                                        <option value="2012">2012</option>
                                                                        <option value="2013">2013</option>
                                                                        <option value="2014">2014</option>
                                                                        <option value="2015">2015</option>
                                                                        <option value="2016">2016</option>
                                                                        <option value="2017">2017</option>
                                                                    </select>
                                                                    </form>
                                                                </td>

                                                            </tr>
                                                        </table>

                                                    </td>
                                                    <td></td>
                                                </tr>
                                                <tr>
                                                    <th valign="top">Email:</th>
                                                    <td><input type="text" class="inp-form" /></td>
                                                    <td>
                                                        This field is required
                                                        </td>
                                                </tr>
                                                
                                                    <th>&nbsp;</th>
                                                    <td valign="top">
                                                        <input type="button" value="" class="form-submit" />
                                                        <input type="reset" value="" class="form-reset"  />
                                                    </td>
                                                    <td></td>
                                                </tr>
                                            </table>
                                                 </td>

                                    </tr>
                                </table>
					</div>
				</section>
			</div>
		</div>
	</div>
</div>
<div class="body4">
	<div class="main">
		<section id="content2">
			<div class="line2 wrapper">
				<div class="wrapper">
					<article class="col1">
						<h2>Gioi thieu</h2>
						<div class="pad">
							Viet gi o day nhi
						</div>
					</article>
					<article class="col2 pad_left1">
						<h2>Register</h2>
						<div class="pad">
							<span class="col3">
								<strong>	
									Country:<br>
									State:<br>
									City:<br>
									Telephone:<br>
									Email:
								</strong>
							</span>	
							Viet Nam<br>
							Ha Noi<br>
							Nguyen Trai<br>
							0945049966<br>
							<a href="mailto:"></a>
						</div>
					</article>
				</div>
			</div>				
		</section>
	</div>
</div>
<!-- / content -->
<div class="main">
<!-- footer -->
	<footer>
		<div class="wrapper">
			<span class="left">
			 	<a rel="nofollow" href="" target="_blank">Website template</a> designed by Group 195<br>
			</span>
			<ul id="icons">
				<li><a href="#" class="normaltip" title="Facebook"><img src="images/icon1.png" alt=""></a></li>
				<li><a href="#" class="normaltip" title="Delicious"><img src="images/icon2.png" alt=""></a></li>
				<li><a href="#" class="normaltip" title="Stumble Upon"><img src="images/icon3.png" alt=""></a></li>
				<li><a href="#" class="normaltip" title="Twitter"><img src="images/icon4.png" alt=""></a></li>
				<li><a href="#" class="normaltip" title="Linkedin"><img src="images/icon5.png" alt=""></a></li>
				<li><a href="#" class="normaltip" title="Reddit"><img src="images/icon6.png" alt=""></a></li>
			</ul>
		</div>
<!-- {%FOOTER_LINK} -->
	</footer>
<!-- / footer -->
</div>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>
