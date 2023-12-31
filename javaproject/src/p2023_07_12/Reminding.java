package p2023_07_12;

import java.util.Iterator;

public class Reminding {

	public static void main(String[] args) {

		// byte < short < int < long < float < double
		// 자동 형 변환
		byte byteValue = 10;
		int intValue = byteValue; // 자동 타입 변환
		System.out.println(intValue);

		long longValue = 5000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);
		double doubleValue = longValue;
		System.out.println(doubleValue);
		// 5.0E9로 출력됨
		
		char charValue = 'A'; // A의 유니코드가 출력됨
		int intValue1 = charValue;
		System.out.println(intValue);
		
		// 자동 변환에서의 예외
		/*
		 * byte byteValue1 = 65; 
		 * char charValue1 = byteValue;
		 */ 
		// byte는 음수를 포함하지만 char는 음수를 포함하지 않아서 예외
		
		//예제
		
		byte byteValue2 = 10;
		int intValue2 = byteValue2;
		System.out.println("intValue: " + intValue);
		
		char charValue2 = '가';
		int intValue3 = charValue2;
		System.out.println("가의 유니코드: " + intValue3);
		
		int intValue4 = 50;
		long longValue2 = intValue4;
		System.out.println("longValue: " + longValue2);
		
		long longValue3 = 100;
		float floatValue2 = longValue3;
		System.out.println("floatValue: " + floatValue2);
		
		float floatValue3 = 100.5f;
		double doubleValue2 = floatValue3;
		System.out.println("doubleValue: " + doubleValue2);
		
	}
}
