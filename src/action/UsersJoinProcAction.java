package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsersJoinProcAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//유효성 검사
		if(
				request.getParameter("username").equals("") ||
				request.getParameter("username") == null ||
				request.getParameter("password").equals("") ||
				request.getParameter("password") == null ||
				request.getParameter("email").equals("") ||
				request.getParameter("email") == null ||
				request.getParameter("address").equals("") ||
				request.getParameter("address") == null
				
				) {
			return;
		}
		
		//파라메터를 받기
		String username = request.getParameter("username");
		
		//user 오브젝트 면환
		
		//db연결 - UsersRepository의 save() 호출
		
		//index.jsp 페이지로 이동ㅎ
		
	}

}
