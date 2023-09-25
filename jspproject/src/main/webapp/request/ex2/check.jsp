<%@ page contentType="text/html;charset=utf-8"%>

<html>
<head>
    <title>좋은 사이트 선택</title>	
	<meta charset="utf-8">		
</head>
<body>

	<%
		// 폼파일에서 한글값이 post방식으로 전송될 때 인코딩을 시켜주는 역할
		request.setCharacterEncoding("utf-8");

		// checkbox와 같이 다중선택되어 같은 name값으로 넘어오는 값이 여러 개일때 사용하는 메소드
		// String형 배열에 받은 값을 리턴해준다.
		String[] choice = request.getParameterValues("site");
		
		String result = "";
		for (int i = 0; i < choice.length; i++) {
			result = result + choice[i] + "\t";
		}
	%>

	<center>
		당신은 <font color=blue><%=result%></font> 를 좋아하시는군요.
	</center>

</body>
</html>