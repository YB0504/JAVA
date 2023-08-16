package JavaTest2;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class leafYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요.");
		int year = sc.nextInt();
		
		GregorianCalendar gc = new GregorianCalendar();
		
		if(gc.isLeapYear(year)) {
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}

	}

}
