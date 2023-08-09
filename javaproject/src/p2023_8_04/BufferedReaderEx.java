package p2023_8_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {

//	키보드로 구구단 1개 단을 입력 받아서, 출력하는 프로그램을 작성
//	딘, BufferedReader 클래스 사용

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("원하는 구구단의 단을 입력하세요.");

		try {
			String s = br.readLine();
			int dan = Integer.parseInt(s); // Wrapper 클래스
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
