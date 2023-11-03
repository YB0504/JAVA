package Solve;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		// 주어진 분이 45분보다 작을시
		if (m < 45) {
			h--;
			m = 60 - (45 - m);
			
			// 주어진 시간에서 -1일 때 시간이 0보다 작다면
			if (h < 0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		}
		System.out.println(h + " " + (m - 45));
	}

}