package p2023_08_04;

// Thread 클래스를 상속받아 Thread를 정의함.

public class Family extends Thread {
	
	// 필드
	Toilet toilet;
	String who;
	boolean key; // 초기값: false

	// 생성자
	public Family(String name, Toilet t) {
		who = name;
		toilet = t;
	}

	public void run() {	// 메소드 오버라이딩
		toilet.openDoor(who, key);
	}
}