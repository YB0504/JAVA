package p2023_7_13;

//서로 다른 자료형의 변수를 산술 연산을 수행하면 가장 큰 자료형으로 자동 형변환
public class CastingEx01 {

	public static void main(String[] args) {

		byte value1 = 10; // 1byte
		int value2 = 100; // 4byte
		long value3 = 1000L; // 8byte
		long result = value1 + value2 + value3;
		System.out.println(result);

		int i = 100;
		double d = 3.14;
		double result1 = i + d;
		System.out.println(result1);

		// 1. 같은 자료형 변수를 산술 연산하면 같은 자료형으로 처리 됨
		// 2. 서로 다른 자료형의 변수를 산술 연산을 수행하면 가장 큰 자료형으로 자동 형변환
		int total = 93;
		System.out.println(total / 5); // 18
		System.out.println(total / 5.0);

		double result2 = total / 5; // 18.0
		double result3 = total / 5.0;
		System.out.println(result2); // (소수점 이하 숫자를 없앰)
		System.out.println(result3);

	}

}
