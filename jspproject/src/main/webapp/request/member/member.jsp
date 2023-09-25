<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	String jumin1 = request.getParameter("jumin1");
	String jumin2 = request.getParameter("jumin2");
	String mailid = request.getParameter("mailid");
	String domain = request.getParameter("domain");
	String tel1 = request.getParameter("tel1");
	String tel2 = request.getParameter("tel2");
	String tel3 = request.getParameter("tel3");
	String phone1 = request.getParameter("phone1");
	String phone2 = request.getParameter("phone2");
	String phone3 = request.getParameter("phone3");
	String post = request.getParameter("post");
	String address = request.getParameter("address");
	String gender = request.getParameter("gender");
	
	// checkbox
	String[] hobby = request.getParameterValues("hobby");
	String h = "";		// String h = "공부-게임-등산-...";
	// DB연동시에 split메소드를 사용하여 잘라서 사용한다.
	// 향상된 for문으로 -(하이픈)으로 결합하여 h변수에 누적
	for (String hy : hobby)
		h += hy + "-";
	
	// textarea태그안의 내용 처리
	// 즐바꿈 표현
	// 1. replace()사용
	// 2. pre태그 사용
	String introduce = request.getParameter("intro").replace("\n", "<br>");
	String intro = request.getParameter("intro");
%>

ID : <%=id %><br>
비밀번호 : <%=passwd %><br>
성명 : <%=name %><br>
주민번호 : <%=jumin1+ "-" +jumin2 %><br>
이메일 : <%=mailid+ " @ " +domain %><br>
전화번호 : <%=tel1+ "-" +tel2+ "-" +tel3 %><br>
핸드폰 : <%=phone1+ "-" +phone2+ "-" +phone3 %><br>
우편번호 : <%=post %><br>
주소 : <%=address %><br>
성별 : <%=gender %><br>
취미 : <%=h %><br>
자기소개 1 : <pre><%=intro %></pre><br>
자기소개 2 : <br><%=introduce %><br>











