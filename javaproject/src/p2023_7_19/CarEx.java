package p2023_7_19;

// p227

class Car{ // 클래스와 파일명을 일치시켜야 한다.
		   // 메인 메소드를 가진 클래스명과 일치시켜야 한다.
		   // public은 하나만 사용
		   // 메인 메소드가 없기때문에 메인메소드 안에서 호출하여 사용
		   // 컴파일만 가능하고 독립적으로 실행되지 않는다.
	
	// 필드 heap 영역에 저장
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed; // 객체 생성 시 0으로 초기 값 설정됨
}

public class CarEx {

	
	public static void main(String[] args) {
		
		// 객체 생성
		Car myCar = new Car(); // new 연산자를 통해 car클래스 안에 필드값의 주소값이 저장
		
		// 기존 필드 값 출력
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		// 필드 값 변경
		// 반드시 주소 값을 참조
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
		
	}

}
