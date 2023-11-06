package Solve;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int m2 = sc.nextInt();

		// 조리시작 시간을 분으로 환산
		int min = 60 * h + m;

		// 조리시작 시간에 조리시간을 +
		min += m2;

		int hour = (min / 60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);

	}
}