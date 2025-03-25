package acc.project.email_service.domain;

public record EmailRequest(String to, String subject, String body) {

}
