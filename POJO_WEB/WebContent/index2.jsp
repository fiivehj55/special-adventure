<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Linear by TEMPLATED</title>

<style>
input, input[placeholder] {
	font-weight: bold;
	text-align: center;
}

* {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

#container1 {
	margin: 100px auto;
	width: 537px;
	background: rgba(0,0,0,0.1);
}

ul.menu li {
	float: left;
	width: 179px;
	height: 48px;
	background-color: rgba(0,0,0,0.1);
	position: relative;
}

ul.menu li a {
	display: block;
	width: 100%;
	height: 100%;
	line-height: 48px;
	text-indent: 30px;
	font-weight: bold;
	color: #eee;
	text-decoration: none;
}

ul.menu li a:hover {
	background-color: #333;
}

ul.menu li ul.sub {
	position: absolute;
}

ul.menu {
	zoom: 1;
}

ul.menu:after {
	height: 0;
	visibility: hidden;
	content: ".";
	display: block;
	clear: both;
}
</style>

<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,700,500,900'
	rel='stylesheet' type='text/css'>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/skel.min.js"></script>
<script src="js/skel-panels.min.js"></script>
<script src="js/init.js"></script>
<link rel="stylesheet" href="css/skel-noscript.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/style-desktop.css" />

</head>
<body class="homepage">
	<!-- Header -->
	<div id="header">
		<div id="nav-wrapper">
<<<<<<< HEAD
			<!-- <div id="tabMenu"> -->
				<!-- Nav -->
				<nav id="nav">
					<ul>
						<li class="active"><a href="index2.jsp">호스팅하기</a></li>
						<li><a href="left-sidebar.html">메시지</a></li>
						<li><a href="right-sidebar.html">고객센터</a></li>
						<li><a href="jsp/Login.jsp">로그인</a></li>
						<li><a href="jsp/Main.jsp">검색된 페이지</a></li>
						<li><a href="jsp/Table.jsp">게시판</a></li>
					</ul>
				</nav>
			<!-- </div>
			<div id="tabSubMenu">
				<div>submenu</div>
			</div> -->
=======
			<!-- Nav -->
			<nav id="nav">
				<div id="container">
					<ul class="menu">
						<li class="active"><a href="index2.jsp">호스팅하기</a></li>
						<li><a href="left-sidebar.html">메시지</a></li>
						<li><a href="right-sidebar.html">고객센터</a>
							<ul class="sub">
								<li><a href="#">FAQ</a></li>
								<li><a href="#">신고 게시판</a></li>
							</ul></li>
						<li><a href="jsp/Login.jsp">로그인</a></li>
						<li><a href="jsp/Main.jsp">검색된 페이지</a></li>
						<li><a href="jsp/Table.jsp">게시판</a></li>
					</ul>
				</div>
			</nav>
