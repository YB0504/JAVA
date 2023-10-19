package service;

public class ActionForward {

	private boolean redirect; 	// 포워딩하는 방식을 설정하는 필드
	private String path; 		// 포워딩할 View페이지 명을 설정하는 필드

	public boolean isRedirect() {	// 자료형이 boolean형이기 때문에 is메소드로 만들어진다.
		return redirect;
	}

	public String getPath() {
		return path;
	}

	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
