package com.example.sessiondemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-22 15:44
 **/
@RestController
public class Controller {

    @Value("${server.port}")
    Integer port;

    @GetMapping("/set")
    public String set(HttpSession session){
        session.setAttribute("user","xiekc");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String get(HttpSession session){
        return session.getAttribute("user")+":"+port;


    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


}
