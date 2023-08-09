package p2023_07_28;

abstract class AbstractClass { 	// 부모 클래스(추상 클래스)
	int a = 10;

	abstract void Method01(); 	// 추상 메소드
								// : 이름만 있고, 내용이 없다.

	void Method02() { 			// 일반 메소드
		System.out.println("Method02: 추상클래스에서 구현");
	}
}

// 추상 클래스를 상속 받으면, 추상 클래스 안에 있는 추상 메소드를
// 자식 구현 클래스에서 반드시 메소드 오버라이딩을 해야 한다.
class SubClass extends AbstractClass {

	@Override
	void Method01() { 			// 메소드 오버라이딩
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
}

class AbstractTest01 {
	public static void main(String args[]) {

		// 추상 클래스는 자체적으로 객체 생성을 할 수 없다.
//		AbstractClass abs = new AbstractClass();	오류 발생

		SubClass obj = new SubClass();
		obj.Method01();	// 메소드 오버라이딩된 메소드가 호출
		obj.Method02(); // 부모 클래스로 부터 상속 받아 사용
	}
}
