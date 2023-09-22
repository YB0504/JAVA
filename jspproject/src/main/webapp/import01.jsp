<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@page import="java.sql.Timestamp"%>


<!-- page태그 import속성 -->
<%

	// 날짜, 시간 관련 클래스
	// 1. Date클래스
	// java.util.Date d = new java.util.Date(); // 일회용
	Date d = new Date();
	
	// 현재 시간을 연,월,일,시,분,초,요일 단위로 출력
	SimpleDateFormat sd = 
		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE요일");
	
	// 2. Timestamp 클래스
	Timestamp ts = new Timestamp(System.currentTimeMillis());

%>

현재시간 1 : <%= d %><br>
현재시간 2 : <%= sd.format(d) %><br>
현재시간 3 : <%= ts %><br>
현재시간 4 : <%= sd.format(ts) %><br>
