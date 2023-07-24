package p2023_7_24;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
//	날짜 시간 관련 클래스 (Date, Timestamp)
		
//	1. Date
//	주로 영미권 포맷으로 출력되기 때문에
//	SimpleDateFormat 클래스의 도움을 받아서 원하는 포맷으로 출력해서 사용
		// 년, 원, 일, 시, 분, 초, 요일로 날짜를 출력
		SimpleDateFormat sd1 = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a HH:mm:ss");
		SimpleDateFormat sd2 = 
				new SimpleDateFormat("yyyy년 MM월 dd일 EEE요일 hh:mm:ss");
		// hh : 12시간제 시간
		// HH : 24시간제 시간
		// a  : 오전 오후 표시
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(sd1.format(d));
		System.out.println(sd2.format(d));
		
//	2. Timestamp
		// 년, 월, 일, 시, 분, 초, 로 날짜를 출력
		SimpleDateFormat sf = 
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		// long형으로 되어 있는 생성자 사용
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(sf.format(ts));
		
		
		
		
	}

}
