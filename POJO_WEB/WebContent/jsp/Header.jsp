<%@page import="pojo.web.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<div>
	호스팅하기
	메세지
	도움말
	<%Member user =(Member)session.getAttribute("user");%>
	<% if(user==null){%>
	<form action="<%=request.getContextPath()%>/login" method="post">
	<label>id: </label>
	<input type="text" id = "id" name= "id">
	<label>pass: </label>
	<input type="password" id = "password" name= "password">
	<input type="submit" value="로그인">
	<a href="<%=request.getContextPath()%>/join"><input type="button" value="회원가입">
	</a>
	</form>
	<% }else{
		%>
		<%=user.getMemName() %>
		<img src="<%=request.getContextPath()%>/css/userimage/<%=user.getMemImg()%>">
		<% 
		}	%>
		
</div>