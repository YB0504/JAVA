package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {

	// 추상 메소드
	// 통일성 있는 메소드를 위해 추상메소드를 메소드 오버라이딩해서 사용한다.
	// 매개변수로 request, response를 받는다.
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception;

}
