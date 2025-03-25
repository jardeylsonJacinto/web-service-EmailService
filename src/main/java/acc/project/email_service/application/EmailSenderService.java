package acc.project.email_service.application;

import org.springframework.stereotype.Service;

import acc.project.email_service.adapters.EmailSenderGateway;
import acc.project.email_service.domain.cases.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase {

  private final EmailSenderGateway emailSenderGateway;

  public EmailSenderService(EmailSenderGateway emailGateway) {
    this.emailSenderGateway = emailGateway;
  }

  @Override
  public void sendEmail(String to, String subject, String body) {
    this.emailSenderGateway.sendEmail(to, subject, body);
  }

}
