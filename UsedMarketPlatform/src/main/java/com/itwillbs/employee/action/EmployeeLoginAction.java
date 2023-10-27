package com.itwillbs.employee.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwillbs.employee.db.EmployeeDAO;
import com.itwillbs.employee.db.EmployeeDTO;
import com.itwillbs.util.Action;
import com.itwillbs.util.ActionForward;
import com.itwillbs.util.JSMoveFunction;

public class EmployeeLoginAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO dto = new EmployeeDTO();
		
		dto.setEmp_id(request.getParameter("emp_id"));
		dto.setEmp_pw(request.getParameter("emp_pw"));
		
		System.out.println(dto.getEmp_id() + ", " + dto.getEmp_pw());
		int result = dao.loginEmployee(dto);
		ActionForward forward = null;
		if(result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("id", dto.getEmp_id());
			forward = new ActionForward();
			forward.setPath("./main.emp");
			forward.setRedirect(true);
			return forward;
		}
		else {
			JSMoveFunction.alertHistory(response, "아이디 또는 비밀번호 오류");
			return null;
		}
	}
}