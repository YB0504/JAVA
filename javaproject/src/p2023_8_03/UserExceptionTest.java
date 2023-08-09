package p2023_8_03;

public class UserExceptionTest {

	// Exception을 호출한 메소드로 던짐
	public void printNumber() throws UserDefineException {
		for (int i = 0; i < 10; i++) {
			
			if (i == 5)	// i값이 5인 경우에 프로그래머가 강제로 예외를 발생시킴
				throw new UserDefineException("사용자가 정의한 Exception입니다");
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		UserExceptionTest uet = new UserExceptionTest();

		try {
			uet.printNumber();
		} catch (UserDefineException ue) {
			System.out.println(ue.toString());
		}
	}
}
