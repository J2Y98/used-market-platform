package com.itwillbs.employee.db;

import java.sql.Date;

public class EmployeeDTO {
	private String emp_id;
	private String emp_pw;
	
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_pw() {
		return emp_pw;
	}
	public void setEmp_pw(String emp_pw) {
		this.emp_pw = emp_pw;
	}
	
}
