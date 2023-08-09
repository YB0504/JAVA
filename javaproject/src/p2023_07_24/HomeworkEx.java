package p2023_07_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HomeworkEx {

	public static void main(String[] args) {

//	Calendar클래스를 이용해서 오늘 날짜, 시간, 요일을 출력하는 프로그램을 작성

		Calendar c = new GregorianCalendar();

		int y = c.get(Calendar.YEAR);
//		0 ~ 11 까지의 범위만 구하기 때문에 + 1을 해줘야 한다.
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DATE);

		// 값을 아는 배열 생성
		String[] w = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		// 요일값은 1에서부터 시작하고 배열은 0에서 시작하므로 -1 해준다.
		int w1 = c.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.println(y + "-" + m + "-" + d + " " + w[w1]);

	}

}
