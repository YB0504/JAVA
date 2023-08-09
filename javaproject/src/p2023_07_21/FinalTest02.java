package p2023_07_21;

//	상속
//	1. 클래스를 상속 받기 위해서는 자식 클래스명 옆에 extends로 상속을 받는다.
//	2. 부모 클래스의 멤버 중에서 필드와 메소드만 자식 클래스로 상속된다.

//	메소드 오버라이딩(Method Overiding)
//	: 부모 클래스로부터 상속받은 메소드를 자식 클래스에서 이름과 형식은 그대로 쓰되
//	  내용을 다르게 정의해서 사용하는 것을 의미
class FinalMethod { // 부모 클래스
	String str = "Java ";

	// public void setStr(String s) {
	// final 붙이면 서브(자식) 클래스에서 오버라이딩이 불가.
	public final void setStr(String s) {
		str = s;
		System.out.println(str);
	}
}

//	자식 클래스명 +extends+ 부모 클래스 (상속)
class FinalEx extends FinalMethod {	// 자식 클래스
	int a = 10; // final 붙이면 밑에서 a값 대입 불가.

	public void check() {
	System.out.println("str : " + str);
	// 자식 클래스에는 str이 명시되있지 않지만 상속을 받아서 사용할 수 있다.
		
	}
	
	public void setA(int a) {
		this.a = a;
	}

//	public void setStr(String s) { // 메소드 오버라이딩
//		str += s; // 내용 재정의
//		System.out.println(str);
//	}

}

public class FinalTest02 {
	public static void main(String[] args) {
		FinalEx ft = new FinalEx();
		ft.setA(100);
		ft.setStr("hi");// 슈퍼 클래스의 setStr을 실행.
		FinalMethod ft1 = new FinalMethod();
		ft1.setStr("hi");// 자신의 클래스의 setStr을 실행.
	}
}