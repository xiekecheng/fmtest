package com.learn.controller;

import com.learn.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-04 07:49
 **/
@RestController
public class BookController {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @GetMapping("/test1")
    public void test(){
        ValueOperations ops = redisTemplate.opsForValue();
        Book book  = new Book();
        book.setAuthor("施耐庵");
        book.setName("西游记");
        ops.set("b1",book);
        System.out.println(ops.get("b1"));
        ValueOperations<String, String> ops2 = stringRedisTemplate.opsForValue();
        ops2.set("k1","v1");
        System.out.println(ops2.get("k1"));
    }
}
