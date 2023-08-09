package p2023_07_27;

class Point2D {			  // 부모 클래스
	protected int x = 10; // private int x=10; 오류 발생
	protected int y = 20; // private int y=20; 오류 바생
//	부모 클래스 안에 들어있는 필드(멤버 변수)는 자식 클래스에게 상속이 된다
}

class Point3D extends Point2D {	// 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z);
	}
}

// 메인 메소드를 따로 만들지 않을때는 자식 클래스에
// 메인 메소드를 만들면 된다.
// 메인 메소드를 가진 클래스명과 파일명을 일치 시켜야 한다.
class SuperSub04 {	// 메인메소드를 가진 클래스
	public static void main(String[] args) {
		Point3D pt = new Point3D();
		// 자식 클래스를 사용하여 객체 생성
		
		pt.print();
		System.out.println("x : " + pt.x);
		System.out.println("y : " + pt.y);
		System.out.println("z : " + pt.z);
	}
}