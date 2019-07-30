package com.learn.ehcachetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EhcachetestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhcachetestApplication.class, args);
    }

}
