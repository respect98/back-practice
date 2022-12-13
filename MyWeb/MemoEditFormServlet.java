package memo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import memo.model.MemoDAO;
import memo.model.MemoVO;


@WebServlet("/MemoEditForm")
public class MemoEditFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		//?idx=41이런식으로 만들것
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		String idxStr = req.getParameter("idx");
		if(idxStr==null||idxStr.trim().isEmpty()) {
			res.sendRedirect("MemoList");
			return;
		}
		int idx = Integer.parseInt(idxStr.trim());
		
		MemoDAO dao = new MemoDAO();

		try {
			MemoVO memo = dao.selectMemo(idx);
			req.setAttribute("memo", memo);
			
			String viewPage="memo/edit.jsp";
			RequestDispatcher disp = req.getRequestDispatcher(viewPage);
			disp.forward(req, res);//페이지 이동
		}catch(SQLException e ) {
			e.printStackTrace();
			out.println("error: "+e.getMessage()+"<br>");
		}
		out.close();
	}

}
