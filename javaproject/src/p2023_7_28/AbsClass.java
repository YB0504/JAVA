package p2023_7_28;

public abstract class AbsClass { // 추상 클래스

	int a;

	// 추상 메소드 : 이름만 있고, 내용을 가지고 있지 않은 메소드
	public abstract void check();

	public void check01() {
		System.out.println("일반 메소드");
	}

}
