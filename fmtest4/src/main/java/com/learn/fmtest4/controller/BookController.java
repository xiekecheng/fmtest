package com.learn.fmtest4.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-27 18:32
 **/
@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping("/")
    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public String addBook(String name){
        return "receive:"+name;
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id){
        return String.valueOf(id);
    }

}
