package p2023_07_13;

public class ImplicitConversion {

	public static void main(String[] args) {

		// char 변수 선언 및 초기화.
		char charValue = 'a';
		System.out.println("charValue = " + charValue);

		// int 변수 선언 및 'a'의 값으로 초기화.
//		int intValueOfChar = charValue;
		int intValueOfChar = 'a'; // 자동  형변환 : char(2) -> int(4) - 아스기 코드
		System.out.println("intValueOfChar = " + intValueOfChar);

		// int 변수 선언 및 초기화.
		int intValue = 30;
		System.out.println("intValue = " + intValue);

		// float 변수 선언 및 intValue 변수 값 할당
		float floatValue = intValue; // 30.0으로 형변환 int(4) -> float(4) 
		System.out.println("floatValue = " + floatValue);

		// double 변수 선언및 floatValue,intValue 변수 값 할당
		double doubleValue1 = floatValue; // 자동 형변환 : float(4) -> double(8)
		double doubleValue2 = intValue; // 자동 형변환 : int(4) -> double(8)
		System.out.println("doubleValue1 =" + doubleValue1);
		System.out.println("doubleValue2 =" + doubleValue2);

	}// main end
}// class end
