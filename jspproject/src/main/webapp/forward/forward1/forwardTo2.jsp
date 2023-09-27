<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <!-- 최종으로 출력되는 페이지 -->
    ID : <%=request.getParameter("id")%> <br>
    password : <%=request.getParameter("password")%> <br>
    
    request 객체로 공유한 값 출력 <br>
    <%=request.getAttribute("name")%>