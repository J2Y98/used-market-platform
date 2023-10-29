<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>main.jsp</h1>
	<button onclick="location.href='./profile.emp'">프로필</button>
	<button onclick="location.href='./deleteList.emp'">삭제 신청 목록</button>
	<button onclick="location.href='./inquiryList.emp'">문의 사항 목록</button>
	<button onclick="location.href='./board.emp'">게시판</button>
	<button onclick="location.href='./mail.emp'">메일(직원용)</button>
	<!-- admin(관리자) 전용, 일반 employee에겐 공개되지 않음 -->
	<button onclick="location.href='./employeelist.emp'">직원목록</button>
</body>
</html>