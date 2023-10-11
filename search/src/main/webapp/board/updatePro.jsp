<%@page import="board.BoardDataBean"%>
<%@page import="board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="board" class="board.BoardDataBean"/>
<jsp:setProperty property="*" name="board"/>

<%
	// page값은 DTO클래스 내부에 존재하지 않기 때문에 따로 값을 받아온다.
	String nowpage = request.getParameter("page");

	BoardDBBean dao = BoardDBBean.getInstance();
	
	// DB에 저장된 비밀번호 구해오기
	BoardDataBean old = dao.getContent(board.getNum());
	
	// 비밀번호 비교
	if(old.getPasswd().equals(board.getPasswd())){
		int result = dao.update(board);	// update SQL문 실행
		
		if(result == 1){
%>
		<script>
			alert("글 수정 성공");
			<%-- location.href = "list.jsp?page=<%=nowpage%>"; --%>
			// 수정한 게시글의 상세페이지로 이동할 때는 번호값과 페이지값을 모두 가지고 가야한다.
			location.href = "content.jsp?num=<%=board.getNum()%>&page=<%=nowpage%>";
		</script>
<%		}
	}else{ %>

		<script>
			alert("비밀번호가 다릅니다.");
			history.go(-1);
		</script>
	
<%	} %>















