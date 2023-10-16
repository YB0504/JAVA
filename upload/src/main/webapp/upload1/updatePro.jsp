<%@page import="upload.BoardDBBean"%>
<%@page import="upload.BoardDataBean"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	
	// 업로드할 디렉토리 path 구하기
	String path = request.getRealPath("upload");
	System.out.println("path : " + path);
	
	// 첨부파일 크기 설정 : 1MB
	int size = 1024 * 1024;
	
	MultipartRequest multi = 
			new MultipartRequest(request,
								 path,				// 업로드할 디렉토리 위치
								 size,				// 첨부파일 크기
								 "utf-8",			// 인코딩
				new DefaultFileRenamePolicy());		// 중복 문제 해결
				
	int num = Integer.parseInt(multi.getParameter("num"));
	String nowpage = multi.getParameter("page");
	
	String writer = multi.getParameter("writer");
	String email = multi.getParameter("email");
	String subject = multi.getParameter("subject");
	String content = multi.getParameter("content");
	String passwd = multi.getParameter("passwd");
	
	// 오리지널 파일 명 : 클라이언트가 직접 업로드한 파일명
	String upload0 = multi.getOriginalFileName("upload");
	
	// 실제 서버에 저장된 파일 명
	String upload = multi.getFilesystemName("upload");
	
	// 값을 할당하기 위한 DTO객체 생성
	BoardDataBean board = new BoardDataBean();
	board.setNum(num);
	board.setWriter(writer);
	board.setEmail(email);
	board.setSubject(subject);
	board.setContent(content);
	board.setPasswd(passwd);
	board.setIp(request.getRemoteAddr());
	/* board.setUpload(upload); */	// 첨부파일을 수정하지 않으면 null값이 저장된다.
	
	BoardDBBean dao = BoardDBBean.getInstance();
	
	// 글 하나에 대한 상세정보 구해오기
	BoardDataBean db = dao.getContent(num);

	/* 첨부파일을 수정했을 때와 안 했을때를 나눠서 처리해야 한다. */
	if(upload != null){			// 첨부파일을 수정한 경우
		board.setUpload(upload);
	}else{						// 첨부파일을 수정하지 않은 경우
		// DB에 저장되어있는 파일을 불러와서 강제로 집어넣어야 한다.
		// 그렇지 않으면 원래 있던 파일이 지워져 버린다.
		board.setUpload(db.getUpload());
	}
	
	if(db.getPasswd().equals(passwd)){		// 비번일치
		int result = dao.update(board);
		if(result == 1){
%>

			<script>
				alert("글 수정 성공");
				location.href = "list.jsp?page=<%=nowpage%>"
			</script>

<%		}
	}else{ 	// 비번 불일치%>
		
			<script>
				alert("비밀번호가 일치하지 않습니다.");
				history.go(-1);
			</script>
		
<%	} %>







