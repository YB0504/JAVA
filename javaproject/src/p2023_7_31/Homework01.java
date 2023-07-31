package p2023_7_31;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

		System.out.println("연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		GregorianCalendar cal = new GregorianCalendar();

		int y = sc.nextInt();
		if (cal.isLeapYear(y)) {
			System.out.println(y + "년은 윤년입니다.");
		} else {
			System.out.println(y + "년은 평년입니다.");
		}

	}

}
