package com.itwillbs.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

/**
 * JSMoveFunction : 컨트롤러 사용 없이 JS만 사용하여 
 * 					페이지 이동처리
 * */

public class JSMoveFunction {
	// alert + Location.href
	public static void alertLocation
	(HttpServletResponse response,String alert,String location) {
		try {
			System.out.println("JSMoveFunction alertLocation()");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('" + alert + "');");
			out.println("location.href=" + "'" + location + "';");
			out.println("</script>");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// alert + history.back()
	public static void alertHistory
	(HttpServletResponse response, String alert) {
		try {
			System.out.println("JSMoveFunction alertHistory()");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('" + alert + "');");
			out.println("history.back();");
			out.println("</script>");
			out.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}