<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- �α��� ������, ��� �� ��й�ȣ �Է� �� �α���, �ϴ� ��й�ȣ ã��(��� �ʼ�) -->
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
		<input type="submit" value="Ȯ��"><br>
	</form>
	<button onclick="location.href='./changePwForm.emp'">��й�ȣ ã��</button>
</body>
</html>