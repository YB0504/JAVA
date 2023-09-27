<%@ page contentType = "text/html; charset=utf-8" %>

<!-- 회사소개 클릭시 넘어오는 JSP파일 -->
<jsp:forward page="templateTest.jsp" >
  <jsp:param name="CONTENTPAGE" value="comp.jsp"/>
</jsp:forward>