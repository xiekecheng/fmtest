package com.learn.fmtest4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Fmtest4Application {

    public static void main(String[] args) {
        SpringApplication.run(Fmtest4Application.class, args);
    }

}
