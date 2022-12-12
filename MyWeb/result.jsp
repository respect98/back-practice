<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/top.jsp"/>

<%

	String empno=(String)request.getParameter("empno");
	String javaStr=(String)request.getParameter("java");
	String dbStr=(String)request.getParameter("db");
	String jspStr=(String)request.getParameter("jsp");
	int java=0;
	int db=0;
	int jsp=0;

	if(javaStr.trim().isEmpty() || javaStr==null) {
		java=0;
	}else{
		java=Integer.parseInt(javaStr.trim());
		if(!(0<=java && java<=100)) {
			java=0;
		}
	}
	if(dbStr.trim().isEmpty() || dbStr==null) {
		db=0;
	}else{
		db=Integer.parseInt(dbStr.trim());
		if(!(0<=db && db<=100)) {
			db=0;
		}
	}
	
	if(jspStr.trim().isEmpty() || jspStr==null){
		jsp=0;
	}else{
		jsp=Integer.parseInt(jspStr.trim());
		if(!(0<=jsp && jsp<=100)) {
			jsp=0;
		}
	}
	
	int avg=(java+db+jsp)/3;
	
%>

<div class="container">
	<h1>처리 결과</h1>
	<form name="result" action="result.jsp" method="post">
		<table border="1">
			<tr>
				<th colspan="2">사번</th>
				<td><input type="number" value="<%=empno %>" ></td>
			</tr>
			<tr>
				<td rowspan="3">과목</td>
				<td>java</td>
				<td><input type="number" value="<%=java %>"></td>
			</tr>	
			<tr>
				<td>Database</td>
				<td><input type="number" value="<%=db %>"></td>
			</tr>
			<tr>
				<td>JSP</td>
				<td><input type="number" value="<%=jsp %>"></td>
			</tr>
			<tr>
				<td colspan=2>평균</td>
				<td><input type="number"  value="<%=avg%>"></td>
			</tr>
			
			<tr>
				<td colspan="3" align="center">
				<button type="button" onclick="location.href='ex06.jsp'">입력화면</button>
				</td>
			</tr>	
		</table>
	</form>
</div>
<jsp:include page="/foot.jsp"/>