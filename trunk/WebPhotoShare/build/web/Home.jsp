<%-- 
    Document   : Home
    Created on : Oct 26, 2012, 4:36:07 PM
    Author     : CMC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css1/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css1/prettyPhoto.css" type="text/css" media="all">
<link rel="stylesheet" href="css1/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css1/style.css" type="text/css" media="all">
<script type="text/javascript" src="jsIndex/jquery-1.5.2.js" ></script>
<script type="text/javascript" src="jsIndex/cufon-yui.js"></script>
<script type="text/javascript" src="jsIndex/cufon-replace.js"></script> 
<script type="text/javascript" src="jsIndex/Terminal_Dosis_300.font.js"></script>
<script type="text/javascript" src="jsIndex/atooltip.jquery.js"></script>
<script src="jsIndex/roundabout.js" type="text/javascript"></script>
<script src="jsIndex/roundabout_shapes.js" type="text/javascript"></script>
<script src="jsIndex/jquery.easing.1.2.js" type="text/javascript"></script>
<script type="text/javascript" src="jsIndex/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="jsIndex/hover-image.js"></script>
<script type="text/javascript" src="jsIndex/tabs.js"></script>
<script type="text/javascript" src="jsIndex/script.js"></script>
    </head>
    <body id="page3">
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
								<li><a href=""> Home</a></li>
                                                            <li><a href="">MyPhotos</a></li>
                                                            <li><a href="">Feedback</a></li>
                                                            <li><a href="">FAQs</a></li>
                                                            <li><a href="Register.jsp">Register</a></li>
                                                            <li><a href="Contact.jsp">Contact</a></li>
							</ul>
						</nav>
					</div>
					<div class="relative">
						<div id="gallery">
							<ul id="myRoundabout">
								<li><img src="images/img1.png" alt=""></li>
								<li><img src="images/img2.png" alt=""></li>
								<li><img src="images/img3.png" alt=""></li>
							</ul>
						</div>
					</div>
				</header><div class="ic">More Website Templates at TemplateMonster.com!</div>
