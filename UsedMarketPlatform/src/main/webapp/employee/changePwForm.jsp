<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>비밀번호 변경</title>
    <jsp:include page="./inn/login/head.jsp">
  </head>
  <body class="light ">
    <div class="wrapper vh-100">
      <div class="row align-items-center h-100">
        <form action="./resetPw.emp" method="post" class="col-lg-3 col-md-4 col-10 mx-auto text-center">
          <div class="mx-auto text-center my-4">
            <jsp:include page="./inn/login/logo.jsp"/>
            <h2 class="my-3">비밀번호 변경</h2>
          </div>
          <div class="form-group">
            <label for="emp_id" class="sr-only">사번</label>
            <input type="text" id="emp_id" name="emp_id" class="form-control form-control-lg" placeholder="Email address" required autofocus>
          </div>
          <button class="btn btn-lg btn-primary btn-block" type="submit">확인</button>
          <button class="btn btn-lg btn-primary btn-block" type="button" onclick="history.back();">뒤로가기</button>
          <p class="mt-5 mb-3 text-muted">© 2023 itwillbs project 1</p>
        </form>
      </div>
    </div>
    <jsp:include page="./inn/login/script.jsp"/>
  </body>
</html>
</body>
</html>