<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- adminCheckModule.jsp
	관리자 여부를 체크하는 모듈(관리자는 status값이 9)
	1. 로그인이 되어있어야 하고
	2. 정지회원은 아니여야 하고
	3. status값이 9여야
 -->
 
 <%@ include file="/login/loginCheckModule.jsp" %>
 
 <%
 	if(user.getStatus()!=9){
 		%>
 		<script>
 			alert('관리자만 이용할 수 있어요');
 			history.back();
 		</script>
 	<%
 		return;
 	}
 %>