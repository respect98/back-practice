package my.com;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//post방식은 요청 entity body에 데이터를 포함시켜 전송한다. 따라서 url부분에 데이터 노출이 없다.
@WebServlet("/PostTest")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//사용자가 입력한 값 받아서 브라우저에 출력하세요
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();//html태그를 출력할 때
		//이미지나 동영상 파일
		//ServletOutputStream sos = res.getOutputStream();
		
		//post방식일때 한글처리
		req.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		String userid = req.getParameter("userid");
		out.println("<h1>POST방식 Test</h1>");
		out.println("<h2>POST방식 -doPost()메서드를 오버라이드 해야 한다</h2>");
		out.println("<hr color='red'>");
		out.println("<h3>이 름: "+name+"</h3>");
		out.println("<h3>아이디: "+userid+"</h3>");
		
		out.close();
	}

}
