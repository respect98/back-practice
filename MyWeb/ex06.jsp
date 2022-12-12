<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/top.jsp"/>
<script type="text/javascript">
	function check() {
		//유효성 체크
		if(!frm.empno.value){
			alert('사번이 입력되지 않았습니다.')
			frm.empno.focus();//입력포커스
			return;
		}
		frm.submit();//서버에 전송
	}
	
</script>
<div class="container">
	<h1>성적 입력</h1>
	<form name="frm" action="result.jsp" method="post">
		<table border="1">
			<tr>
				<th colspan="2">사번</th>
				<td><input type="number" name="empno"></td>
			</tr>
			<tr>
				<td rowspan="3">과목</td>
				<td>java</td>
				<td><input type="number" name="java"></td>
			</tr>	
			<tr>
				<td>Database</td>
				<td><input type="number" name="db"></td>
			</tr>
			<tr>
				<td>JSP</td>
				<td><input type="number" name="jsp" ></td>
			</tr>
			<tr>
				<td colspan="3" align="center">
				<button type="button" onclick="check()">저장</button>
				</td>
			</tr>	
		</table>
	</form>
</div>
<jsp:include page="/foot.jsp"/>