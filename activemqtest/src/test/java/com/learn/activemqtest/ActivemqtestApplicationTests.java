package com.learn.activemqtest;

import com.learn.activemqtest.component.JmsComponent;
import com.learn.activemqtest.model.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivemqtestApplicationTests {

    @Autowired
    JmsComponent jmsComponent;
    @Test
    public void contextLoads() {
        Message msg = new Message();
        msg.setContent("hello");
        msg.setDate(new Date());

        jmsComponent.send(msg);
    }

}
