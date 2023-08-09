package p2023_07_17;

public class MethodEx01 {

//	메소드 : 여러가지 코드를 묶어 놓은 것
//	메소드를 사용하는 이유는 코드를 재사용하기 위해서 메소드 사용한다.
	
//	사용자 정의 메소드
//	메인 메소드 안에서 프로그래머가 직접 호출해야 실행된다.	
//	메소드 안에 메소드가 들어가서는 안된다 
//	메인 메소드 윗쪽이나 아래쪽에 작성하여야 한다.
	public static void check() { // 정적 메소드(static이 붙은 메소드)
		System.out.println("메소드 호출 성공"); 
		return;	// void가 왔기 떄문에 생략가능
//		호출하는 코드가 없기 때문에 아무것도 출력되지않는다.
//		
	}
	// 값 전달에 의한 메소드 호출 방식(Call by Value 방식)
	// public이 없다면 default 접근제어자
	static void check(int a) { // 괄호안의 변수 매개변수 (parameter) : int a =30
//							   // 매개변수의 자료형에 맞는 값을 전달해야한다
// 							   // 매개변수는 Stcak영역에 저장된다.
		// 매개변수가 기본자료형 일 때는 값을 전달해서 호출해야한다.
		System.out.println("전달된 값 : " + a);
	}
	// 하나의 클래스 안에 똑같은 클래스가 여러개가 존재 할때 메소드 오버로딩이라고 한다.
	static void check(int a, double d) {
		double result = a + d;			// 지역 변수
		// 매개변수가 여러개일 때도 해당 자료형에 맞는 값을 전달해야한다.
		System.out.println("전달된 값의 합 : " + result);
	}
	
	static void check(char c) {			// char 변수에 맞는 값
		System.out.println("전달된 값 : " + c);
	}
	
	static void check(boolean b) {		// boolean 변수에 맞는 값
		System.out.println("전달된 값 : " + b);
	}
	// 참조형 변수 일때는 주소값 전달에 의한 메소드 호출방식(Call by Reference 방식)
	static void check(String s) {
		System.out.println("전달된 값 : " + s);
							// String s = new String ("자바")
	}
//		return문 : 메소드를 호출한 곳에 값을 돌려주는 역할
//		return문은 메소드 반드시 맨 마지막에 작성해야 한다
	static int check01() { 
		// 메소드 앞에 자료형일 때는 return구문을 반드시 써줘야한다
		return 50; // 메소드를 호출한 곳에 50을 돌려주는 역할
//		자료형과 리턴값이 일치하여야한다.
	}
	
	static double check02(int a, double d) {
		double result = a + d;
		return result;
	}
	
	
	
	// main() 메소드는 반드시 자바가상머신(JVM : java.exe)으로만 호출된다
	// main() 메소드는 프로그래머가 직접 호출 할 수 없다.
	public static void main(String[] args) {
		MethodEx01.check(); // check() 메소드를 호출하여라(클래스명.정적메소드명으로 객체생성을 대체)
		// 메인 메소드에서 사용자 정의 메소드를 호출하여야 한다.
		check(); // 같은 클래스 안에 있는 정적메소드는 클래스명을 생략할 수 있다.
		check(30); 
		check(20 ,20.5); 
		check('A');
		check(true);
		check("자바");
		check(new String ("자바"));
		
		check01();	// return문으로 돌려주는 값이 출력되지 않는다.
		int result = check01(); // 변수로 받아서 출력 하던지 메소드 자체를 호출해서 출력해야 출력된다.
		System.out.println("돌려 받은 값 1 : " + result);
		System.out.println("돌려 받은 값 2 : " + check01());

		double result2 = check02(50, 3.14);
		System.out.println("돌려 받은 값 3 : " + result2);
		System.out.println("돌려 받은 값 4 : " + check02(50, 3.14));
		
	}

}
