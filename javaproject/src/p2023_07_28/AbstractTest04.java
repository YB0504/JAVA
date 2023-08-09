package p2023_07_28;

interface IHello { 			// 부모 인터페이스
	public abstract void sayHello(String name); 	// 추상 메소드
//	void sayHello(String name);	
//	인터페이스는 자동으로 추상 메소드로 인식해서 생략 가능하다.
}

abstract class GoodBye04 { 	// 부모 추상 클래스
	public abstract void sayGoodBye(String name); 	// 추상 메소드
}

// 클래스와 인터페이스를 동시에 상속 받을 때는 클래스를 먼저 상속 받고,
// 인터페이스를 상속 받아야 한다.(순서가 바뀌면 오류 발생)
class SubClass04 extends GoodBye04 implements IHello {
//	class SubClass04 implements IHello extends GoodBye04 { // 오류 발생

	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest04 {
	public static void main(String[] args) {
		SubClass04 test = new SubClass04();
		test.sayHello("홍길동");
		test.sayGoodBye("이순신");
	}
}