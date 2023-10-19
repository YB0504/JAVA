<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Model1EX.DTOEX"%>
<%@page import="java.util.List"%>
<%@page import="Model1EX.DAOEX"%>
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
	// 한 화면 추출 데이터 개수
	int page_size = 10;
	
	// 페이지 번호를 클릭할 때 해당 페이지 번호값을 전달
	String pageNum = request.getParameter("num");
	
	// 목록이 처음 실행될 때 보이는 페이지
	if(pageNum == null){
		pageNum = "1";
	}
	
	// 페이지 값으로 산술 연산할 수 있도록
	int currentPage = Integer.parseInt(pageNum);
	
	// 총 데이터 갯수
	int count = 0;
	
	DAOEX dao = DAOEX.getinstance();
	
	count = dao.getCount();
	
	// 파생 변수
	// 기본 변수를 가지고 산술연산
	int startRow = (currentPage - 1) * page_size + 1;
	int endRow = currentPage * page_size;
	
	List<DTOEX> list = null ;
	// 데이터 개수가 0보다 크면 목록에 들어갈 데이터를 불러온다.
	if(count > 0){
		// 출력할 데이터를 매개변수에 startRow, endRow값을 전달하여 10개씩 잘라서 출력
		list = dao.getList(startRow, endRow);
	}
	
	if(count == 0){
%>
		게시글 없음
<%	}else{ %>
		
		<a href="writeForm.jsp">글 작성</a><br>
		게시글 수 : <%=count %>
		<table border="1" width=800 align="center">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			
<%
	// 각 페이지의 시작 게시글 번호
	int number = count - (currentPage - 1) * page_size;

	SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	// for문으로 list에 저장된 데이터를 하나씩 get메소드로 가져와서
	// DTO객체에 리턴
	for(int i = 0; i < list.size(); i++){
		DTOEX board = list.get(i);

%>
		<tr>
			<td><%=number--%></td> <!-- 후행 연산 시키면 연속적인 번호가 출력된다. -->
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
			
			<!-- 선택한 게시글의 번호값과 게시글이 위치한 페이지 번호 값을 가지고 가야한다. -->
			<!-- 값을 가지고 가야지만 다시 게시글이 존재하는 페이지로 돌아올 수 있다. -->
			<a href="content.jsp?num=<%=board.getNum()%>&page=<%=currentPage %>">
			<%=board.getSubject() %></a>
			</td>		
			<td><%=board.getWriter() %></td>		
			<td><%=sd.format(board.getReg_date())%></td>		
			<td><%=board.getReadcount() %></td>		
		</tr>
			
<%	}	%>
	
	</table>
	
<% 	} %>

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









