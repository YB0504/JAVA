package p2023_7_20;

class StaticTest2 {

	private static int a = 10; // private 와 static의 모순 발생
	private int b = 20; // 인스턴스 멤버변수(필드)

	public static void setA(int new_a) { // 정적 메소드
		a = new_a; // 10000 저장
	}

	public static int getA() { // 정적 메소드
		return a;
	}
}

public class StaticTest02 {
	public static void main(String[] args) {
//		System.out.println(StaticTest2.a); // 오류 발생
		// a가 private으로 선언되어서 컴파일 에러 발생
		System.out.println(StaticTest2.getA());

		StaticTest2 s1 = new StaticTest2();
		StaticTest2 s2 = new StaticTest2();

//		s1.setA(10000);
		StaticTest2.setA(10000);

//		int res1 = s1.getA();
		int res1 = StaticTest2.getA();

		System.out.println(res1);
		System.out.println(s2.getA());
	}
}