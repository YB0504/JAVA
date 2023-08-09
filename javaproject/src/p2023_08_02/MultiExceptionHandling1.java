package p2023_08_02;

// try ~ catch ~ finally 형식
// 1. finally 안에 들어있는 내용은 
//	  예외가 발생하든, 안하든 무조건 실행된다.
// 2. finally 안에 들어가는 내용은 주로 파일을 닫거나,
//	  DB 연결을 끊는 내용이 사용된다.
// ex) file.close(), con.close()

public class MultiExceptionHandling1 {
	public static void main(String[] args) {

		int value = 20;
		int div = 0;

		int[] intArray = { 1, 2, 3 };

		try {

//			int result = value / div;		// 예외발생
//			System.out.println(result);

			int arrayValue = intArray[2]; 	// 예외발생
			System.out.println(arrayValue);

		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
			System.out.println("0으로 나눌수 없습니다.");

		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println("배열의 범위를 벗어 났습니다.");

		} finally {
			System.out.println("예외가 발생했음!");

		}
	}
}
