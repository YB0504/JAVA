package p2023_07_20;

class Calculator {

	// 메소드
	// 사용자 정의 메소드
	void powerOn() { // 접근 제어자가 생략된 상태
//	돌려줄 값이 없는 경우 void로 작성
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) { // 지역 변수 x, y, result
//			// 매개 변수
		int result = x + y;
		// 자료형이 오는 경우 값을 돌려주기 위해
		// return구문을 반드시 선언해줘야 한다.
		return result;
		// return구문은 반드시 메소드 가장 마지막 줄에 사용해야 한다.
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y; // 강제 형변환 int -> double
		return result;

	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator mycal = new Calculator(); // 객체 생성
		mycal.powerOn(); // void 메소드로 값을 돌려주지 않기때문에 변수형태로 생성이 안됨
		// 메소드 호출
		int result1 = mycal.plus(5, 6);
		System.out.println("result1 : " + result1);

		byte x = 10;
		byte y = 4;
		double result2 = mycal.divide(x, y); // 자동 형변환 byte -> int
		System.out.println("result2 : " + result2);

		mycal.powerOff();

	}

}
