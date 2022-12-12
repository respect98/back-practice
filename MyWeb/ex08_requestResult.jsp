<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//단일 값 받아오기(name, passwd, gender, photo, job, intro, secret)
	//request:HttpServletRequest타입
	//String getParameter("파라미터이름")
	
	String name=request.getParameter("userid");
	String passwd=request.getParameter("passwd");
	String gender=request.getParameter("gender");
	String photo=request.getParameter("photo");
	String job=request.getParameter("job");
	String intro=request.getParameter("intro");
	String secret=request.getParameter("secret");
	
	
	//다중 값 받아오기(hobby, lang)
	//String[] getParameterVlaues("파라미터이름")
	
	String[] hobbies=request.getParameterValues("hobby");
	String[] langs=request.getParameterValues("lang");
%>

<ul>
	<li>아이디:<%=name %> </li>
	<li>비밀번호:<%=passwd %> </li>
	<li>성별:<%=gender %> </li>
	<li>파일명:<%=photo %> </li>
	<li>직업:<%=job %> </li>
	<li>자기소개:<%=intro %> </li>
	<li>비밀:<%=secret %> </li>
	<li>취미:
		<% if(hobbies!=null){
			for(String hobby: hobbies) {
				out.println(hobby+", ");
			}
		}
		%>
	</li>
	<li>사용언어:
		<% if(langs!=null){
			for(String lang: langs) {
				%>
				<%=lang %>,
				<% 
			}
		}

		%>
	</li>
</ul>
<hr color='red'>
<h1>request의 주요 메서드</h1>
<%
	String server = request.getServerName(); //서버 도메인명
	int port=request.getServerPort(); //포트번호
	StringBuffer buf = request.getRequestURL();//url -> 전체 url을 반환 :http://localhost:9090/MyWeb/example/ex08_requestResult.jsp
	String url=buf.toString();
	String uri=request.getRequestURI();//uri -> 컨텐스트명이후 경로를 반환 :/MyWeb/example/ex08_requestResult.jsp
	String myctx=request.getContextPath();// "/MyWeb"컨텐스트명을 반환함
	String queryString = request.getQueryString();
	String cip=request.getRemoteAddr();
	String protocol=request.getProtocol();
	
	int i=uri.indexOf(".jsp");
	int end=0;
	if(i>0)
		end=i;

	String str=uri.substring(myctx.length(), end);
	
	String str2 = uri.replace(myctx,"").replace(".jsp","");
	
	String str3 = request.getServletPath().replace(".jsp","");
%>
<h2>서버 도메인명: <%=server%></h2>
<h2>서버 포트번호: <%=port%></h2>
<h2>요청 URL: <%=url%></h2>
<h2>요청 URI: <%=uri%></h2>
<h2>Query String: <%=queryString%></h2>
<h2>클라이언트 IP: <%=cip%></h2>
<h2>프로토콜: <%=protocol%></h2>
<hr color='blue'>
<h1><%=str %></h1>
<h1><%=str2 %></h1>
<h1><%=str3 %></h1>





