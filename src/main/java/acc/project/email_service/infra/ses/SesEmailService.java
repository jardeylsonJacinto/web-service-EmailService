package acc.project.email_service.infra.ses;

import org.springframework.stereotype.Service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;

import acc.project.email_service.adapters.EmailSenderGateway;
import acc.project.email_service.domain.exceptions.EmailServiceException;

@Service
public class SesEmailService implements EmailSenderGateway {

  private final AmazonSimpleEmailService amazonSimpleEmailService;

  public SesEmailService(AmazonSimpleEmailService amazonSimpleEmailService) {
    this.amazonSimpleEmailService = amazonSimpleEmailService;
  }

  @Override
  public void sendEmail(String to, String subject, String body) {
    SendEmailRequest request = new SendEmailRequest()
        .withSource("jardeylsong.m@gmail.com")
        .withDestination(new Destination().withToAddresses(to))
        .withMessage(new Message()
            .withSubject(new Content(subject))
            .withBody(new Body().withText(new Content(body))));
    try {
      this.amazonSimpleEmailService.sendEmail(request);
    } catch (AmazonServiceException e) {
      throw new EmailServiceException("failure sending email", e);
    }
  }
}
