package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 부모 인터페이스를 상속받아 메소드 오버라이딩해서
// 통일성을 가질 수 있도록 한다.
public class MemberInsert implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		// 이 코드가 콘솔창에 출력되면 Service클래스까지 요청이 이동했다는 표시
		System.out.println("MemberInsert");
		
		// ActionForward 클래스로 리턴하기 위해서 객체생성
		ActionForward forward = new ActionForward();
		
		return forward;
	}

}
