package com.delta.emaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/8 16:27
 */
@RestController
public class SendMailController {
    @Autowired
    JavaMailSender javaMailSender;

    @RequestMapping("sendmail")
    public String sendmail(String content) throws MessagingException {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("weilizong2014@hotmail.com");
        simpleMailMessage.setSubject("test");
        simpleMailMessage.setText(content);
        javaMailSender.send(simpleMailMessage);
        return "ok";
    }
}
