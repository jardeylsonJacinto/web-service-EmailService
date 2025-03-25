package acc.project.email_service.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import acc.project.email_service.application.EmailSenderService;
import acc.project.email_service.domain.EmailRequest;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {
  private final EmailSenderService emailSenderService;

  public EmailSenderController(EmailSenderService emailSenderService) {
    this.emailSenderService = emailSenderService;
  }

  @PostMapping("path")
  public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
    try {
      this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
      return ResponseEntity.ok("Email sent successfully");
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error sending email: " + e.getMessage());
    }
  }

}
