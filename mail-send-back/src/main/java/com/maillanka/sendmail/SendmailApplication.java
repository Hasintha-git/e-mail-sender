package com.maillanka.sendmail;

import com.maillanka.sendmail.service.EmailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendmailApplication {

//	@Autowired
//	private EmailSendService emailSendService;

	public static void main(String[] args) {
		SpringApplication.run(SendmailApplication.class, args);
	}
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendMail(){
//		emailSendService.sendEmail("diyanethhasintha@gmail.com","this is my subject","this is my body");
//	}
}
