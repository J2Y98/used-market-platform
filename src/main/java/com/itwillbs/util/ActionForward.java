package com.itwillbs.util;

public class ActionForward {
	private String path;
	private boolean isRedirect;

	public ActionForward() {
		System.out.println("티켓정보 생성");
		System.out.println("목적지 : X, 티켓 : X");
	}
	// alt shift s + r
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	// alt shift s + s
	@Override
	public String toString() {
		return "ActionForward [path=" + path + ", isRedirect=" + isRedirect + ", toString()=" + super.toString() + "]";
	}
}
