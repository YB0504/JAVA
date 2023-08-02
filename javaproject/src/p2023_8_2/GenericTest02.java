package p2023_8_2;

class TestClass2 {
	
	// Object는 자바에서 최상위 클래스
	private Object member;

	public void setValue(Object value) { // 메소드의 매개변수가 Object
		member = value;
	}

	public Object getValue() {	// 메소드 앞의 자료형이 Object
		return member;
	}
}

class GenericTest02 {
	public static void main(String[] args) {
		TestClass2 obj01 = new TestClass2();
		
		// 자식 객체를 만들어서 부모 클래스에 
		// 넘겨주는 것을 업캐스팅
		
		// Object value = new Integer(3);	박싱 + 업캐스팅
		// Object value = 3;				자동박싱 + 업캐스팅
		
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		
		// Object형을 변수 형태로 돌려주기 위해 
		// 기본 자료형으로 형변환 하는 것을 다운캐스팅
		// 다운 캐스팅 + 언박싱
		int n1 = ((Integer)(obj01.getValue())).intValue();
		// 다운 캐스팅 + 자동 언박싱
		int n2 = ((Integer)(obj01.getValue()));

		// Object value = new Double(3.4) 박싱과 업캐스팅
		// Object value = (3.4)			  자동 박싱과 업캐스팅
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());

		// 다운 캐스팅 + 언박싱
		double d1 = ((Double)(obj01.getValue())).doubleValue();
		// 다운 캐스팅 + 자동 언박싱
		double d2 = ((Double)(obj01.getValue()));
		
		// Object value = new String("이해할 수 있다.");	업캐스팅
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());
		
		// 다운 캐스팅
		// String객체는 다운 캐스팅시에 자동 언박싱이 일어나지 않는다.
		String str = (String)obj01.getValue();

	}
}
