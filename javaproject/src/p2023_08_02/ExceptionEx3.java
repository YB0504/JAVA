package p2023_08_02;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int var = 50;
//	 	args[0] = "5"	예외발생 안됨
//	 	args[0] = "a"	예외발생
//	 	args[0] = "0"	예외발생

		try {
			int data = Integer.parseInt(args[0]);

			System.out.println(var / data);

		// Exception 예외 클래스가 하위 예외 클래스들을
		// 모두 가지고 있기 때문에 가장 마지막에 사용해야 한다.

		} catch (NumberFormatException ne) {
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (Exception e) {
			System.out.println("Exception !!");
		}
		System.out.println("프로그램 종료!");
	}
}
