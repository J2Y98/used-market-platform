<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������ �α���</title>
<style>
body{text-align:center;}
table{margin:auto;}
</style>
</head>
<body>
	<h1>login.jsp</h1>
	<section>
		<form action="main.emp" method="post">
			<table>
				<tr><th>���̵�</th><td><input type="text" id="id" required></td></tr>
				<tr><th>��й�ȣ</th><td><input type="password" id="pw" required></td></tr>
				<tr><th colspan="2"><input type="submit" value="�α���"></th></tr>
			</table>
		</form>
		<button>��� ã��</button><button>��й�ȣ ã��</button>
	</section>
</body>
</html>