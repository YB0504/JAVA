<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="board.BoardDBBean"%>
<%@page import="board.BoardDataBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
<%
	// 검색 항목과 검색어를 받는 부분
	String sel = request.getParameter("sel");
	String find = request.getParameter("find");
	System.out.println("sel : " + sel);
	System.out.println("find : " + find);


	// 기본 변수 설정
	// 1. 한 화면(페이지)에 출력할 데이터 갯수
	int page_size = 10;
	
	// 페이지 번호를 클릭했을 때 해당 페이지 번호값을 전달하는 변수
	// 값이 전달되면 list.jsp를 처음부터 다시 실행한다.
	String pageNum = request.getParameter("page");
	
	// 1. list.jsp를 바로 실행할 경우 전달된 page값이 null
	// 	  값이 오면서 500오류가 뜨기때문에 최근글 페이지를 보여주도록 설정
	// 2. insert를 하면서 list.jsp로 이동하는데 이 때 page값을 
	//	  가지고 넘어가지 않기 때문에 최근글 페이지를 보여주도록 설정
	if(pageNum == null){	
		pageNum = "1";	// 최근 글이 보이는 페이지(내림차순) : 1page	
	}
	
	// 2. 현재 페이지 번호
	// pageNum변수의 산술연산을 위한 int형으로 형 변환
	int currentPage = Integer.parseInt(pageNum);
	
	// 3. 총 데이터 갯수
	// DB 연동을 해서 select SQL문에서 count그룹함수로 갯수를 센다.
	int count = 0;
	
	BoardDBBean dao = BoardDBBean.getInstance();
	
	// 검색창에서 검색된 내용과 관련된 데이터 개수
	// sel, find를 매개변수로 getCount메소드에 전달한다.
	count = dao.getCount(sel, find);
	System.out.println("count : " + count);
	
	// 기본 변수 파생 변수(기본 변수의 산술 연산)
	// 1. startRow : 각 페이지에 추출할 데이터의 시작 번호
	// 2. endRow : 각 페이지에 추출할 데이터의 끝 번호
	// page = 1 : startRow = 1, endRow = 10
	// page = 2 : startRow = 11, endRow = 20
	// page = 3 : startRow = 21, endRow = 30
	int startRow = (currentPage -1) * page_size + 1;
	int endRow = currentPage * page_size;
	
	List<BoardDataBean> list = null;
	if(count > 0){
		// 두 개의 서브쿼리가 필요하다.
		// rownum으로 잘라서 목록을 뽑아온다.
		// sel,find값을 전달해서 검색한 데이터의 목록을 뽑아온다.
		list = dao.getList(startRow, endRow, sel, find);
	}
	System.out.println("List : " + list); // BoardDataBean의 주소값이 출력된다.
	
	if(count == 0){
%>
		작성된 글이 없습니다.
<%	}else{ %>
		<a href="writeForm.jsp">글 작성</a><br>
		게시글 개수 : <%=count %>
		<table border="1" width=700 align=center>
			<caption>게시판 목록</caption>
			<tr>
				<th>번호</th><!-- 화면에 출력될 게시글 번호는 파생변수로 만들어서 처리해야 한다. -->
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
				<th>IP</th>
			</tr>
<%
	// 기본 변수 파생 변수
	// 3. 화면에 출력될 게시글 번호
	// 중간 번호의 게시글이 지워져도 연속적인 번호가 출력된다.
	// number : 브라우저의 각 페이지에 출력될 시작 번호
//	page = 1 number = 339 - (1 - 1) * 10 = 339
//	page = 2 number = 339 - (2 - 1) * 10 = 329
	int number = count - (currentPage - 1) * page_size;

	SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss EEE요일");

	for(int i = 0; i < list.size(); i++){
		// get메소드로 list 0번방의 DTO객체를 하나 씩 가져온다
		// 제네릭을 사용하고 있기 때문에 다운캐스팅을 생략
		BoardDataBean board = list.get(i);
%>
		<tr>
			<td><%=number--%></td> <!-- 후행 연산 시키면 연속적인 번호가 출력된다. -->
			<td>
			<!-- 선택한 게시글의 번호값과 게시글이 위치한 페이지 번호 값을 가지고 가야한다. -->
			<!-- 두 개이상의 값을 가지고 갈때는 사이에 띄워쓰기가 있으면 오류가 발생한다. -->
			<a href="content.jsp?num=<%=board.getNum()%>&page=<%=currentPage %>">
			<%=board.getSubject() %></a>
			</td>		
			<td><%=board.getWriter() %></td>		
			<td><%=sd.format(board.getReg_date())%></td>		
			<td><%=board.getReadcount() %></td>		
			<td><%=board.getIp() %></td>		
		</tr>		
		
	<%	} // for end%> 
			
		</table>
		
		
<%	}	// else end%>

