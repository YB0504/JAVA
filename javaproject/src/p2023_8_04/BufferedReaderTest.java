package p2023_8_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest {
	public static void main(String[] args) {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		/* 위의 객체 생성 라인을 한줄로 바꿔 작성한 것
		 * BufferedReader br = 
		 * new BufferedReader(new InputStreamReader(System.in));
		 */
		System.out.print("Input Data : ");

		try { // 입력한 한줄을 모두읽음.
			String inputString = br.readLine();
			System.out.println();
			System.out.println("Output String = " + inputString);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}// main() end
}
