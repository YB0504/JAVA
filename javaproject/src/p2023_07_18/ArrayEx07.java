package p2023_07_18;

public class ArrayEx07 {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");

			System.exit(0); // 프로그램 강제종료
		}
//		2. Wrapper를 이용한 자료형 변환 (기본자료형 <---> 참조형 )
//	       ex) int  <--->  String        Wrapper 클래스(박싱과 언박싱)
//	           int n = Integer.parseInt("20");

		String strNum1 = args[0]; // args[0] = "10"
		String strNum2 = args[1]; // args[1] = "20"
		// 문자열이기 때문에 산술연산이 불가능 하므로 정수로 강제 변환
		
		// 문자를 숫자로 형변환 해주는 역할  "20" -----> 20
		int num1 = Integer.parseInt(strNum1); // 정적 메소드기 때문에 클래스. 으로 접근해야한다.
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
