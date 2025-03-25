package acc.project.email_service.domain;

public interface EmailSenderUseCase {
  void sendEmail(String to, String subject, String body);
}
