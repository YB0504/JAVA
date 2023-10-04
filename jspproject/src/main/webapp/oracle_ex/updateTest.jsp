<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*"%>

<%
  request.setCharacterEncoding("utf-8");

  String id= request.getParameter("id");
  String passwd= request.getParameter("passwd");
  String name= request.getParameter("name");

  Connection con=null;
  PreparedStatement pstmt=null;
  ResultSet rs=null;

  try{
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
		 
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection(url,user,password);
	
	// 사용자가 전달한 hidden으로 설정된 id값이 ?에 전달된다.
	String sql= "select * from member1 where id=?";
	
	pstmt=con.prepareStatement(sql);
    pstmt.setString(1,id);
	rs=pstmt.executeQuery();
    
	if(rs.next()){ // id가 있으면
		String rId=rs.getString("id");
		String rPasswd=rs.getString("passwd");
		
		// 입력한 비밀번호가 저장된 비밀번호 값이 일치된다면
      if(id.equals(rId) && passwd.equals(rPasswd)){
	    sql= "update member1 set name = ?, reg_date=sysdate  where id = ?";
	    pstmt=con.prepareStatement(sql);
	    pstmt.setString(1,name);
	    pstmt.setString(2,id);
	    
		// Update SQL문 실행
	    pstmt.executeUpdate();
	   
%>
		<script>
			alert("회원 정보 수정 성공");
			location.href="selectTest.jsp";
		</script>	
<%
       }else{	// 비밀번호 불일치 시
 %>
	 	<script>
	 		alert("비밀번호가 틀렸습니다");
	 		history.go(-1);
		</script>
	 	
<% 	 
		}
	 }else{
%>
		<script>
			alert("아이디가 틀렸습니다.");
			history.go(-1);
		</script>
<%
	 }

	}catch(Exception e){ 
		e.printStackTrace();
	}finally{
		if(rs != null) try{rs.close();}catch(SQLException sqle){}
		if(pstmt != null) try{pstmt.close();}catch(SQLException sqle){}
		if(con != null) try{con.close();}catch(SQLException sqle){}
	}
%>