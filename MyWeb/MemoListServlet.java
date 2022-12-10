package memo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import memo.model.MemoDAO;
import memo.model.MemoVO;


@WebServlet("/MemoList")
public class MemoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		//전체 메모 목록 가져오기
		MemoDAO dao = new MemoDAO();
		try {
		List<MemoVO> arr = dao.selectMemoAll();
		//모델 통해 가져온 데이터를 req에 저장한 뒤 View페이지로 이동
		//==>이때 주의. redirect방식이 아니라 forward방식으로 이동해야 함
		//req.setAttribute(key값, value값);
		req.setAttribute("memoArr", arr);
		
		String viewPage="memo/list.jsp";
		
//		res.sendRedirect(viewPage); //새로운 요청을 발생시킨다.
		
		
		//forward이동해보자
		RequestDispatcher disp = req.getRequestDispatcher(viewPage);
		disp.forward(req, res);//forward이동할때 req,res를 가지고 간다.
		//redirect: 브라우저의 url을 변경해서 새로운 request를 발생시키는 방식으로 이동
		//forward: 서버 내부에서 페이지 이동을 한다. 따라서 브라우저는 이동한 url을 알지 못함
		
		
		}catch(Exception e) {
			e.printStackTrace();
			out.println("error: "+e.getMessage()+"<br>");
		}
		
		
		out.close();
	}

}
