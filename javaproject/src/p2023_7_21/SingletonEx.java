package p2023_7_21;

//p280

class Singleton { // class 형태의 자료형이다.

	// 싱글톤(Singleton) : 객체 생성을 한 번만 수행 하는 것
	// 정적 필드
	private static Singleton s = new Singleton();

	private Singleton() { // 기본 생성자가 직접 객체를 생성하는 것을 private로 막아준다.

	};

	// 정적 메소드를 이용해서 공유
	public static Singleton getInstance() { // 정적 메소드
		return s;
//		return 구문을 반드시 써야한다.
//		결과를 받는 자료도 Singleton클래스 형태로 값을 돌려 받아야 한다.
	}

	public void cheak() {
		System.out.println("메소드 호출 성공1");
	}

	public void check1() {
		System.out.println("메소드 호출 성공2");
	}

}

public class SingletonEx {

	public static void main(String[] args) {

//		private 접근 제어자 때문에 외부 클래스에서 접근할 수 없다.
//		System.out.println(Singleton.s); 

//		Singleton s = new Singleton(); // 오류 발생
		Singleton obj1 = Singleton.getInstance(); // 정적 메소드 호출
		Singleton obj2 = Singleton.getInstance();

//		16진수의 형태로 주소값을 받는다
		System.out.println(obj1);
		System.out.println(obj2);
		if (obj1 == obj2) { // 주소값 비교
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}

		obj1.cheak();
		obj1.check1();
		obj2.cheak();
		obj2.check1();

	}

}
