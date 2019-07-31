package com.learn.mailtest.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class MailServiceTest {
    @Autowired
    MailService mailService;
    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("568835977@qq.com","568835977@qq.com","568835977@qq.com","subject","content");
    }
}