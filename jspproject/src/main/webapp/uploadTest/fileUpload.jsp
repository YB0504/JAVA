<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!-- 실제 파일을 업로드 하는 클래스 -->
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<!-- 중복문제를 처리하는 클래스 -->
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*" %>
<%
	// request 객체로 값을 전달할 수 없다.
	/* String na = request.getParameter("name");
	out.println("name : " + na); name : null */

	// 실제 업로드할 디렉토리 위치를 구해오는 메소드
	String uploadPath=request.getRealPath("upload");
	System.out.println("path="+uploadPath);	

	int size = 10*1024*1024;	// 첨부파일의 크기(byte단위) : 10MB
	String name="";
	String subject="";
	String filename1="";
	String filename2="";
	String origfilename1="";
	String origfilename2="";
	
	try{
		// cos라이브러리는 파일을 업로드 시켜주는 코드가 따로 존재하지 않는다.
		// MultipartRequest 객체를 생성하면서 업로드가 수행된다.
		MultipartRequest multi = new MultipartRequest(request,	  // request객체
													  uploadPath, // 실제 저장되는 경로 값
													  size,		  // 첨부파일의 크기
													  "utf-8",	  // 인코딩 타입 설정
								 new DefaultFileRenamePolicy());  // 인터페이스(중복문제를 해결해주는 코드)

		// MultipartRequest객체로 값을 받아야 한다.
		name=multi.getParameter("name");
		subject=multi.getParameter("subject");
		
		// 파일명을 알 수 없을 때 사용하는 메소드
		// 열거형으로 리턴한다.
		Enumeration files=multi.getFileNames();
		
//	    String file1 = "fileName1";
		String file1 =(String)files.nextElement();
		
		// 실제 서버에 저장된 파일명 : Bottle1.jpg
		filename1=multi.getFilesystemName(file1);
		// 클라이언트가 업로드한 파일명 : Bottle.jpg
		origfilename1= multi.getOriginalFileName(file1);

// 	    String file2 = "fileName2";		
		String file2 =(String)files.nextElement();
		filename2=multi.getFilesystemName(file2);
		origfilename2=multi.getOriginalFileName(file2);
		
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<html>
<body>
<form name="filecheck" action="fileCheck.jsp" method="post">
	<input type="hidden" name="name" value="<%=name%>">
	<input type="hidden" name="subject" value="<%=subject%>">
	<input type="hidden" name="filename1" value="<%=filename1%>">
	<input type="hidden" name="filename2" value="<%=filename2%>">
	<input type="hidden" name="origfilename1" value="<%=origfilename1%>">
	<input type="hidden" name="origfilename2" value="<%=origfilename2%>">
</form>
<a href="#" onclick="javascript:filecheck.submit()">업로드 확인 및 다운로드 페이지 이동</a>
</body>
</html>
