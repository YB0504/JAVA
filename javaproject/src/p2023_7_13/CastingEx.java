package p2023_7_13;

// 강제 형변환 예제
// 컴파일러가 자동으로 변환 하지 않기에 강제로 변환
public class CastingEx {

	public static void main(String[] args) {		
		
		int intValue = 44032;
		char charValue = (char) intValue; // 유니코드를 문자로 강제 형변환
		System.out.println(charValue);
		
		long longValue =500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue =3.14;
		intValue = (int) doubleValue; // double형의 실수를 int형의 정수로 강제 형변환
		System.out.println(intValue);
		// 가장 많이 사용하는 변환
	}
}
