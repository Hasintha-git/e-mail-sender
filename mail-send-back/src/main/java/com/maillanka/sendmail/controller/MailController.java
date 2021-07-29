package com.maillanka.sendmail.controller;

import com.maillanka.sendmail.dto.Mail;
import com.maillanka.sendmail.service.EmailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MailController {

    @Autowired
    private EmailSendService emailSendService;

    @PostMapping( "/send")
    public boolean postMail(@RequestBody Mail mail){
        return emailSendService.sendEmail(mail);
    }

}
