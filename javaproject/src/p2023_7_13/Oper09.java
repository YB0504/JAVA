package p2023_7_13;

public class Oper09 {

	public static void main(String[] args) {
		
		/*
		 * 확장 대입 연산자 +=, -=, *=, /=, %=
		 * 
		 * ex) a+=b; // a = a + b; 
		 * 	   a-=b; // a = a - b; 
		 *     a*=b; // a = a * b; 
		 *     a/=b; // a =a / b; 
		 *     a%=b; // a = a % b;
		 *
		 */
		
		int a= 10, b= 3;
		System.out.println(a += b); // a= a+b 13 a 변수가 밑의 식에 영향을 준다
		System.out.println(a -= b); // a= a-b 10
		System.out.println(a *= b); // a= a*b 30
		System.out.println(a /= b); // a= a/b 10
		System.out.println(a %= b); // a= a%b 1
		
		
	}

}
