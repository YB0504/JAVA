package p2023_07_25;

public class WrapperEx {

	public static void main(String[] args) {
		
//		Integer in = new Integer;
//		기본 생성자가 api안에 없기 때문에 오류 발생

//	int형 변수의 최대값과 최소값

		System.out.println("max : " + Integer.MAX_VALUE);
		System.out.println("max : " + Integer.MIN_VALUE);

//	String -> int : "20" -> 20

		int n = Integer.parseInt("20");
		System.out.println(n);
		// 정수로 변환 되었기 때문에 산술 연산이 가능
		System.out.println(n + 10);

		// 숫자로 변환 가능한 문자열만 메소드 안에 들어갈 수 있다.
		// int n2 = Integer.parseInt("a");

//		10진수를 2진수로 변환
		System.out.println("2진수 : " + Integer.toBinaryString(10));

//		10진수를 8진수로 변환
		System.out.println("8진수 : " + Integer.toOctalString(10));

//		10진수를 16진수로 변환
		System.out.println("16진수 : " + Integer.toHexString(10));

	}

}
