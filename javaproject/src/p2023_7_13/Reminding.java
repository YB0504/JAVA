package p2023_7_13;

public class Reminding {

	public static void main(String[] args) {
		
		// 연산식에서 자동 타입 변환
		
		byte b1 = 10;
		byte b2 = 20;
		int i1 = b1+ b2;
		System.out.println(i1);
		
		char c1 ='A';
		char c2 = 1;
		int i2 = c1 + c2;
		System.out.println("유니코드 = " + i2);
		System.out.println("출력 문자 = " + (char)i2);
		
		int i3 = 10;
		int i4 = i3/4;
		System.out.println(i4);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
		
	}

}
