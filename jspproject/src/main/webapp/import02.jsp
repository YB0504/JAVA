<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%

	// 3. Calendar 클래스
	// Calendar 클래스는 new 연산자로 객체를 생성할 수 없다.
	Calendar c = Calendar.getInstance();
	
	int y = c.get(Calendar.YEAR);			// 연도
	int m = c.get(Calendar.MONTH) + 1;		// 월(0 ~ 11)
	int d = c.get(Calendar.DATE);			// 일
	
	int h1 = c.get(Calendar.HOUR);			// 12시간
	int h2 = c.get(Calendar.HOUR_OF_DAY);	// 24시간
	
	String h = "";
	if(c.get(Calendar.AM_PM) == 0){			// AM_PM : 0 (오전)
		h = "오전";
	}else{									// AM_PM : 1 (오후)
		h = "오후";
	}
	
	int mm = c.get(Calendar.MINUTE);		// 분
	int s = c.get(Calendar.SECOND);			// 초
	int week = c.get(Calendar.DAY_OF_WEEK);	// 요일(1 ~ 7)
	/* System.out.println("week : " +week);	// week : 6 */
	
	// 일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)
	String[] weekend = {"일", "월", "화", "수", "목", "금", "토"};
%>

<!-- 12시간제 -->
<%=y %>-<%=m %>-<%=d %> <%=h %> <%=h1 %>:<%=mm %>:<%=s %>
<%=weekend[week-1] %>요일
<br>

<!-- 24시간제 -->
<%=y %>-<%=m %>-<%=d %> <%=h2 %>:<%=mm %>:<%=s %> <%=weekend[week-1] %>요일





