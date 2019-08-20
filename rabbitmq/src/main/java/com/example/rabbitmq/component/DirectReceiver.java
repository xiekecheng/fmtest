package com.example.rabbitmq.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-16 14:11
 **/
@Component
public class DirectReceiver {

    @RabbitListener(queues= "hello-queue")
    public void handler1(String message){
        System.out.println("DirectReceiver >>>>>"+message);


    }
}
