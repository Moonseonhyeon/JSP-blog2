package action.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import util.Script;

public class UsersLogoutAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 아이디 남기는 로직

		HttpSession session = request.getSession();
		session.invalidate();
		// session.removeAttribute("principal");
		Script.href("로그아웃 성공", "index.jsp", response);
	}

}
