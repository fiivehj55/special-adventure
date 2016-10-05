package pojo.web.mailer;

import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;

public class SMTPAuthenticator extends Authenticator {

    public SMTPAuthenticator() {

        super();

    }

 

    public PasswordAuthentication getPasswordAuthentication() {

        String username = "지메일주소";

        String password = "지메일암호";

        return new PasswordAuthentication(username, password);

    }

}
