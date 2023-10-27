<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>로그인</title>
	<jsp:include page="./inn/login/head.jsp"/>    
</head>
  <body class="light ">
    <div class="wrapper vh-100">
      <div class="row align-items-center h-100">
        <form action="./loginAction.emp" method="post" class="col-lg-3 col-md-4 col-10 mx-auto text-center">
          <jsp:include page="./inn/login/logo.jsp"/>
          <h1 class="h6 mb-3">로그인</h1>
          <div class="form-group">
            <label for="emp_id" class="sr-only">사번</label>
            <input type="text" id="emp_id" name="emp_pw" class="form-control form-control-lg" placeholder="사번" required autofocus="사번을 입력해주세요!">
          </div>
          <div class="form-group">
            <label for="emp_pw" class="sr-only">비밀번호</label>
            <input type="password" id="emp_pw" name="emp_pw" class="form-control form-control-lg" placeholder="비밀번호" required>
          </div>
          <div class="checkbox mb-3">
            <label>
              <input type="checkbox" name="remember_id" value="true"> 사번 저장하기</label>
          </div>
          <button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
          <button class="btn btn-lg btn-primary btn-block" type="button" onclick="location.href='./changePwForm.emp'">비밀번호 변경</button>
          <p class="mt-5 mb-3 text-muted">© 2023 itwillbs project 1</p>
        </form>
      </div>
    </div>
<jsp:include page="./inn/login/script.jsp"/>
  </body>
</html>
</body>
</html>