package p2023_08_04;

// 입출력에 관한 패키지 import
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {

		// InputStream 객체 생성
		// System.in은 표준입력 장치인 키보드로 부터 입력 받는것을 의미함.
		InputStream is = System.in;
		// read 메소드가 int형으로 값을 돌려주기 때문에 int형으로 값을 초기화
		int inputValue = 0;

		System.out.print("Input Data : ");

		try {
			// 키보드로부터 값을 입력 받음
			// read() 메소드는 1바이트를 읽어들여서
			// 아스기 코드(0~127)값으로 casting함.
			inputValue = is.read();
		} catch (IOException io) {
			// System.out.print(io.toString());
			System.out.print(io.getMessage());
		} // 한글 처리를 못함.

		System.out.println("InputData is " + inputValue);
		System.out.println("InputData is " + (char) inputValue);
	}
}
