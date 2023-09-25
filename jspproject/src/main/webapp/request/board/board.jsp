<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	String writer = request.getParameter("writer");
	String passwd = request.getParameter("passwd");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	
	// 방법 2 : replace메소드 사용
	// \n을 <br>태그로 치환시켜 준다.
	// \n은 textarea에서 입력한 줄바꿈을 의미한다.
	String contents = request.getParameter("content").replace("\n", "<br>");
%>

작성자 : <%=writer%><br>
비밀번호 : <%=passwd%><br>
제목 : <%=subject%><br>

<!-- 줄을 바꿔서 작성한 textarea태그를 출력하는 방법 -->
<!-- 방법 1 : pre태그 안의 내용은 브라우저에 그대로 출력해준다. -->
내용01 : <pre><%=content%></pre><br>

<!-- 방법 2 : replace메소드 사용 -->
내용02 : <br><%=contents%><br>