<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 비밀번호 찾기(로그인 할 때), 사번 및 이메일 입력 후  -->
	<h1>findPwForm.jsp</h1>
	<form action="./findPwAction.emp" method="post">
		<input type="email" name="email"><br>
		<input type="text" name="emp_id"><br>
		<input type="submit" value="입력">
	</form>
</body>
</html>