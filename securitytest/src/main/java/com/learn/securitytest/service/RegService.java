package com.learn.securitytest.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-30 15:05
 **/
@Service
public class RegService {
    public int reg(String username,String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String encodePassword = encoder.encode(password);
        return saveToDB(username,encodePassword);
    }

    private int saveToDB(String username,String encodePassword){
        System.out.println("username>>>"+username);
        System.out.println("encodePassword"+encodePassword);
        return 1;
    }
}