<!-- / header-->
<!-- content -->
				<section id="content">
					<div class="line1 wrapper">
						<div class="wrapper tabs">
							<article class="col1">
								<h2>Categories</h2>
								<div class="pad">
									<ul class="nav">
										<li class="selected"><a href="#Fashion">Fashion</a></li>
										<li><a href="#3D">3D Objects</a></li>
										<li><a href="#Wedding">Wedding</a></li>
										<li><a href="#Reportage">Reportage</a></li>
										<li><a href="#Advertising">Advertising</a></li>
										<li><a href="#Portrait">Portrait</a></li>
									</ul>
								</div>
							</article>
							<article class="col2 pad_left1 tab-content" id="Fashion">
								<h2>Fashion Category</h2>
								<ul class="gallery">
									<li>
										<a href="images/big_img1.jpg" class="lightbox-image" rel="prettyPhoto[group1]" >
											<img src="images/page3_img1.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img2.jpg" class="lightbox-image" rel="prettyPhoto[group1]" >
											<img src="images/page3_img2.jpg" alt="">
										</a>
									</li>
									<li class="end">
                                    	<a href="images/big_img3.jpg" class="lightbox-image" rel="prettyPhoto[group1]" >
                                        	<img src="images/page3_img3.jpg" alt="">
                                        </a>
									</li>
									<li>
										<a href="images/big_img4.jpg" class="lightbox-image" rel="prettyPhoto[group1]" >
                                        	<img src="images/page3_img4.jpg" alt="">
                                        </a>
									</li>
									<li>
										<a href="images/big_img5.jpg" class="lightbox-image" rel="prettyPhoto[group1]" >
                                        	<img src="images/page3_img5.jpg" alt="">
										</a>
                                    </li>
									<li class="end">
										<a href="images/big_img6.jpg" class="lightbox-image" rel="prettyPhoto[group1]" >
											<img src="images/page3_img6.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img7.jpg" class="lightbox-image" rel="prettyPhoto[group1]" >
											<img src="images/page3_img7.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img8.jpg" class="lightbox-image" rel="prettyPhoto[group1]" >
											<img src="images/page3_img8.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img9.jpg" class="lightbox-image" rel="prettyPhoto[group1]" >
											<img src="images/page3_img9.jpg" alt="">
										</a>
									</li>
								</ul>
							</article>
							<article class="col2 pad_left1 tab-content" id="3D">
								<h2>3D Objects</h2>
								<ul class="gallery">
									<li>
										<a href="images/big_img7.jpg" class="lightbox-image" rel="prettyPhoto[group2]" >
											<img src="images/page3_img7.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img8.jpg" class="lightbox-image" rel="prettyPhoto[group2]" >
											<img src="images/page3_img8.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img9.jpg" class="lightbox-image" rel="prettyPhoto[group2]" >
											<img src="images/page3_img9.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img1.jpg" class="lightbox-image" rel="prettyPhoto[group2]" >
											<img src="images/page3_img1.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img2.jpg" class="lightbox-image" rel="prettyPhoto[group2]" >
											<img src="images/page3_img2.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img3.jpg" class="lightbox-image" rel="prettyPhoto[group2]" >
											<img src="images/page3_img3.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img4.jpg" class="lightbox-image" rel="prettyPhoto[group2]" >
											<img src="images/page3_img4.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img5.jpg" class="lightbox-image" rel="prettyPhoto[group2]" >
											<img src="images/page3_img5.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img6.jpg" class="lightbox-image" rel="prettyPhoto[group2]" >
											<img src="images/page3_img6.jpg" alt="">
										</a>
									</li>
								</ul>
							</article>
							<article class="col2 pad_left1 tab-content" id="Wedding">
								<h2>Wedding Category</h2>
								<ul class="gallery">
									<li>
										<a href="images/big_img4.jpg" class="lightbox-image" rel="prettyPhoto[group3]" >
											<img src="images/page3_img4.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img5.jpg" class="lightbox-image" rel="prettyPhoto[group3]" >
											<img src="images/page3_img5.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img6.jpg" class="lightbox-image" rel="prettyPhoto[group3]" >
											<img src="images/page3_img6.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img7.jpg" class="lightbox-image" rel="prettyPhoto[group3]" >
											<img src="images/page3_img7.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img8.jpg" class="lightbox-image" rel="prettyPhoto[group3]" >
											<img src="images/page3_img8.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img9.jpg" class="lightbox-image" rel="prettyPhoto[group3]" >
											<img src="images/page3_img9.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img1.jpg" class="lightbox-image" rel="prettyPhoto[group3]" >
											<img src="images/page3_img1.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img2.jpg" class="lightbox-image" rel="prettyPhoto[group3]" >
											<img src="images/page3_img2.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img3.jpg" class="lightbox-image" rel="prettyPhoto[group3]" >
											<img src="images/page3_img3.jpg" alt="">
										</a>
									</li>
								</ul>
							</article>
							<article class="col2 pad_left1 tab-content" id="Reportage">
								<h2>Reportage Category</h2>
								<ul class="gallery">
									<li>
										<a href="images/big_img1.jpg" class="lightbox-image" rel="prettyPhoto[group4]" >
											<img src="images/page3_img1.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img2.jpg" class="lightbox-image" rel="prettyPhoto[group4]" >
											<img src="images/page3_img2.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img3.jpg" class="lightbox-image" rel="prettyPhoto[group4]" >
											<img src="images/page3_img3.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img4.jpg" class="lightbox-image" rel="prettyPhoto[group4]" >
											<img src="images/page3_img4.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img5.jpg" class="lightbox-image" rel="prettyPhoto[group4]" >
											<img src="images/page3_img5.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img6.jpg" class="lightbox-image" rel="prettyPhoto[group4]" >
											<img src="images/page3_img6.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img7.jpg" class="lightbox-image" rel="prettyPhoto[group4]" >
											<img src="images/page3_img7.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img8.jpg" class="lightbox-image" rel="prettyPhoto[group4]" >
											<img src="images/page3_img8.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img9.jpg" class="lightbox-image" rel="prettyPhoto[group4]" >
											<img src="images/page3_img9.jpg" alt="">
										</a>
									</li>
								</ul>
							</article>
							<article class="col2 pad_left1 tab-content" id="Advertising">
								<h2>Advertising Category</h2>
								<ul class="gallery">
									<li>
										<a href="images/big_img7.jpg" class="lightbox-image" rel="prettyPhoto[group5]" >
											<img src="images/page3_img7.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img8.jpg" class="lightbox-image" rel="prettyPhoto[group5]" >
											<img src="images/page3_img8.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img9.jpg" class="lightbox-image" rel="prettyPhoto[group5]" >
											<img src="images/page3_img9.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img1.jpg" class="lightbox-image" rel="prettyPhoto[group5]" >
											<img src="images/page3_img1.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img2.jpg" class="lightbox-image" rel="prettyPhoto[group5]" >
											<img src="images/page3_img2.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img3.jpg" class="lightbox-image" rel="prettyPhoto[group5]" >
											<img src="images/page3_img3.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img4.jpg" class="lightbox-image" rel="prettyPhoto[group5]" >
											<img src="images/page3_img4.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img5.jpg" class="lightbox-image" rel="prettyPhoto[group5]" >
											<img src="images/page3_img5.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img6.jpg" class="lightbox-image" rel="prettyPhoto[group5]" >
											<img src="images/page3_img6.jpg" alt="">
										</a>
									</li>
								</ul>
							</article>
							<article class="col2 pad_left1 tab-content" id="Portrait">
								<h2>Portrait Category</h2>
								<ul class="gallery">
									<li>
										<a href="images/big_img4.jpg" class="lightbox-image" rel="prettyPhoto[group6]" >
											<img src="images/page3_img4.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img5.jpg" class="lightbox-image" rel="prettyPhoto[group6]" >	
											<img src="images/page3_img5.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img6.jpg" class="lightbox-image" rel="prettyPhoto[group6]" >
											<img src="images/page3_img6.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img7.jpg" class="lightbox-image" rel="prettyPhoto[group6]" >
											<img src="images/page3_img7.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img8.jpg" class="lightbox-image" rel="prettyPhoto[group6]" >
											<img src="images/page3_img8.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img9.jpg" class="lightbox-image" rel="prettyPhoto[group6]" >
											<img src="images/page3_img9.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img1.jpg" class="lightbox-image" rel="prettyPhoto[group6]" >
											<img src="images/page3_img1.jpg" alt="">
										</a>
									</li>
									<li>
										<a href="images/big_img2.jpg" class="lightbox-image" rel="prettyPhoto[group6]" >
											<img src="images/page3_img2.jpg" alt="">
										</a>
									</li>
									<li class="end">
										<a href="images/big_img3.jpg" class="lightbox-image" rel="prettyPhoto[group6]" >
											<img src="images/page3_img3.jpg" alt="">
										</a>
									</li>
								</ul>
							</article>
						</div>
					</div>
				</section>
			</div>
		</div>
	</div>
</div>
<div class="body4">
	<div class="main">
		<section id="content2">
		</section>
	</div>
</div>
<!-- / content -->
<div class="main">
<!-- footer -->
	<footer>
		<div class="wrapper">
			<span class="left">
			 	<a rel="nofollow" href="http://www.templatemonster.com/" target="_blank">Website template</a> designed by TemplateMonster.com<br>
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
<script type="text/javascript">
	$(document).ready(function() {
		$('#myRoundabout').roundabout({
			 shape: 'square',
			 minScale: 0.93, // tiny!
			 maxScale: 1, // tiny!
			 easing:'easeOutExpo',
			 clickToFocus:'true',
			 focusBearing:'0',
			 duration:800,
			 reflect:true
		});
		tabs.init();
		// for lightbox
		if ($("a[rel^='prettyPhoto']").length) {
			$(document).ready(function() {
				// prettyPhoto
				$("a[rel^='prettyPhoto']").prettyPhoto({theme:'light_square'});
			});
		} 
	});
</script>
</body>
</html>
