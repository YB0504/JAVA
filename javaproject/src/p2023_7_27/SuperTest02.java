package p2023_7_27;

class Point2D02 {			// 부모 클래스
	protected int x = 10;	// 필드
	protected int y = 20;
}

class Point3D02 extends Point2D02 {	// 자식 클래스
	protected int z = 30;			// 필드

	// x와 y는 상속 받아 사용하는 멤버변수
	public void print() {
		System.out.println(x + ", " + y + ", " + z); 
	}
}

class SuperTest02 {
	public static void main(String[] args) {
		Point3D02 pt = new Point3D02();
		pt.print();
	}
}