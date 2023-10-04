<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*"%>

<%
  String uid=request.getParameter("id");

  Connection con=null;
  PreparedStatement pstmt=null;
  ResultSet rs=null; 
  
  try{
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
		 
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection(url,user,password);
	
	String sql= "select * from member1 where id=?";
	
	pstmt=con.prepareStatement(sql);
	pstmt.setString(1, uid);
	
	// select SQL문 실행
	rs=pstmt.executeQuery();

	// SQL문을 만족하는 데이터를 가져오면 true가 리턴된다.
	if(rs.next()){
	  String id= rs.getString("id");
      String passwd= rs.getString("passwd");
      String name= rs.getString("name");
      Timestamp register=rs.getTimestamp("reg_date");

%>
<html>
<head><title>회원정보 삭제</title></head>

<body>
  <h2>회원정보 삭제</h2>

  <FORM METHOD="post" ACTION="deleteTest.jsp">
  	<!-- 비밀번호가 일치하는지, 일치한다면 해당 id값에 delete SQL문을 실행하기 위해 값을 전달 -->
  	<input type=hidden name="id" value="<%=id %>">
  		<%--   아이디 : <%=id %><p> --%>
    	패스워드 : <INPUT TYPE="password" NAME="passwd"><p>
  		<%--  이름:<%=name%><p> --%>
  	<INPUT TYPE="submit" VALUE="삭제">
  </FORM>

</body>
</html>

<%  } // if end
  }catch(Exception e){ 
		e.printStackTrace();
  }finally{
	    if(rs != null) try{rs.close();}catch(SQLException sqle){}
		if(pstmt != null) try{pstmt.close();}catch(SQLException sqle){}
		if(con != null) try{con.close();}catch(SQLException sqle){}
  }
%>




