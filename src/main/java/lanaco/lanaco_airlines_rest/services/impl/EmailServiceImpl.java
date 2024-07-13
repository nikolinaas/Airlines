package lanaco.lanaco_airlines_rest.services.impl;

import jakarta.mail.internet.MimeMessage;
import lanaco.lanaco_airlines_rest.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromMail;
    @Value("${spring.mail.password}")
    private String pass;


    @Override
    public void sendRegistrationEmail(String username, String to) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            var helper = new MimeMessageHelper(message, true);
            helper.setSubject("SUCCESSFUL REGISTRATION");
            helper.setText("Your registration was successful, you are registered with username: " + username, true);
            helper.setFrom(fromMail);
            helper.setTo(to);
            this.mailSender.send(message);
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}


