package p2023_07_13;

public class Oper01 {

	public static void main(String[] args) {
		
// 산슬 연산자 : +, -, *, /, %(나머지)
// int 형과 int 형을 산술 연산을 수행하면, 결과는 int 형으로 처리된다.
// 변수를 두 개 이상 만들어야 산술 연산자 사용 가능		
		int a = 10, b = 3, c; // int 변수를 한줄로 여러번 선언 할 때는 ',' 로 가능 
		// c 는 선언만 하여 기억공간에 형성 하라는 의미
		c = a + b; // 변수의 초기값이 주어지지 않으면 사용 불가능
		System.out.println("a + b = " + c);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b)); // 몫
		// int 형 이므로 소수점 이하를 버리고 3만 출력
		System.out.println("a % b = " + (a % b)); // 나머지
		
		
		
		
	}

}
