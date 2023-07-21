package p2023_7_21;

class FinalMember {
	final int a = 10; // 상수
//	기존 변수(필드) 앞에 final이 붙으면 변경할 수 없는 상수가 된다.

	public void setA(int a) {
//		this.a = a;	// 수정을 할 수 없는데 수정을 시도하고 있기에 오류 발생
	}
}

public class FinalTest01 {
	public static void main(String[] args) {
		FinalMember ft = new FinalMember();
		final int a = 1000;
		ft.setA(100);
		System.out.println(a);
	}
}
