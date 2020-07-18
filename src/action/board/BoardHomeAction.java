package action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import model.Board;
import repository.BoardRepository;

public class BoardHomeAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. DB연결해서 Board 목록 다 불러와서
		
		// 2. request에 담고
		
		// 3. 이동 home.jsp
		BoardRepository boardRepository = 
				BoardRepository.getInstance();
		List<Board> boards = boardRepository.findAll();

		// 본문 짧게 가공하기
		for (Board board : boards) {
			String preview = board.getContent();
			if(preview.length()>10) {
				preview = preview.substring(0, 10)+"...";
			}
			board.setContent(preview);
		}
		request.setAttribute("boards", boards);
		
		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);
		
	}

}
