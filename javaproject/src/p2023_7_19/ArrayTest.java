package p2023_7_19;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max, min;
		int[] s = new int[5]; 
		// 어떤 값을 배정할 지 알지 못하기에 첫번째 형식

		System.out.print("정수 5개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt(); // 입력한 값을 s배열에 저장
		}
		max = s[0];
		min = s[0];
		// s[0] 번방의 값을 max와 min값으로 초기화
		// max,min 값을 저장할 때는 배열에 들어갈 정수를 먼저 설정 후 선언해야 한다.
		for (int i = 1; i < s.length; i++) {
			if (max < s[i]) max = s[i];
			if (min > s[i]) min = s[i];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
