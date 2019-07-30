package com.learn.fmtest4.controller;

import com.learn.fmtest4.bean.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-27 23:13
 **/
@RestController
public class HelloController {
    @Autowired
    private Hello hello;

    @GetMapping("/hello")
    public String hello(){
        return hello.sayHello("江南一点雨");
    }

    @GetMapping("/hello2")
    public String hello2(){
        System.out.println("hello2");
        return hello.sayHello("hello2");
    }

}
