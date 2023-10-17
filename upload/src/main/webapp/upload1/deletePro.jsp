<%@page import="upload.BoardDataBean"%>
<%@page import="upload.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="board" class="upload.BoardDataBean"/>
<jsp:setProperty property="*" name="board"/>

<!-- 게시글과 함께 업로드 되었던 파일이 있다면 같이 삭제해야 한다. -->
<%
	int num = Integer.parseInt(request.getParameter("num"));
	String nowpage = request.getParameter("page");
	
	// 업로드된 파일 유무에 따라 경로를 구해온다.
	String path = request.getRealPath("upload");
	System.out.println("path : " + path);
	
	BoardDBBean dao = BoardDBBean.getInstance();
	
	BoardDataBean db = dao.getContent(board.getNum());
	
	if(db.getPasswd().equals(board.getPasswd())){
		int result = dao.delete(db, path); // 게시글 삭제, 첨부파일 삭제
		if(result == 1){
%>
			<script>
				alert("글 삭제 성공");
				location.href = "list.jsp?page=<%=nowpage%>";
			</script>
<%		}
	}else{ %>
			<script>
				alert("비밀번호가 다릅니다.");
				history.go(-1);
			</script>
<%	} %>



