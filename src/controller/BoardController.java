package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import action.board.BoardHomeAction;
import action.board.BoardWriteAction;
import action.board.BoardWriteProcAction;

@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final String TAG = "BoardController";
	private static final long serialVersionUID = 1L;

	public BoardController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("path", request.getContextPath());

		String cmd = request.getParameter("cmd");
		System.out.println(TAG+"router : "+cmd);
		Action action = router(cmd);
		action.execute(request, response);
	}
	
	public Action router(String cmd) {
		if(cmd.equals("home")) {
			//회원가입 페이지로 이동
			return new BoardHomeAction();//Board의 목록
		}else if(cmd.equals("write")) {
			// 회원가입 페이지로 이동
			return new BoardWriteAction(); //글쓰기
		}else if(cmd.equals("writeProc")) {
			// 회원가입 페이지로 이동
			return new BoardWriteProcAction(); //글쓰기
		}
		return null;
	}

}
