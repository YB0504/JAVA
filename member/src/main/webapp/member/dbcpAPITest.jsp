<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%

	// 테스트를 위해 작성한것이고 원래는 DAO클래스 안에서 메소드형태로 쓰인다.
 	Connection conn = null; 
	
	try {
  		Context init = new InitialContext();
  		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
  		conn = ds.getConnection();
  		
  		out.println("<h3>연결 성공</h3>");
	}catch(Exception e){
		out.println("<h3>연결 실패</h3>");
		e.printStackTrace();
 	}
%>
