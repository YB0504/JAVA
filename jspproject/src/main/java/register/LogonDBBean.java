// DAO(Data Access Object)

package register;

public class LogonDBBean {
	
	// 싱글톤 : 객체 생성을 한번만 수행하는 것
	private static LogonDBBean instance = new LogonDBBean();
	
	// 공유를 위한 정적 메소드 생성
	// 사용할 때는 LogonDBBean.getInstance()로 호출하여 사용한다.
	public static LogonDBBean getInstance() {
		return instance;
	}
	
	// 회원가입 메소드
	// 주소값 전달에 의한 메소드 호출 방식 (Call by Reference 방식)
	public int insertMember(LogonDataBean member) {
		int result = 0;
		return result;
	}
	
}
