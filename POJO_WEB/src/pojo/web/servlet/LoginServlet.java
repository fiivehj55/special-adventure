package pojo.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojo.web.dto.Member;
import pojo.web.service.MemberService;
import pojo.web.service.MemberServiceImp;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberService service = MemberServiceImp.getInstance();
		Member user =  service.login(id, password);
		
		HttpSession session =  request.getSession();
		session.setAttribute("user", user);
		RequestDispatcher dis = 
				request.getRequestDispatcher("Main.jsp");
		dis.forward(request, response);
		
		
	}

}
