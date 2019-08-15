package com.learn.websocket.controller;

import com.learn.websocket.bean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-10 17:53
 **/
@Controller
public class GreetingController {


    @Autowired
    SimpMessagingTemplate messagingTemplate;

    /*
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(Message message) throws Exception{
        return message;
    }
     */

    @MessageMapping("/hello")
    public void greeting(Message message) throws Exception{
        messagingTemplate.convertAndSend("/topic/greetings",message);

    }


}
