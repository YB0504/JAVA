<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
</head>
<body>

<table border="1" width="600" align="center">
<caption>상세 페이지</caption>
	<tr>
		<td>제목</td>
		<td>${board.board_subject }</td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
			<pre>${board.board_content }</pre>
			${content }
		</td>
	</tr>
	<tr>
		<td>첨부파일</td>
		<td>
			<!-- 첨부 파일이 있을 때 출력 -->
			<!-- 조건식에 empty연산자로도 사용 가능 -->
			<c:if test="${board.board_file != null }">
				<a href="./board/file_down.jsp?file_name=${board.board_file }">
				${board.board_file }
				</a>
			</c:if>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<!-- 부모글의 댓글관련 컬럼값은 Service클래스에서 처리한다. -->
			<input type="button" value="댓글"
			onclick="location.href='./BoardReplyForm.do?board_num=${board.board_num}&page=${page}'">
			<input type="button" value="수정"
			onclick="location.href='./BoardModifyForm.do?board_num=${board.board_num}&page=${page }'">
			<input type="button" value="삭제"
			onclick="location.href='./BoardDeleteForm.do?board_num=${board.board_num}&page=${page }'">
			<input type="button" value="목록" 
			onclick="location.href='./BoardListAction.do?page=${page}'">
		</td>	
	</tr>
</table>

</body>
</html>