package com.learn.securitytest.controller;

import com.learn.securitytest.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-30 06:00
 **/
@RestController
public class HelloController {
    @Autowired
    private MethodService methodService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/admin/hello")
    public String admin(){
        // return "hello admin";
        return methodService.admin();
    }

    @GetMapping("/user/hello")
    public String user(){
        return "hello user";
    }

    @GetMapping("/db/hello")
    public String db(){
        return "hello dba";
    }
}
