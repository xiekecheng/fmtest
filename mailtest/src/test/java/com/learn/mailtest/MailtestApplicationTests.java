package com.learn.mailtest;

import com.learn.mailtest.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailtestApplicationTests {
    @Autowired
    MailService mailService;
    @Test
    public void contextLoads() {
        mailService.sendSimpleMail("568835977@qq.com","568835977@qq.com","568835977@qq.com","subject","content");

    }

}
