package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	
	// 추상 메소드
	// 메소드 마지막에 세미콜론으로 마무리
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response)throws Exception;
			
}