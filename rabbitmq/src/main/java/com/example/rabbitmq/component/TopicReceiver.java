package com.example.rabbitmq.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-16 17:20
 **/
@Component
public class TopicReceiver {

    @RabbitListener(queues = "xiaomi")
    public void handler1(String message){
        System.out.println("监听小米>>"+ message);
    }

    @RabbitListener(queues = "huawei")
    public void handler2(String message){
        System.out.println("监听huawei>>"+ message);
    }

    @RabbitListener(queues = "iphone")
    public void handler3(String message){
        System.out.println("监听iphone>>"+ message);
    }

}
