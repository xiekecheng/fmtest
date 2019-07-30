package com.learn.fmtest3.controller;

import com.learn.fmtest3.bean.Author;
import com.learn.fmtest3.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-27 15:18
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public void hello(Model model){
        Map<String,Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key+">>>"+value);
        }
    }

    @GetMapping("/book")
    @ResponseBody
    public String book(@ModelAttribute("b") Book book,@ModelAttribute("a") Author author){
        return book.toString()+">>>"+author.toString();
    }

    @GetMapping("/helloError")
    public String helloError(){
        int i  = 1/0;
        return "hello";
    }
}
