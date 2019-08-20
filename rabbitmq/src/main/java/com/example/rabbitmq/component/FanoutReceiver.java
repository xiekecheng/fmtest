package com.example.rabbitmq.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-16 16:14
 **/
@Component
public class FanoutReceiver {

    @RabbitListener(queues = "queue1")
    public void handler1(String msg){
        System.out.println("FanoutReceiver1 >>> "+ msg);
    }

    @RabbitListener(queues = "queue2")
    public void handler2(String msg){
        System.out.println("FanoutReceiver2 >>> "+ msg);
    }
}
