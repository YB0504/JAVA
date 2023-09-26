<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.ArrayList"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%	
	request.setCharacterEncoding("utf-8");

	String productname = request.getParameter("product");

	// 아래에서 설정한 session 값을 구해온다.
	// ArrayList 클래스로 다운 캐스팅하여 list변수로 돌려준다.
	ArrayList list = (ArrayList)session.getAttribute("productlist");

	// 만일 null 인 경우 처음 데이터를 추가한 것이므로 새로운 ArrayList 생성
	if(list == null) {
		// 처음에는 ArrayList객체를 한번 생성한다.
		list = new ArrayList();
	}

	// ArrayList 에 새로운 데이터 추가해서
	// 추가된 데이터를 다시 누적해서 session영역에 저장한다.
	list.add(productname);
	session.setAttribute("productlist",list);
%>

	<!-- 자바스크립트를 이용해 간단한 메시지 출력  -->
	<script>
		alert("<%=productname %> 이(가)추가 되었습니다.!!");
		history.go(-1);
	</script>
</body>
</html>