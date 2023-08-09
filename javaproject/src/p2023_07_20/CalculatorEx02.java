package p2023_07_20;

// 메소드 오버로딩

// : 한 개의 클래스 안에 동일한 이름을 가진 메소드를 여러 개 정의 하는 것
// 메소드 오버로딩 조건
// 1.매개 변수의 자료형을 서로 다르게 설정
// 2.매개 변수의 갯수를 서로 다르게 설정
// 3.매개 변수의 순서를 바꾸어서 설정

class Calculator2 {
	 
	// 매개 변수의 개수를 서로 다르게 설정한 경우의 메소드 오버로딩
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}

	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

public class CalculatorEx02 {

	public static void main(String[] args) {
		
		Calculator2 myCalcu = new Calculator2();
		
		// 정사각형 넓이 구하기
		double result1 = myCalcu.areaRectangle(10); // 자동 형변환
									// 매개변수 개수에 맞는 메소드를 호출
		
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
		

	}

}
