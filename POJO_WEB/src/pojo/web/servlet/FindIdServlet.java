package pojo.web.servlet;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.web.service.MemberService;
import pojo.web.service.MemberServiceImp;

/**
 * Servlet implementation class FindIdServlet
 */
@WebServlet("/FindId")
public class FindIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SMTP_HOST = "localhost";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String subject = "사랑방손님 요청하신 내용입니다.";

		MemberService service = MemberServiceImp.getInstance();
		String findId = service.find(name, email);
		 // 먼저 환경 정보를 설정해야 한다.
        // 메일 서버 주소를 IP 또는 도메인 명으로 지정한다.
	      try {

	            String mail_from =  m_name + "<" + m_email + ">";
	            String mail_to =    "admin<admin@83rpm.com>";
	            String title =      "hosting.83rpm.com 요청사항 :: " + m_title;
	            String contents =   "보낸 사람 :: " + m_name + "&lt;" + m_email + "&gt;<br><br>" + m_title + "<br><br>" + m_text;

	            mail_from = new String(mail_from.getBytes("UTF-8"), "UTF-8");

	            mail_to = new String(mail_to.getBytes("UTF-8"), "UTF-8");

	 

	            Properties props = new Properties();

	            props.put("mail.transport.protocol", "smtp");
	            props.put("mail.smtp.host", "smtp.gmail.com");
	            props.put("mail.smtp.port", "465");
	            props.put("mail.smtp.starttls.enable", "true");
	            props.put("mail.smtp.socketFactory.port", "465");
	            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	            props.put("mail.smtp.socketFactory.fallback", "false");
	            props.put("mail.smtp.auth", "true");


	            Authenticator auth = new SMTPAuthenticator();
	            Session sess = Session.getDefaultInstance(props, auth);


	            MimeMessage msg = new MimeMessage(sess);

	            msg.setFrom(new InternetAddress(mail_from));
	            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(mail_to));
	            msg.setSubject(title, "UTF-8");
	            msg.setContent(contents, "text/html; charset=UTF-8");
	            msg.setHeader("Content-type", "text/html; charset=UTF-8");

	 

	            Transport.send(msg);


		RequestDispatcher dis =
				request.getRequestDispatcher("/jsp/FindId.jsp");
		dis.forward(request, response);
	}

}
