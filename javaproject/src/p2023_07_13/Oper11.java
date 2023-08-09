package p2023_07_13;

public class Oper11 {

	public static void main(String[] args) {
		
// 증감 연산자 예제 02
		
		int a= 10, b=10;
		
		System.out.println("a = " + a++); // 후행 연산 a = 10
		System.out.println("a = " + a); // a = 11
		
		System.out.println("b = " + (++b)); // 선행 연산 b = 11
		System.out.println("b = " + b); // b = 11
		
	}

}
