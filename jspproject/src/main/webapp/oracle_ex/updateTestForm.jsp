<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*"%>

<%
  // 수정할 id값을 getParameter메소드로 받는다.
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
	
	// 주로 기본키로 설정된 컬럼이 where조건절에 들어간다.
	String sql= "select * from member1 where id=?";
	
	pstmt=con.prepareStatement(sql);
	pstmt.setString(1, uid);
	rs=pstmt.executeQuery();

	// 수정할 id를 검색한 결과값은 하나 이기 때문에 if문 사용
	if(rs.next()){
	  String id= rs.getString("id");
      String passwd= rs.getString("passwd");
      String name= rs.getString("name");
      Timestamp register=rs.getTimestamp("reg_date");

%>
<html>
<head><title>회원정보 수정</title></head>

<body>
  <h2>회원정보 수정</h2>

  <FORM METHOD="post" ACTION="updateTest.jsp">
  <!-- 내부적으로 값을 전달할 때 hidden객체를 사용한다. -->
  <!-- form객체 하위 객체이기 때문에 form태그 내부에 작성해야 한다. -->
  <input type=hidden name="id" value="<%=id %>">
    아이디 : <%=id %><p>
    패스워드 : <INPUT TYPE="password" NAME="passwd"><p>
    변경할 이름:<INPUT TYPE="text" NAME="name" value="<%=name%>"><p>
    <INPUT TYPE="submit" VALUE="보내기">
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




