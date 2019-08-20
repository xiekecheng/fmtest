package com.example.rabbitmq;

import com.example.rabbitmq.config.RabbitFanoutConfig;
import com.example.rabbitmq.config.RabbitTopicConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void contextLoads() {
        rabbitTemplate.convertAndSend("hello-queue","directTest");
    }

    @Test
    public void directTest(){
        rabbitTemplate.convertAndSend("hello-queue","directTest");
        // System.out.println("success");
        rabbitTemplate.convertAndSend("hello-queue","aaaaa");
    }

    @Test
    public void fanoutTest(){
        rabbitTemplate.convertAndSend(RabbitFanoutConfig.FANOUTNAME,null,"hello fannout");
    }


    @Test
    public void topicTest(){
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"xiaomi.news","小米新闻");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"huawei.news","华为新闻");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"iphone.news","iphone新闻");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"xiaomi.iphone","小米手机");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"huawei.iphone","华为手机");

    }

}
