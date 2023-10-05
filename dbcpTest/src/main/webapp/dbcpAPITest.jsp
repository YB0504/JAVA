<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>
<%
Connection conn = null;

try {
	// 커넥션풀에 대한 초기화 역할
	Context init = new InitialContext();
	
	// java:comp/env/ : 환경변수(고정) jdbc/OracleDB : 찾을 커넥션풀 name값
	DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
	conn = ds.getConnection();

	out.println("<h3>연결되었습니다.</h3>");
} catch (Exception e) {
	out.println("<h3>연결에 실패하였습니다.</h3>");
	e.printStackTrace();
}
%>
