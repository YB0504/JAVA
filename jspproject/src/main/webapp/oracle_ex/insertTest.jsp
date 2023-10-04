<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*"%>

<%
  request.setCharacterEncoding("utf-8");

  String id = request.getParameter("id");
  String passwd = request.getParameter("passwd");
  String name = request.getParameter("name");
  Timestamp register = new Timestamp(System.currentTimeMillis());

  Connection con = null;
  PreparedStatement pstmt = null;
  int result = 0;
  
  try{
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	
	// JDBC 방식
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection(url,user,password);
	
	// Insert SQL문
	String sql= "insert into member1 values (?,?,?,sysdate)";
	
	pstmt=con.prepareStatement(sql);
	pstmt.setString(1, id);
	pstmt.setString(2, passwd);
	pstmt.setString(3, name);
	// pstmt.setTimestamp(4,register);
	
	// Insert SQL문 실행 코드
	// 실행된 SQL문 갯수를 int형으로 돌려준다.
	result = pstmt.executeUpdate();

} catch (Exception e) {
	e.printStackTrace();
} finally {
	if (pstmt != null) 
		try { 
			pstmt.close();
			} 
	catch (SQLException sqle) {
		
	}
	if (con != null) 
		try {
			con.close();} 
	catch (SQLException sqle) {
		
	}
}
%>

<html>
<head><title>회원가입</title></head>
<body>
  
<%
	// Insert 성공
	if(result == 1){
%>    
  		<script>
  			alert("회원가입 성공");
  			location.href="selectTest.jsp";
  		</script>
<% 	}else{%>
		<!-- Insert 실패 -->
   		<script>
			alert("회원가입 실패");
			history.go(-1);
   		</script>
<% 	} %>   
</body>
</html>