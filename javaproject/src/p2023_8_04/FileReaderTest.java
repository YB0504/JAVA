package p2023_8_04;

import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader 객체 선언
		FileReader file = null;
		int inputValue = 0;

		try {
			// "data.txt" File과 stream 형성
			file = new FileReader("data.txt"); // 상대 경로
//			file = new FileReader("c:/data.txt");	// 절대 경로

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			while ((inputValue = file.read()) != -1) {
				// 아스기 코드 값으로 값을 받기 때문에 형변환해서 출력한다.
				System.out.print((char) inputValue);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (file != null)
				try {
					file.close();
					System.out.println("파일 닫기");
				} catch (Exception e) {
				}
		}
	}// main() end
}
