package p;

import packTest.packOne.AccessTest;

//AccessTest의 서브 클래스로 SubOne을 설계(자식 클래스)
class SubOne extends AccessTest {
	void subPrn() {
//		System.out.println(a); // [1. Sub] private -X
//		System.out.println(b); // [2. Sub] 기본 접근 지정자-X
		System.out.println(c); // [3. Sub] protected -O
		System.out.println(d); // [4. Sub] public -0
	}
}

//AccessTest랑 상속관계가 없는 클래스 
class SuperSubA {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();	// 객체 생성
		at.print();
		System.out.println("main");
//		System.out.println(at.a); // [1. main] private -X
//		System.out.println(at.b); // [2. main] 기본 접근 지정자-X
//		System.out.println(at.c); // [3. main] protected -X
		System.out.println(at.d); // [4. main] public -O
	}
}

// 1. 상속 관계가 있는 경우에
//	  2개의 클래스(부모,자식 클래스)가 같은 패키지 안에 들어 있을때는 
//	  부모의 접근제어자가 default, protected, public 접근제어자인 경우에
//	  자식클래스에서 접근 할수 있다. (단, private접근 제어자만 자식
//	  클래스에서 접근 할 수 없음)
//
//
// 2. 상속 관계가 있는 경우에
//	  2개의 클래스(부모,자식 클래스)가 다른 패키지 안에 들어 있을때는
//    부모의 접근제어자가  protected, public 접근제어자인 경우에
//	  자식클래스에서 접근 할수 있다. 
//
//
// 3. 상속 관계가 없는 경우에
//	  2개의 클래스가 서로 다른 패키지 안에 들어 있을때는 public 
//    접근제어자로 되어 있어야만 다른 클래스에서 접근 할 수 있다.