<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 로그인 페이지, 사번 및 비밀번호 입력 후 로그인, 하단 비밀번호 찾기(사번 필수) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>login.jsp</h1>
	<form action="./loginAction.emp" method="post">
		<input type="text" name="emp_id"><br>
		<input type="password" name="emp_pw"><br>
		<input type="submit" value="확인"><br>
	</form>
	<button onclick="location.href='./changePwForm.emp'">비밀번호 찾기</button>
</body>
</html>