package com.learn.mailtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-30 23:34
 **/
@Component
public class MailService {

    @Autowired
    JavaMailSender javaMailSender;
    public void sendSimpleMail(String from,String to,String cc,String subject,String content){
        SimpleMailMessage simMsg = new SimpleMailMessage();
        simMsg.setFrom(from);
        simMsg.setTo(to);
        simMsg.setCc(cc);
        simMsg.setSubject(subject);
        simMsg.setText(content);
        javaMailSender.send(simMsg);
    }
}