>>>>>>> branch 'master' of https://github.com/fiivehj55/special-adventure.git
		</div>

		<div class="container">

			<!-- Logo -->
			<div id="logo">
				<h1>
					<a href="#">사랑방손님</a>
				</h1>
				<span class="tag">By POJO</span>
			</div>
		</div>
	</div>

	<!-- <div id="header">
		<div id="nav-wrapper">
			<nav id="nav">
				<div id="container1">
					<ul class="menu">
						<li><a href="#">메뉴A</a>
							<ul class="sub">
								<li><a href="#">서브메뉴A</a></li>
								<li><a href="#">서브메뉴A</a></li>
								<li><a href="#">서브메뉴A</a></li>
							</ul></li>
						<li><a href="#">메뉴B</a>
							<ul class="sub">
								<li><a href="#">서브메뉴B</a></li>
								<li><a href="#">서브메뉴B</a></li>
								<li><a href="#">서브메뉴B</a></li>
							</ul></li>
						<li><a href="#">메뉴C</a>
							<ul class="sub">
								<li><a href="#">서브메뉴C</a></li>
								<li><a href="#">서브메뉴C</a></li>
								<li><a href="#">서브메뉴C</a></li>
							</ul></li>
					</ul>
				</div>
			</nav>
		</div>
	</div> -->

	<!-- Featured -->
	<div id="featured">
		<div class="container">
			<header>
				<input id="text_box" type="text" size="100"
					placeholder="두정동 또는 건물이름을 입력하세요"> <input type="button"
					value="확인">
			</header>
			<p>
				지금 <a href="http://templated.co"> 인기있는 </a>숙소를 만나보세요!
		</div>
	</div>

	<!-- Main -->
	<div id="main">

		<div id="content" class="container">

			<div class="row">
				<section class="6u">
					<a href="#" class="image full"><img src="css/images/image1.jpg"
						width=500 height=500 alt=""></a>
				</section>
				<section class="6u">
					<a href="#" class="image full"><img src="css/images/image2.jpg"
						width=500 height=500 alt=""></a>
				</section>
			</div>

			<div class="row">
				<section class="6u">
					<a href="#" class="image full"><img src="css/images/image3.jpg"
						width=500 height=500 alt=""></a>
					<header>
						<!-- <h2>Mauris vulputate dolor</h2> -->
					</header>
					<!-- <p>In posuere eleifend odio. Quisque semper augue mattis wisi. Maecenas ligula. Pellentesque viverra vulputate enim. Aliquam erat volutpat. Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum.</p> -->
				</section>
				<section class="6u">
					<a href="#" class="image full"><img src="css/images/image4.jpg"
						width=500 height=500 alt=""></a>
					<header>
						<!-- <h2>Mauris vulputate dolor</h2> -->
					</header>
					<!-- <p>In posuere eleifend odio. Quisque semper augue mattis wisi. Maecenas ligula. Pellentesque viverra vulputate enim. Aliquam erat volutpat. Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum.</p> -->
				</section>
			</div>

		</div>
	</div>

	<!-- Tweet -->
	<div id="tweet">
		<div class="container">
			<section>
				<blockquote>&ldquo;In posuere eleifend odio. Quisque
					semper augue mattis wisi. Maecenas ligula. Pellentesque viverra
					vulputate enim. Aliquam erat volutpat.&rdquo;</blockquote>
			</section>
		</div>
	</div>

	<!-- Footer -->
	<!--  footerì ë´ì©ê³¼ snsì°ê²° ìì´ì½ -->
	<div id="footer">
		<div class="container">
			<section>
				<header>
					<h2>Get in touch</h2>
					<span class="byline">Integer sit amet pede vel arcu aliquet
						pretium</span>
				</header>
				<ul class="contact">
					<li><a href="#" class="fa fa-twitter"><span>Twitter</span></a></li>
					<li class="active"><a href="#" class="fa fa-facebook"><span>Facebook</span></a></li>
					<li><a href="#" class="fa fa-dribbble"><span>Pinterest</span></a></li>
					<li><a href="#" class="fa fa-tumblr"><span>Google+</span></a></li>
				</ul>
			</section>
		</div>
	</div>

	<!-- Copyright -->
	<div id="copyright">
		<div class="container">
			Design: <a href="http://templated.co">TEMPLATED</a> Images: <a
				href="http://unsplash.com">Unsplash</a> (<a
				href="http://unsplash.com/cc0">CC0</a>
		</div>
	</div>
</body>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script>

	var subMenu = $("#subMenu");
	subMenu.hide();
	/* $(document).ready(function() {
		$("#nav").hover(function(e) {
			if (e.type == "mouseenter") {
				subMenu.show();
			}
		});
		$("#subMenu").hover(function(e) {
			if (e.type == "mouseleave") {
				subMenu.hide();
			}
		});
	}); */

	$(function() {
		$("ul.sub").hide();
		$("ul.menu li").hover(function() {
			$("ul:not(:animated)", this).slideDown("fast");
		}, function() {
			$("ul", this).slideUp("fast");
		});
	});
</script>
</html>