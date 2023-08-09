package p2023_8_03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {

			Date d = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
			System.out.println(Thread.currentThread().getName() + " : " + i);
			System.out.println(sd.format(d));

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		// 상속받은 클래스로 객체 생성
		Homework hw = new Homework();

		// Tread 객체 생성
		Thread today = new Thread(hw, "now");
		today.start();
		// today.run(); 메소드 만을 호출하면 run메소드 안의 내용이
		// 먼저 출력되기 때문에 thread가 아니다.

	}

}
