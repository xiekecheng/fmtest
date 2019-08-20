package com.learn.activemqtest.component;

import com.learn.activemqtest.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

// import javax.jms.Message;
import javax.jms.Queue;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-30 22:43
 **/
@Component
public class JmsComponent {
    @Autowired
    JmsMessagingTemplate messagingTemplate;

    @Autowired
    Queue queue;

    /**
     * messagingTemplate   JMS消息发送模板
     * this.queue是消息队列，msg是消息
     * @param msg
     */
    public void send(Message msg){
        messagingTemplate.convertAndSend(this.queue,msg);
    }

    /**
     * 监听消息队列里的消息
     * @param message
     */
    @JmsListener(destination="amq")
    public void receive(Message message){
        System.out.println("receive:"+message);
    }

}
