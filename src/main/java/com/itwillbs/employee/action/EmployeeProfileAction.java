package com.itwillbs.employee.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwillbs.employee.db.EmployeeDAO;
import com.itwillbs.employee.db.EmployeeDTO;
import com.itwillbs.util.Action;
import com.itwillbs.util.ActionForward;

public class EmployeeProfileAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		HttpSession session = request.getSession();
		EmployeeDTO  dto = dao.loadProfile((String)session.getAttribute("id"));
		request.setAttribute("profile", dto);
		return null;
	}
}
