<!-- 로그인 페이지 -->
<%@page import="pojo.web.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title></title>

<style>
	label{
		width: 100px;
		display: inline-block;
	}
	
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
	rel='stylesheet' type='/text/css'>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="../js/skel.min.js"></script>
<script src="../js/skel-panels.min.js"></script>
<script src="../js/init.js"></script>
<link rel="stylesheet" href="../css/skel-noscript.css" />
<link rel="stylesheet" href="../css/style.css" />
<link rel="stylesheet" href="../css/style-desktop.css" />

</head>
<body>
<jsp:include page="/jsp/Header.jsp"></jsp:include>
<div class="auto_center">
	<!-- Header -->
	<div id="header">
		<div id="nav-wrapper">
			<!-- Nav -->
			<nav id="nav">
				<div id="container">
					<ul class="menu">
						<li class="active"><a href="/index2.jsp">호스팅하기</a></li>
						<li><a href="/left-sidebar.html">메시지</a></li>
						<li><a href="/right-sidebar.html">고객센터</a>
							<ul class="sub">
								<li><a href="#">FAQ</a></li>
								<li><a href="#">신고 게시판</a></li>
							</ul></li>
						<li><a href="/jsp/Login.jsp">로그인</a></li>
						<li><a href="/jsp/Main.jsp">검색된 페이지</a></li>
						<li><a href="/jsp/Table.jsp">게시판</a></li>
					</ul>
				</div>
			</nav>
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
	
	<%Member user =(Member)session.getAttribute("user");%>
	<% if(user==null){%>
	<form action="<%=request.getContextPath()%>/login" method="post">
	<p><label>ID: </label>
	<input type="text" id = "id" name= "id"></p>
	<label>PASS: </label>
	<input type="password" id = "password" name= "password">
	
	<p>
	<a href="<%=request.getContextPath()%>/jsp/FindId.jsp"><input type="button" value="아이디 찾기" ></a>
	<a href="<%=request.getContextPath()%>/jsp/FindPass.jsp">	<input type="button" value="비밀번호 찾기"></a>
	
	<p><input type="submit" value="로그인">
	<a href="<%=request.getContextPath()%>/jsp/Join.jsp"><input type="button" value="회원가입"></a>
	</p></form>
	<% }else{
		%>
		<%=user.getMemName() %>
		<img src="<%=request.getContextPath()%>../css/userimage/<%=user.getMemImg()%>">
		<% 
		}	%>
		
</div>

	<jsp:include page="/jsp/Footer.jsp"></jsp:include>
</body>
</html>