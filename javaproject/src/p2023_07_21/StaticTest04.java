package p2023_07_21;

class StaticTest4 {
	private static int a = 10;
	private int b = 20;

	public static void printA() {
		System.out.println(a);
//		System.out.println(b); // 컴파일 에러 발생
//		정적 메소드 안에서는 정적필드만 사용 가능
	}
//	일반 메소드 안에는 정적필드와 일반 필드 모두 사용 가능하다.
	public void printB() {
		System.out.println(b);
	}
}

public class StaticTest04 {
	public static void main(String[] args) {
//		정적 메소드는 정적 메소드를 가진 클래스명 (.)으로 접근해서 호출한다.
		StaticTest4.printA();	// 정적 메소드 호출
		
//		일반 메소드는 일반 메소드를 가진 클래스명으로 객체를 생성해서 메소드를 호출
		StaticTest4 s1 = new StaticTest4();
						// new 연산자로 클래스에 대한 객체 생성
		StaticTest4 s2 = new StaticTest4();
		s1.printB();
		s2.printB();
	}
}