<!-- 페이지 링크 -->
<div align="center">
<%

	if(count > 0){
		
		// 기본 변수 파생 변수
		// 4. 총 페이지 수
		int pageCount = count / page_size + ((count % page_size == 0) ? 0 : 1);
		
		// 페이지 블럭 단위 이동
		// 5. startPage = 각 블럭의 시작 페이지 번호 : 1, 11, 21, ...
		// 6. endPage = 각 블럭의 끝 페이지 번호 : 10, 20, 30, ...
		int startPage = ((currentPage - 1) / 10) * 10 + 1;
		int block = 10;	// 1개 블럭의 크기 : 10개
		int endPage = startPage + block - 1;
		
		// 가장 마지막 블럭에 endPage값을 pageCount로 수정
		if(endPage > pageCount){
			endPage = pageCount;
		}
	
	/* if(count > 0 && sel == null && find ==null){	// 전체 목록 페이지 이동 */
	if(sel == null && find ==null){	// 전체 목록 페이지 이동
%>
		<!-- 1page로 이동 -->	
		<a href="list.jsp?page=1" style="text-decoration:none"> < </a>

<%
	/* 이전 블럭으로 이동 */
	/* 검색한 목록을 추출할 때는 페이지 번호 이외에 sel, find값을 전달받아서 추가 */
	if(startPage > 10){
%>		
		<a href="list.jsp?page=<%=startPage - 10%>" style="text-decoration:none">[이전]</a>
<%	}	

		// 각 블럭당 10개 페이지 출력
		for(int i = startPage; i <= endPage; i++){
			if(i == currentPage){	// 현재 페이지
%>
				[<%=i%>]
<%			}else{ %>
			<!-- 보고 있지 않은 페이지에 링크 설정 -->
			<!-- get방식으로 page값을 가져간다. -->
			<a href="list.jsp?page=<%=i%>" style="text-decoration:none">[<%=i%>]</a>
				
<%			}%>
			
<% 		} 
		// 다음 블럭으로 이동
		if(endPage < pageCount){
%>
			<a href="list.jsp?page=<%=startPage + 10%>" style="text-decoration:none">[다음]</a>
<%		} %>
		<!-- 마지막 페이지로 이동 -->
		<!-- 총 페이지 수를 page값에 전달 -->
		<a href="list.jsp?page=<%=pageCount %>" style="text-decoration:none"> > </a>
<%		
	}else if(sel != null && find != null){		// 검색한 경우의 페이지 이동
%>
		<!-- 1page로 이동 -->	
		<a href="list.jsp?page=1&sel=<%=sel %>&find=<%=find %>" style="text-decoration:none"> < </a>

<%
	/* 이전 블럭으로 이동 */
	/* 검색한 목록을 추출할 때는 페이지 번호 이외에 sel, find값을 전달받아서 추가 */
	if(startPage > 10){
%>		
		<a href="list.jsp?page=<%=startPage - 10%>&sel=<%=sel %>&find=<%=find %>" style="text-decoration:none">[이전]</a>
<%	}	

		// 각 블럭당 10개 페이지 출력
		for(int i = startPage; i <= endPage; i++){
			if(i == currentPage){	// 현재 페이지
%>
				[<%=i%>]
<%			}else{ %>
			<!-- 보고 있지 않은 페이지에 링크 설정 -->
			<!-- get방식으로 page값을 가져간다. -->
			<a href="list.jsp?page=<%=i%>&sel=<%=sel %>&find=<%=find %>" style="text-decoration:none">[<%=i%>]</a>
				
<%			}%>
			
<% 		} 
		// 다음 블럭으로 이동
		if(endPage < pageCount){
%>
			<a href="list.jsp?page=<%=startPage + 10%>&sel=<%=sel %>&find=<%=find %>" style="text-decoration:none">[다음]</a>
<%		} %>
		<!-- 마지막 페이지로 이동 -->
		<!-- 총 페이지 수를 page값에 전달 -->
		<a href="list.jsp?page=<%=pageCount %>&sel=<%=sel %>&find=<%=find %>" style="text-decoration:none"> > </a>	
<%	}	// else if end
	}	// if end %>
</div>
<br>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function () {
		$("form").submit(function () {
			if($("select").val() == ""){
				alert("검색할 항목을 선택하세요.");
				return false;
			}
			if($("#find").val() == ""){
				alert("검색어를 입력하세요.");
				$("#find").focus();
				return false;
			}
		})
	})
</script>

<!-- 게시판 검색창 -->
<!-- method 속성이 생략되어서 get방식으로 값이 넘어간다. -->
<form action="list.jsp" align="center">
	<select name="sel">
	<!-- SQL문에서 컬럼명의 자리에 sel값이 들어가기 때문에 
		 option의 value값을 컬럼과 같은 이름으로 작성해야만 한다. -->
		<option value="">검색</option>
		<option value="writer">작성자</option>
		<option value="subject">제목</option>
		<option value="content">내용</option>
	</select>
	<input type="text" name="find" id="find">
	<input type="submit" value="검색">
</form>
</body>
</html>







