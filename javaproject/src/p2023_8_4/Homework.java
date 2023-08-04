package p2023_8_4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Homework {

	public static void main(String[] args) {

		FileWriter fos = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("문장을 입력하시오");
		try {

			fos = new FileWriter("result.txt", true);

			fos.write(br.readLine());
			fos.close();
			System.out.println("끝");
		} catch (Exception e) {
			
		}

	}

}
