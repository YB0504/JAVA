package p2023_08_04;

import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// JAVA는 클래스의 다중상속을 허용하지 않기 때문에 
// Runnable인터페이스를 상속받아 작성
public class Clock extends JFrame implements Runnable {

	private JTextField jf;

	public Clock() {
		super("스레드를 이용한 시계");
		setLayout(new FlowLayout());

		jf = new JTextField(20);
		add(new JLabel("현재시간:"));
		add(jf);

		setSize(350, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void run() {

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while (true) {
			try {
				Date d = new Date();
				jf.setText(sd.format(d));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		
		Clock c = new Clock();
		Thread t = new Thread(c);
		t.start();
//		t.run();		
	}

}
