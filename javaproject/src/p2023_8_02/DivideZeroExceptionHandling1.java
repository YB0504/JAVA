package p2023_8_02;

// 예외처리

// try ~ catch 구문에서 예외처리 클래스를 잘 모를때는 예외처리 클래스 중
// 최상위 클래스인 Exception 클래스로 모든 예외를 받을 수 있다.

public class DivideZeroExceptionHandling1 {
	public static void main(String[] args) {

		// int type의 변수 선언
		int b = 20;
		int a = 0;
		int c = 0;

		// 두 수의 나눗셈 결과를 구한다

		try {
			c = b / a;				// 예외발생
			int total = a + b;
			int sub = b - a;

		} catch (Exception e) {
			a = 2;
			c = b / a;
			System.out.println("0으로 나눌 수 없습니다.");
		}

		System.out.println(c);
	}
}
