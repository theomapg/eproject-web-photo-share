<%-- 
    Document   : Contact
    Created on : Oct 26, 2012, 5:28:42 PM
    Author     : CMC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact</title>
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
								<li><a href="Home.jsp"> Home</a></li>
                                                            <li><a href="">MyPhotos</a></li>
                                                            <li><a href="">Feedback</a></li>
                                                            <li><a href="">FAQs</a></li>
                                                            <li><a href="Register.jsp">Register</a></li>
								<li id="active" class="end"><a href="Contact.html">Contact</a></li>
							</ul>
						</nav>
					</div>
				</header><div class="ic">More Website Templates at TemplateMonster.com!</div>
<!-- / header-->
<!-- content -->
				<section id="content">
					<div class="wrapper">
						<h2>Contact Form</h2>
						<form id="ContactForm">
							<div>
								<div class="wrapper">
									<span>Your Name:</span><input type="text" class="input" >
								</div>
								<div class="wrapper">
									<span>Your E-mail:</span><input type="text" class="input" >								
								</div>
								<div class="textarea_box">
									<span>Your Message:</span><textarea name="textarea" cols="1" rows="1"></textarea>								
								</div>
								<span>&nbsp;</span>
								<a href="#" class="button" onClick="document.getElementById('ContactForm').reset()">Clear</a>
								<a href="#" class="button" onClick="document.getElementById('ContactForm').submit()">Send</a>
							</div>
						</form>
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
						<h2>Gioi Thieu</h2>
						<div class="pad">
							Viet gi day
						</div>
					</article>
					<article class="col2 pad_left1">
						<h2>My Contacts</h2>
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
