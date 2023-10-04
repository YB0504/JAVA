<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="member" class="member.MemberDataBean"/>
<jsp:setProperty property="*" name="member"/>

<%
	/* 선택한 체크박스 모두 출력 */
	String[] hobby = request.getParameterValues("hobby");
	String h = "";
	for(String hy : hobby){
		h += hy + "-";
	}
	
	member.setHobby(h);
%>


ID : <%=member.getId() %><br>
비밀번호 : <%=member.getPasswd() %><br>
성명 : <%=member.getName() %><br>
주민번호 : <%=member.getJumin1()+ "-" +member.getJumin2() %><br>
E-Mail : <%=member.getMailid()+ "@" +member.getDomain() %><br>
전화번호 : <%=member.getTel1()+"-"+member.getTel2()+"-"+member.getTel3() %><br>
핸드폰 : <%=member.getPhone1()+"-"+member.getPhone2()+"-"+member.getPhone3() %><br>
우편번호 : <%=member.getPost() %><br>
주소 : <%=member.getAddress() %><br>
성별 : <%=member.getGender() %><br>
<!-- getParameterValues를 쓰지 않으면 첫번째 값 하나만 출력된다. -->
취미 : <%=member.getHobby() %><br>
자기소개 : <%=member.getIntro() %><br>