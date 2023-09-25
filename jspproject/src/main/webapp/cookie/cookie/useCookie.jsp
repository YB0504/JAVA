<%@ page contentType="text/html; charset=utf-8" %>

<html>
	<head>
		<title>웹 브라우저에 저장된 쿠키를 가져오는 예제</title>
	</head>
	<body>
	<h2>웹 브라우저에 저장된 쿠키를 가져오는 예제</h2>

<%
	// 발행한 쿠키정보 조회
	// 설정한 시간만큼은 데이터를 다시 가져오지 않아도 쿠키정보를 조회할 수 있다.
	// 발행된 쿠키가 여러개일 수 있기 때문에 배열값으로 가져온다.
	Cookie[] cook = request.getCookies();

	if( cook != null ){
		for(int i=0; i<cook.length;++i){
			// getName메소드로 쿠키의 name값을 가져온다.
			if(cook[i].getName().equals("id")){
%>

		쿠키의 이름은 "<%=cook[i].getName()%>" 이고 
		쿠키의 값 "<%=cook[i].getValue()%>" 입니다.

<%
			}
		}
	}
%>

	</body>
</html>
