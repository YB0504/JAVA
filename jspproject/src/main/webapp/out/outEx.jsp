<%@ page contentType="text/html;charset=utf-8" buffer="5kb"%>
<!-- 
	 buffer속성 : 현재 사용중인  buffer의 크기를 설정하는 속성
	 기본 값은 8kb로 설정되어 있다.
 -->

<%
	int totalBuffer = out.getBufferSize();
	int remainBuffer = out.getRemaining();
	int useBuffer = totalBuffer - remainBuffer;
%>

<h1>Out 예제</h1>
<b>현재 페이지의 Buffer 상태</b><p>

출력 Buffer의 전체 크기 : <%=totalBuffer%>byte<p>
현재 Buffer의 사용량 : <%=useBuffer%>byte<p>
남은 Buffer의 크기 : <%=remainBuffer%>byte<p>

<!-- 
출력 Buffer의 전체 크기 : 5120byte

현재 Buffer의 사용량 : 83byte

남은 Buffer의 크기 : 5037byte 
-->