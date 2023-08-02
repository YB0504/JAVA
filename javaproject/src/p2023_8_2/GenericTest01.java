package p2023_8_2;

class TestClass {
	private int member; // 필드

	public void setValue(int value) {
		member = value;
	}

	public int getValue() {
		return member;
	}
}

class GenericTest01 {
	public static void main(String[] args) {

		TestClass obj01 = new TestClass();

		// private 접근제어자는 외부 클래스의 접근을 허용하지 않기 때문에
		// 필드로 직접 접근할 수 없다.
//		obj01.member = 30;	// 오류 발생
		obj01.setValue(3);	// set메소드의 값 설정
		System.out.println("되돌리는 값은->" + obj01.getValue());

		// 매개변수가 double형인 메소드가 필요하다.
		// 메소드 오버로딩이 안되어 있다.
//		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());

		// 매개변수가 String형인 메소드가 필요하다.
//		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());

	}
}
