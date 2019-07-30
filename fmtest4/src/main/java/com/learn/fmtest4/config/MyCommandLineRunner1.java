package com.learn.fmtest4.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-28 10:35
 **/
@Component
@Order(1)
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner1>>>"+ Arrays.toString(args));
    }
}
