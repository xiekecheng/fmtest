package com.learn.demo.controller;

import com.learn.demo.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-29 21:08
 **/
@RestController
public class BookController {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/test1")
    public void test1(){
        ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
        ops1.set("name","三国演义");
        String name = ops1.get("name");
        ops1.set("aaa","aaa");
        System.out.println(ops1.get("aaa"));
        System.out.println(name);
        ValueOperations ops2 = redisTemplate.opsForValue();
        Book book1 = new Book();
        book1.setId(1);
        book1.setAuthor("曹雪芹");
        book1.setName("红楼梦");
        ops2.set("b1",book1);
        ops2.set("b2",book1);
        System.out.println("=====getb1");
        System.out.println("=====getb2");
        Book book = (Book) ops2.get("b1");
        System.out.println(book);

    }
}
