package acc.project.email_service.domain.cases;

public interface EmailSenderUseCase {
  void sendEmail(String to, String subject, String body);
}
