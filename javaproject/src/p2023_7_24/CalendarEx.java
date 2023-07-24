package p2023_7_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {

//	3. Calendar 클래스

//		Calendar c1 = new Calendar();	// 오류 발생

		// 업 캐스팅
		Calendar c2 = new GregorianCalendar(); // 자료형 변환

		Calendar c = Calendar.getInstance();
		System.out.println(c); // 1690168210434
		System.out.println(Calendar.YEAR); // 1

		int y = c.get(Calendar.YEAR); // 2023
		int m = c.get(Calendar.MONTH) + 1; // 0 ~ 11 까지의 범위만 구하기때문에 + 1을 해줘야한다.
		int d = c.get(Calendar.DATE);

		System.out.println(y + "-" + m + "-" + d);

		int h1 = c.get(Calendar.HOUR); 			// 12 시간제
		int h2 = c.get(Calendar.HOUR_OF_DAY); // 24 시간제

		int ap = c.get(Calendar.AM_PM); // 오전 : 0 , 오후 : 1이 저장됨
		if (ap == 0) {
			System.out.print("오전 ");
		} else {
			System.out.print("오후 ");
		}

		int mm = c.get(Calendar.MINUTE); // 분
		int ss = c.get(Calendar.SECOND); // 초

		System.out.println(h1 + ":" + mm + ":" + ss); // 12시간제
		System.out.println(h2 + ":" + mm + ":" + ss); // 24시간제

	}

}
