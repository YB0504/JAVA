package p2023_7_27;

// 부모 클래스의 메소드는 자식 클래스에게 상속된다.
class Parent {							// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 메서드는 상속된다.");
	}
}

// Parent를 슈퍼 클래스로 하는 서브 클래스 Child 정의 
class Child extends Parent {			// 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 메서드는 슈퍼가 사용 못한다.");
	}
}

class SuperSub01 {
	public static void main(String[] args) {
		
		// 자식 클래스로 객체 생성하면, 부모 클래스로 부터 상속받은  
		// 메소드도 사용할 수 있고, 자기 클래스의 메소드도 사용할 수 있다.
		Child c = new Child();  // 서브 클래스로 객체를 생성
		c.parentPrn(); 			// 슈퍼 클래스에서 상속 받은 메서드 호출
		c.childPrn(); 			// 서브 클래스 자기 자신의 메서드 호출
		System.out.println("-------------------------------------->> ");

		// 부모 클래스로 객체를 생성하면, 부모 클래스의 메소드만 접근해서 사용할 수 있고
		// 자식 클래스의 메소드는 사용할 수 없다.
		Parent p = new Parent(); // 슈퍼 클래스로 객체 생성
		p.parentPrn(); 			 // 슈퍼 클래스 자기 자신의 메서드 호출
//		p.childPrn( ); 		 	 // 서브 클래스 메서드는 가져다 사용 못함	오류발생
	}
}