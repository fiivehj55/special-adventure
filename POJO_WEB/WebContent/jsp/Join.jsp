<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style >
	label{
		width: 100px;
		display: inline-block;
	}
	
	.auto_center{
	width:400px;
	height:400px;
	padding:20px;
	margin:30px auto;
	
	}
	
	
</style>
</head>
<body class="auto_center">

<h1>회원가입</h1>
<form >
<p><label for="id">아이디:</label>
	<input type="text" name="id" id="id" placeholder="영문+숫자 조합 8 이상 입력하세요">
	<input type="button" value="중복확인"></p>
	
<p><label for="pass">비밀번호:</label>
	<input type="password" name="password" id="pass" 
			placeholder="영문+숫자 조합 8 이상 입력하세요">
<p><label for="passok"></label>
	<input type="password" name="password" placeholder="영문+숫자 조합 8 이상 입력하세요">

<p><label for="name">이름:</label>
	<input type="text" name="name" id="name"></p>
<p><label for="gender">성별:</label>
	<input type="radio" name="gender" value="men" id="men">남
			<input type="radio" name="gender" value="women" id="women">여
			
<p>전화번호:<select name="phone" id="phone">
<option value=SKT>SKT</option>
<option value=KT>KT</option>
<option value=U+>U+</option></select>

<input type="tel" name="number" placeholder="-빼고 숫자만 입력"></p>
<p><label for="email">이메일:</label>
	<input type="email" name="email" placeholder="pojo@google.com"></p>
<p><label for="pic">프로필 사진:</label>
	<input type="text" name="pic" id="pic"><button>첨부하기</button>
<p><label for="intro">자기소개:<textarea cols="45" rows="10"></textarea></label>
<p>
<input type="submit" value="가입">



</form>





</body>
<script></script>
</html>