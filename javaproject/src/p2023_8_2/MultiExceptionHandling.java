package p2023_8_2;

// ArithmeticException : 숫자를 0으로 나눌때 발생하는 예외

// ArrayIndexOutOfBoundsException : 배열의 범위를 벗어 났을때 발생하는 예외

public class MultiExceptionHandling {
	public static void main(String[] args) {

		int value = 20;
		int div = 0;
		int[] intArray = { 1, 2, 3 };

		try {
//			int arrayValue = intArray[4];		// 예외발생
//			System.out.println(arrayValue);

			// 두수의 나눗셈을 구함
			int result = value / div; 		// 예외발생
			System.out.println(result);

			// 배열의 특정 값을 저장
			int arrayValue = intArray[4];
			System.out.println(arrayValue);

		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
			System.out.println("0으로 나눌수 없습니다.");

		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace(); // 예외 정보를 자세하게 출력
			System.out.println("배열의 범위를 벗어 났습니다.");

		} catch (Exception e) {
			// Exception 예외 클래스가 하위 예외 클래스들을
			// 모두 가지고 있기 때문에 먼저 정의해서는 안된다.
			System.out.println("Exception !!");
		}
		System.out.println("프로그램 종료!");
	}
}
