package p2023_07_28;

interface IHello06 { // 인터페이스
	int a = 10; // 상수 : public static final 생략

	public abstract void sayHello(String name); // 추상 메소드
}

interface IGoodBye06 { // 인터페이스
	public abstract void sayGoodBye(String name); // 추상 메소드
}

//	인터페이스 간의 상속
//	: 인터페이스 끼리 상속을 받을 때는 extends로 상속을 받아야 하고,
//	  다중 상속도 지원한다.
interface ITotal06 extends IHello06, IGoodBye06 {
	public abstract void greeting(String name);
}

// 인터페이스를 상속 받는 구현 클래스에서 3개의 추상 메소드를
// 모두 메소드 오버라이딩을 해야한다.
class SubClass06 implements ITotal06 {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕가세요!");
	}

	public void greeting(String name) {
		System.out.println(name + ", 안녕!");
	}
}

class AbstractTest06 {
	public static void main(String[] args) {
		SubClass06 test = new SubClass06();
		test.sayHello("홍길동");
		test.sayGoodBye("홍길동");
		test.greeting("홍길동");

		System.out.println("a : " + IHello06.a);

		// a 는 상수 이기 때문에 값이 수정될 수 없다.
//		IHello06.a = 30;	오류 발생

	}
}