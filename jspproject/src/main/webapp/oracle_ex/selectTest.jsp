<%@page import="java.text.SimpleDateFormat"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*"%>

<html>
<head><title>회원목록</title></head>
<body>
  <h2>회원목록</h2>
  
  <a href="insertTestForm.jsp">회원가입</a>
  <TABLE width="800" border="1">
  <TR>
  	<TD width="100">아이디</TD>
  	<TD width="100">패스워드</TD>
  	<TD width="100">이름</TD>
  	<TD width="250">가입일자</TD>
  	<TD width="100">수정</TD>
  	<TD width="100">삭제</TD>
  </TR>

<%
  Connection con=null;
  PreparedStatement pstmt=null;
  ResultSet rs=null;	// 검색된 데이터를 관리하는 객체
  ResultSet rs01=null;
  int cnt=0;	// 총 회원수가 저장될 변수
  
  try{
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	// JDBC 방식 공통 코드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection(url,user,password);

	// 총 회원수를 구하는 SQL문
	pstmt=con.prepareStatement("select count(*) from member1");
	
	// Select SQL문 실행
	// ResultSet의 변수로 값을 받는다.
	rs01=pstmt.executeQuery();
	
	// 값을 가져오는 메소드
	// SQL문을 만족하는 데이터를 가져오면 true값을 리턴
	if(rs01.next()){
		cnt = rs01.getInt(1);
//		cnt = rs01.getInt("count(*)");
	}	
	
	// 가입된 회원의 목록을 검색하는 SQL문
	String sql= "select * from member1";
	
	pstmt=con.prepareStatement(sql);
	
	// Select SQL문 실행
	rs=pstmt.executeQuery();
	
	SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss EEE");

	// 값을 가져오는 메소드
	while(rs.next()){
	  String id= rs.getString("id");
      String passwd= rs.getString("passwd");
      String name= rs.getString("name");
      Timestamp register=rs.getTimestamp("reg_date");

%>
     <TR>
  	   <TD width="100"><%=id%></TD>
  	   <TD width="100"><%=passwd%></TD>
  	   <TD width="100"><%=name%></TD>
  	   <TD width="250"><%=sd.format(register)%></TD>
  	   <TD width="100">
  	   		<!-- 수정할 회원의 id값을 get방식으로 넘겨주면서 링크로 이동한다. -->
  	   		<a href="updateTestForm.jsp?id=<%=id%>">수정</a>  	   
  	   </TD>
  	   <TD width="100">
  	   		<a href="deleteTestForm.jsp?id=<%=id %>">삭제</a>
  	   </TD>
    </TR>
<%  } 
  }catch(Exception e){ 
		e.printStackTrace();
  }finally{
	    if(rs != null) try{rs.close();}catch(SQLException sqle){}
		if(pstmt != null) try{pstmt.close();}catch(SQLException sqle){}
		if(con != null) try{con.close();}catch(SQLException sqle){}
  }
%>
</TABLE>

총 회원수:<%=cnt %>명

</body>
</html>