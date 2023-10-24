package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {

	// 통일성있는 작업을 위한 추상메소드
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response)
			throws Exception;
}
