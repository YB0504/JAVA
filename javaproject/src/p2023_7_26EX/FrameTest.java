package p2023_7_26EX;

import java.awt.*;
import java.awt.event.*;

public class FrameTest {

	private Frame f;

	public FrameTest() {
		
		// Frame클래스의 부모 클래스로부터 상속받아서 사용
		f = new Frame("Frame Test");
		f.setSize(400, 300);
		f.setLocation(100, 100);
		f.setBackground(Color.green);
		f.setVisible(true);
		f.setResizable(false);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}// 생성자 end

	public static void main(String[] args) {
		FrameTest ft = new FrameTest();
	}
}