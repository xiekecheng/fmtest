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

    public void send(Message msg){
        messagingTemplate.convertAndSend(this.queue,msg);
    }

    @JmsListener(destination="amq")
    public void receive(Message message){
        System.out.println("receive:"+message);
    }

}
