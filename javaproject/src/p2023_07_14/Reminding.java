package p2023_07_14;

public class Reminding {

	public static void main(String[] args) {
		
		// 산술 연산자
		
		int i1 = 5;
		int i2 = 2;
		
		int result1 = i1 + i2;
		System.out.println("result1 = " + result1);
		
		int result2 = i1 - i2;
		System.out.println("result2 = " + result2);
		
		int result3 = i1 * i2;
		System.out.println("result3 = " + result3);
		
		int result4 = i1 / i2; // 몫
		System.out.println("result4 = " + result4);
		
		int result5 = i1 % i2; // 나머지
		System.out.println("result5 = " + result5);

		double result6 = (double)i1 / i2; // 정수를 실수화 하여 소수점 아래까지 표기
		System.out.println("result6 = " + result6);
		
	}

}
