package p2023_08_04;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {

		// 입력을 받아들이는 변수 선언
		int inputValue = 0;

		// FileInputStream 객체 선언
		// 예외 처리 구문 바깥쪽에 선언해야 어디서든 사용가능하다.
		FileInputStream file = null;

		try {
			// "read.txt"와 InputStream 형성
			file = new FileInputStream("read.txt"); // 상대 경로
//			file = new FileInputStream("c:/read.txt");	// 절대 경로

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			// read() 메소드는 File에서 한 byte씩 데이터를 읽어옴.
			// 읽어온 데이터를 아스기 코드 int형으로 변환해서 리턴,파일의 끝을
			// 만나면 -1을 반환함.
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
//			file.close();	// 오류 발생
			if (file != null)
				try {
					file.close();
					System.out.println("\n" + "파일 닫기");
				} catch (Exception e) {
				}
			// stream을 형성한 file을 닫음
//		try {
//			file.close();
//		} catch (IOException io) {
//			System.out.println(io.toString());
//		}

		}

	}// main() end
}
