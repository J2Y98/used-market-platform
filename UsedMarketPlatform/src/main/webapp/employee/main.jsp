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
	<header>
		<button onclick="location.href='mypage.emp'">마이페이지</button>
		<button onclick="location.href='mail.emp'">메일</button>
	</header>
	<button onclick="location.href='searchUser.emp'">사용자검색</button>
	<button onclick="location.href='deletelist.emp'">탈퇴현황</button>
	<button onclick="location.href='reportlist.emp'">신고목록</button>
	<button onclick="location.href='inquirylist.emp'">문의사항</button>
	<button onclick="location.href='boardlist.emp'">게시판(공지사항, 이벤트)</button>
	<section>
		<table>
			<tr><th>현황</th></tr>
			<tr><th></th></tr>
			<!-- chart.js로 그래프 표시 -->
		</table>
	</section>
</body>
</html>