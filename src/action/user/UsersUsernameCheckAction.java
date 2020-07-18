package action.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import repository.UsersRepository;
import util.Script;

public class UsersUsernameCheckAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");

		UsersRepository usersRepository = 
				UsersRepository.getInstance();
		int result = usersRepository.findByUsername(username);

		Script.outText(result+"", response);
	}
}
