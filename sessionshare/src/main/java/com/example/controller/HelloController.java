package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @description: 测试
 * @author: Kecheng Xie
 * @since: 2019-08-04 10:06
 **/
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @PostMapping("/save")
    public String saveName(String name, HttpSession session){
        session.setAttribute("name",name);
        return port;


    }
    @GetMapping("/get")
    public String getName(HttpSession session){
        return port + ":" +session.getAttribute("name").toString();
    }

}
