package com.learn.dbsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-30 17:19
 **/
@RestController
public class HelloController {

    @GetMapping("/user/hello")
    public String user(){
        return "hello user";
    }

    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin";
    }

    @GetMapping("/db/hello")
    public String db(){
        return "hello db";
    }
}
