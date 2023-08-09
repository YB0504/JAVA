package p2023_07_28;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		System.out.println("윤년인 연도를 찾으세요.");
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + "년도는 윤년입니다");
		}else if(year % 400 == 0) {
			System.out.println(year + "년도는 윤년입니다.");
		}else {
			System.out.println(year + "년도는 평년입니다.");
		}
	}

}
