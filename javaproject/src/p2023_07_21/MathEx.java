package p2023_07_21;

public class MathEx {

	public static void main(String[] args) {

//	Math 클래스 = 정적 필드와 정적 메소드로만 구성
//	Math 클래스는 생성자가 제공되지 않기 때문에 직접 객체를 생성할 수 없다.
//		Math m = new Math();	// 오류 발생

		System.out.println("E = " + Math.E); // 오일러 상수
		System.out.println("PI = " + Math.PI); // 원주율

		System.out.println("abs() = " + Math.abs(-10));
		// 절대값 기능
		System.out.println("ceil() = " + Math.ceil(3.14));
		// 올림 기능 (double)형으로 결과 출력
		System.out.println("round() = " + Math.round(10.5));
		// 반올림 기능 (long)형으로 결과 출력
		System.out.println("floor() = " + Math.floor(10.9));
		// 내림 기능 (double)형으로 결과 출력
		System.out.println("max() = " + Math.max(10, 20));
		// 최대값 기능 (JAVA는 두개의 값까지 밖에 안만들어 놨기 때문에 
		// 			 3개 이상은 따로 만들어야한다)
		System.out.println("min() = " + Math.min(10, 20));
		// 최소값 기능
		System.out.println("pow() = " + Math.pow(2, 3));
		// 제곱 기능 (double)형으로 결과 출력
		System.out.println("random() = " + Math.random());
		// 난수 기능 (double)형으로 결과 출력
		// 필요한 자료형에 따라서 형 변환 시켜야 한다.( 기본 자료형 변환 )
		// 0.0 <= random < 1.0
		int d = (int)(Math.random() * 6) + 1;	// 1 ~ 6 사이의 난수
		System.out.println("주사위 번호 : " + d);
		
		int r = (int)(Math.random() * 45) + 1;
		System.out.println("로또 번호 : " + r);
		
		System.out.println("sqrt() = " + Math.sqrt(36));
		// 제곱근 기능(루트) (double)형으로 결과 출력
		
		
	}

}
