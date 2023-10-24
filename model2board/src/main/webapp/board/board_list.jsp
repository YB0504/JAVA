<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- core, 국제화 라이브러리 설정 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>

<a href="./BoardForm.do">글작성</a><br>
게시글 갯수 : ${listcount }개<br>
<%-- <%
	// EL표기를 사용하지 않으면 다운캐스팅과 언박싱을 해줘야한다.
	int count = ((Integer)request.getAttribute("listcount")).intValue();
%>
게시글 갯수 : <%=count %>개 <br> --%>

<table border="1" width="700" align="center">
	<caption>게시판 목록</caption>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>

	<!-- request로 공유한 boardlist -->
	<!-- 번호값은 파생변수를 set태그를 활용하여 만들어서 출력한다.-->
	<c:set var="num" value="${listcount - (page - 1) * 10 }"/>
	<c:forEach var="b" items="${boardlist }">
		<tr>
			<!-- EL태그는 후행연산이 불가능하다. -->
			<%-- <td>${num-- }</td> --%> 
			<td>${num }
				<c:set var="num" value="${num-1 }"/>
			</td>
			<td>
				<!-- 댓글 제목 앞의 여백 처리 -->
				<c:if test="${b.board_re_lev > 0 }">
					<c:forEach var="i" begin="0" end="${b.borad_re_lev }">
						&nbsp;
					</c:forEach>
				</c:if>
			<a href="./BoardDetailAction.do?board_num=${b.board_num }&page=${page}">
			${b.board_subject }
			</a>
			</td>
			<td>${b.board_name }</td>
			<td>
				<fmt:formatDate value="${b.board_date }" pattern="yyyy/MM/dd HH:mm:ss EEE요일"/>
			</td>
			<td>${b.board_readcount }</td>
		</tr>
	</c:forEach>
</table><br>

<!-- 페이지 링크 -->
<div align="center">
	<c:if test="${listcount > 0}">

	<!-- 1페이지로 이동 -->
	<a href="./BoardListAction.do?page=1" style="text-decoration: none"> << </a>

	<!-- 이전 블럭 -->
	<c:if test="${startPage > 10 }">
		<a href="./BoardListAction.do?page=${startPage - 10 }" style="text-decoration: none">[이전]</a>
	</c:if>


	<!-- 각 블럭에 10개의 페이지 출력 -->
	<c:forEach var="i" begin="${startPage}" end="${endPage}">
		<c:if test="${i == page }"><!-- 현재 페이지 -->
			[${i }]
		</c:if>
		<c:if test="${i != page }"><!-- 현재 페이지가 아닌 경우 -->
			<a href="./BoardListAction.do?page=${i}">[${i }]</a>
		</c:if>
	</c:forEach>

	<!-- 다음 블럭 -->
	<c:if test="${endPage < pageCount }">
		<a href="./BoardListAction.do?page=${startPage + 10 }" style="text-decoration: none">[다음]</a>
	</c:if>

	<!-- 마지막 페이지로 이동 -->
	<a href="./BoardListAction.do?page=${pageCount }" style="text-decoration: none"> >> </a>

	</c:if>
</div>
</body>
</html>