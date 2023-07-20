package p2023_7_20;

class StaticTest {
	static int a = 10; // 정적 필드 : 메소드 영역(공유 영역)에 저장
	int b = 20; // 인스턴스 멤버변수 : heap메모리 영역에 저장
}

class StaticTest01 {
	public static void main(String[] args) {
		System.out.println("StaticTest.a->" + StaticTest.a);
		StaticTest s1 = new StaticTest(); // 객체 생성
		StaticTest s2 = new StaticTest();

		System.out.println("s1.a->" + s1.a + "\t  s2.a->" + s2.a);
		System.out.println("s1.b->" + s1.b + "\t  s2.b->" + s2.b);

		s1.a = 100; // 정적필드 a의 값을 100으로 할당
		// 값을 공유
		System.out.print("s1.a->" + s1.a);
		System.out.println("\t  s2.a->" + s2.a + "  ");
		System.out.println(StaticTest.a);

		s1.b = 200;
		System.out.print("s1.b->" + s1.b);
		// s1을 통해서 200이라는 값에 접근
		System.out.println("\t  s2.b->" + s2.b);
		// s2는 값이 변경 안되었기 때문에 20이 출력된다.
	}
}