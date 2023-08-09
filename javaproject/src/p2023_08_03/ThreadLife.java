package p2023_08_03;

// 멀티 스레드 프로그램
public class ThreadLife implements Runnable {

	public void run() { // 메소드 오버라이딩
		for (int i = 1; i < 21; i++) {
			// thread의 이름과 정수 출력
			// currentThread() : 현재의 스레드를 구해오는 메소드
			// getName () 는 메인메소드에 선언한 메소드 이름을 불러오는 것
			System.out.println(Thread.currentThread().getName() + " number = " + i);
		}
	}

	public static void main(String[] args) {
		ThreadLife tl = new ThreadLife();

		// 첫 번째 Thread 생성
		Thread first = new Thread(tl, "first1");

		// 두 번째 Thread 생성
		Thread second = new Thread(tl, "second1");

		// 세 번째 Thread 생성
		Thread third = new Thread(tl, "third1");

		second.start(); // 실행 가능한 상태(Runnable)
		first.start();
		third.start();
	}
}
