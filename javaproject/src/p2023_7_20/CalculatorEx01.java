package p2023_7_20;

// 클래스 내부에서 메소드 호출
// 일반 메소드 안에서 다른 메소드 호출
// 메소드만으로도 메소드를 호출할 수 있다.
class Calculator1 {
	int plus(int x, int y) {
		int result = x + y; // 17
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y);	// plus() 메소드 호출  3
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = avg(7, 10);	// avg() 메소드 호출 2
		println("실행결과 : " + result); //prlintln() 메소드 호출
	}

	void println(String message) {
		System.out.println(message);
	}
}

public class CalculatorEx01 {

	public static void main(String[] args) {

		Calculator1 myCalc = new Calculator1();

		// 메인 메소드 안에서 메소드를 호출하기 위해서는 메소드를 가진
		// 클래스로 객체를 생성한 후에 생성된 객체를 이용해서 메소드를 호출
		myCalc.execute(); // execute() 메소드 호출 1

//		execute();		 // 오류 발생
	}

}
