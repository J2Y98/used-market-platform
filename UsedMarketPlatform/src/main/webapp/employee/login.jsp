<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>관리자 로그인</title>
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
				<tr><th>아이디</th><td><input type="text" id="id" required></td></tr>
				<tr><th>비밀번호</th><td><input type="password" id="pw" required></td></tr>
				<tr><th colspan="2"><input type="submit" value="로그인"></th></tr>
			</table>
		</form>
		<button>사번 찾기</button><button>비밀번호 찾기</button>
	</section>
</body>
</html>