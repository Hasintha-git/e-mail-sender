package com.maillanka.sendmail.service;

import com.maillanka.sendmail.dto.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSendService {

    @Autowired
    private JavaMailSender mailSender;

    public boolean sendEmail(Mail mail){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom(mail.getFromMail());
        message.setTo(mail.getToMail());
        message.setText(mail.getBody());
        message.setSubject(mail.getSubject());
        mailSender.send(message);
        return true;
    }

//    *************************mail send with attach file***************************

//    public String sendMailWithAttachment(Mail mail) throws MessagingException {
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        MimeMessageHelper messageHelper=new MimeMessageHelper(mimeMessage,true);
//        messageHelper.setFrom("hasiyad99@gmail.com");
//        messageHelper.setTo(mail.getToMail());
//        messageHelper.setText(mail.getBody());
//        messageHelper.setSubject(mail.getSubject());
//        FileSystemResource fileSystemResource = new FileSystemResource(new File("D:\\"+mail.getImg()));
//        messageHelper.addAttachment(fileSystemResource.getFilename(),fileSystemResource);
//        mailSender.send(mimeMessage);
//        return "success";
//    }

}
