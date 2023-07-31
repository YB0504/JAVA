package p2023_7_31;

// 업캐스팅(자동 형변환)
// 1. 서브클래스에서 슈퍼클래스로 형변환 하는것
// 2. 참조 가능한 영역이 축소가 된다.
// 3. 컴파일러에 의해서 암시적 형변환(자동 형변환) 된다.
class Parent { // 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child extends Parent { // 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

class RefTest01 {
	public static void main(String[] args) {
		Child c = new Child(); // 자식 클래스로 객체 생성
		c.parentPrn();	// 상속 받은 메소드 호출
		c.childPrn(); // 자식 클래스 본인의 메소드 호출

		Parent p;
		p = (Parent) c;

		Parent p1 = new Child();// 위의 두 줄을 한 줄로 작성한 것(업 캐스팅)
//		Parent p1 = (Parent)new Child();// 컴파일러가 자동으로 형 변환 시켜주기 때문에 생략가능 

		// 참조 가능 영역이 축소가 일어난다.
		p.parentPrn(); // 업 캐스팅 후에는 상속 받은 메소드만 호출할 수 있다.
// 		p.childPrn(); 	// 컴파일 에러가 발생하게 된다. 
	}
}