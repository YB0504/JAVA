package p2023_07_27;

//1. 메소드 재 정의(Method Overriding)
//   : 부모 클래스로부터 상속 받은 메소드를 자식 클래스에서 재 정의해서 사용하는 것.
//2. 자식 클래스로 객체를 생성한 다음에 메소드를 호출하면.
//	 메소드 오버라이딩된 메소드만 호출된다.
//3. 부모 클래스의 상속해주는 메소드는 더 이상 사용할 수 없는 은닉 메소드가 된다.
//4. 부모 클래스의 은닉 메소드를 사용하기 위해서는 자식 클래스의 메소드 안에서
//	 super.areaCircle() 형식으로 호출해서 사용할 수 있다.
class Calculator { 					// 부모 클래스
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}

class Computer extends Calculator { // 자식 클래스

	@Override // 어노테이션
	double areaCircle(double r) { 	// 메소드 오버라이딩
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; 
	} 
}

public class ComputerEx {

	public static void main(String[] args) {

		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
		// 자식 클래스에서 메소드 오버라이딩된 메소드가 호출 된다.
	}

}
