package p2023_8_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework implements Runnable {

	@Override
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

		Homework hw = new Homework();

		Thread today = new Thread(hw, "now");
		today.start();

	}

}
