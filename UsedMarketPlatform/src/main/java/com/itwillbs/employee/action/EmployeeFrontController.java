package com.itwillbs.employee.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwillbs.util.Action;
import com.itwillbs.util.ActionForward;

/**
 * EmployeeFrontController
 * 		직원(Employee)과 관련한 모든 작업을 수행하는 컨트롤러
 * */

//@WebServlet("*.emp")
public class EmployeeFrontController extends HttpServlet{
	
	// HttpServlet 진행 함수
	protected void doProcess
	(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		System.out.println("C : EmployeeFrontController doProcess() 실행");
		System.out.println("C : GET/POST 동작 모두 처리");
		// ------------------가상주소 계산----------------
		System.out.println("\n1. 가상주소 계산 시작");
		// System.out.println(request.getRequestURL());
		String requestURI = request.getRequestURI();
		System.out.println("C : requestURI : " + requestURI);
		String CTXPath = request.getContextPath();
		System.out.println("C : CTXPath : " + CTXPath);
		String command = requestURI.substring(CTXPath.length());
		System.out.println("C : command : " + command);
		System.out.println("\n1. 가상주소 계산 끝");
		// ------------------가상주소 계산----------------
		
		// ------------------가상주소 매핑----------------
		System.out.println("\n2. 가상주소 매핑 시작");
		ActionForward forward = null;
		Action action = null;
		if(command.equals("/login.emp")) {
			// 로그인 페이지(처음 이동할 때 session 조회하고 이동 예정)
			forward = new ActionForward();
			forward.setPath("./employee/login.jsp");
			forward.setRedirect(false);
			System.out.println("C : " + forward);
		}
		else if(command.equals("/loginAction.emp")) {
			// 로그인 액션(DB 사용 및 메인 페이지 이동 진행)
			action = new EmployeeLoginAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/main.emp")) {
			// 메인 페이지(직원용)
			forward = new ActionForward();
			forward.setPath("./employee/main.jsp");
			forward.setRedirect(false);
			System.out.println("C : " + forward);
		}
		else if(command.equals("/changePwForm.emp")) {
			// 비밀번호 변경 폼
			forward = new ActionForward();
			forward.setPath("./employee/changePwForm.jsp");
			forward.setRedirect(false);
			System.out.println("C : " + forward);
		}
		else if(command.equals("/changePwAction.emp")) {
			
		}
		// ------------------가상주소 매핑----------------
		// ------------------가상주소 이동----------------
		System.out.println("\n3. 가상주소 이동 시작");
		if(forward != null) { // 이동 정보가 존재할 때
			if(forward.isRedirect()) {
				System.out.println("C : " + forward.getPath() + "로, 이동방식 : " + forward.isRedirect());
				response.sendRedirect(forward.getPath());
			}
			else {
				System.out.println("C : " + forward.getPath() + "로, 이동방식 : " + forward.isRedirect());
				RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);
			}
		}
		System.out.println("\n3. 가상주소 이동 끝");
		// ------------------가상주소 이동----------------
	}
	
	// HttpServlet 기본(doPost, doGet)
	
	@Override
	protected void doPost
	(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	
	@Override
	protected void doGet
	(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doProcess(request, response);
	}
}
