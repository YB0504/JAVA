package p2023_8_4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx implements Runnable {

	@Override
	public void run() {

		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");

		while (true) { // 반드시 반복문 안에 있어야 한다
			Date d = new Date();
			System.out.println(sf.format(d));
			try {
				Thread.sleep(1000); // 반드시 예외처리 구문 안에 들어가야 한다.
			} catch (Exception e) { // 예외처리
			}
		}
	}

	public static void main(String[] args) {

		ThreadEx tx = new ThreadEx();
		Thread t = new Thread(tx);
		t.start();
	}

}
