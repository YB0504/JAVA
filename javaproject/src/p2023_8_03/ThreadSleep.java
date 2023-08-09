package p2023_8_03;

// 스레드의 상태 제어
// sleep(1/1000 초) : 주어진 시간동안 특정 thread를 강제로
// 				 	  block 상태로 만드는 메소드

public class ThreadSleep implements Runnable {

	public void run() {
		for (int i = 1; i < 10; i++) {
			// 현재 CPU를 점유한 Thread 출력
			System.out.println(Thread.currentThread().getName() + " : " + i);

			try {
				// sleep() 메소드를 사용해 프로그래머가 강제로
				// block 상태로 만듦.
				// 1초 동안 thread을 block 상태에 빠트림
				// 메소드 자체적으로 반드시 예외처리 형식을 요구한다.
				Thread.sleep(1000); // (단위: 1/1000 초)
			} catch (InterruptedException ie) {
				System.out.println(ie.toString());
			}
		} // for end
	}// run() end

	public static void main(String[] args) {
		ThreadSleep ts = new ThreadSleep();

		// 두 개의 Thread를 생성시켜 실행시킴
		// 2개의 Thread가 동일한 우선 순위로 실행됨.(5인 상태)
		Thread first = new Thread(ts, "first1");
		Thread second = new Thread(ts, "second1");
		first.start();
		second.start();
		// today.run(); 메소드 만을 호출하면 run메소드 안의 내용이
		// 먼저 출력되기 때문에 thread가 아니다.
	}
}
