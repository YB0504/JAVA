<%@page import="java.text.SimpleDateFormat"%>
<%@page import="reboard.BoardDataBean"%>
<%@page import="java.util.List"%>
<%@page import="reboard.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	// 기본 변수 설정
	// 1. 한 화면(페이지)에 출력할 데이터 갯수
	int page_size = 10;

	String pageNum = request.getParameter("page");
	if(pageNum == null){
		pageNum = "1";
	}
	
	// 2. 현재 페이지 번호
	// 산술 연산을 위한 형변환
	int currentPage = Integer.parseInt(pageNum);
	
	// 3. 총 데이터 갯수
	int count = 0;
	
	BoardDBBean dao = BoardDBBean.getInstance();
	count = dao.getCount();
	System.out.println("count : " + count);
	
	// 파생 변수 설정
	// 1. startRow : 각 페이지에 추출할 데이터의 시작 번호
	// 2. endRow : 각 페이지에 추출할 데이터의 끝 번호
	int startRow = (currentPage - 1) * page_size + 1;
	int endRow = currentPage * page_size;
	
	List<BoardDataBean> list = null;
	if(count > 0){
		list = dao.getList(startRow, endRow);
	}
	System.out.println("list : " + list);
	
	if(count == 0){ %>
		작성된 글이 없습니다.
<% 	}else{	%>

		<a href="writeForm">글작성</a><br>
		게시글 수 : <%=count %>개
		
		<table border="1" width=700 align="center">
			<caption>게시판 목록</caption>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
				<th>IP</th>
			</tr>
<%
	
	// 3. 각 페이지에 출력될 시작 번호
	int number = count - (currentPage - 1) * page_size;

	SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss EEE요일");

	for(int i = 0; i < list.size(); i++){
		BoardDataBean board = list.get(i);
%>		

			<tr>
				<td><%=number-- %></td>
				<td>
<%

		// 댓글 제목 앞 여백 추가
		if(board.getRe_level() > 0){	// 댓글
			for(int j = 1; j <= board.getRe_level(); j++){
%>				<!-- 여백을 추가하는 코드 -->
				&nbsp;&nbsp;
<% 			
			} // for end
		} // if end
%>

				<a href="content.jsp?num=<%=board.getNum()%>&page=<%=currentPage%>">
					<%=board.getSubject() %>
				</a>
				</td>
				<td><%=board.getWriter() %></td>
				<td><%=sd.format(board.getReg_date())%></td>
				<td><%=board.getReadcount() %></td>
				<td><%=board.getIp() %></td>
			</tr>
		
<%	}	// for end %>

		</table>
		
<%	} // if ~ else end	%>

<!-- 페이지 링크 -->
<div align="center">
<%
if(count > 0){
	
	// 4. 총 페이지 수
	int pageCount = count / page_size + ((count % page_size == 0) ? 0 : 1);
	
	// 페이지 블럭 단위 이동
	// 5. startPage : 각 블럭의 시작 페이지
	// 6. endPage : 각 블럭의 끝 페이지
	int startPage = ((currentPage - 1) / 10) * 10 + 1;
	int block = 10;	// 1개 블럭 = 10개 페이지
	int endPage = startPage + block - 1;
	
	// 가장 마지막 블럭
	// 이 부분을 작성 해야만 데이터가 없는 페이지가 출력되지 않는다.
	if(endPage > pageCount){
		endPage = pageCount;
	}
%>
	<!-- 1page로 이동 -->
	<a href="list.jsp?page=1" style="text-decoration: none"> < </a>
	
<%
	// 이전 블럭 이동
	if(startPage > 10){
%>
		<a href="list.jsp?page=<%=startPage - 10%>" style="text-decoration: none">[이전]</a>	
		
		
<% 	} // if end	
	// 각 블럭당 10개의 페이지
	for(int i = startPage; i <= endPage; i++){
		if(i == currentPage){	// 현재 페이지
%>

			[<%=i %>]

<% 		}else{	%>

			<a href="list.jsp?page=<%=i%>" style="text-decoration: none">[<%=i %>]</a>

<% 		} // if ~ else end
	} // for end
	
	// 다음 블럭으로 이동
	if(endPage < pageCount){
%>	

		<a href="list.jsp?page=<%=startPage + 10%>" style="text-decoration: none">[다음]</a>	

<% 	} // if end	%>
	
	<a href="list.jsp?page=<%=pageCount%>" style="text-decoration: none"> > </a>
	
	
<%} // if end	%>

</div>



</body>
</html>









