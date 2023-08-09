package p2023_8_03;

// Thread (스레드) : 1개의 process를 구성하는 논리적인 작업단위
// * 자바에서 Thread를 만드는 방법
// 1. Thread 클래스를 상속 받아서 만드는 방법
// 2. Runnable 인터페이스를 상속 받아서 만드는 방법

public class ThreadEnd extends Thread {

	public void run() { // 실행중인 상태(Running)
		// thread가 시작되면 실행되는 문장
		for (int i = 1; i <= 20; i++) {
			System.out.println("run number = " + i);
		}
	}

	public static void main(String[] args) {

		// 상속받은 클래스로 객체 생성
		ThreadEnd tt = new ThreadEnd();

		// thread를 실행시킴
		tt.start(); // 실행 가능한 상태(Runnable) : run () 메소드가 자동으로 호출

		// main()내에서 화면에 101부터 120까지 출력
		for (int i = 101; i <= 120; i++) {
			System.out.println("-------> main number = " + i);
		}
	}

}
