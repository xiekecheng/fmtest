package com.learn.fmtest5.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-28 11:41
 **/
@Service
public class UserService {
    public String getUserById(Integer id){
        System.out.println("get....");
        return "user";
    }

    public void deleteUserById(Integer id){
        System.out.println("delete...");
    }
}
