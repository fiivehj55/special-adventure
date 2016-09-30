<%@page import="pojo.web.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>


<style >
	label{
		width: 100px;
		display: inline-block;
	}
	
	.auto_center{
	width:400px;
	height:400px;
	padding:20px;
	margin:200px auto;
	
	}
</style>
<div class=auto_center>
	호스팅하기
	메세지
	고객센터
	
	<%Member user =(Member)session.getAttribute("user");%>
	<% if(user==null){%>
	<form action="<%=request.getContextPath()%>/login" method="post">
	<p><label>ID: </label>
	<input type="text" id = "id" name= "id"></p>
	<label>PASS: </label>
	<input type="password" id = "password" name= "password">
	<p><input type="submit" value="로그인">
	<a href="<%=request.getContextPath()%>/jsp/Join.jsp"><input type="button" value="회원가입">
	</a>
	</form>
	<% }else{
		%>
		<%=user.getMemName() %>
		<img src="<%=request.getContextPath()%>/css/userimage/<%=user.getMemImg()%>">
		<% 
		}	%>
		
</div>