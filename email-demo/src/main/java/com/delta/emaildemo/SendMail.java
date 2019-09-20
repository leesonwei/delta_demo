package com.delta.emaildemo;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/8 16:21
 */
public class SendMail {
    public static void main(String[] args) {
        JavaMailSender sender = new JavaMailSenderImpl();
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("");
        mailMessage.setTo("weilizong2014@hotmail.com");
        mailMessage.setSubject("test mail");
    }
}
