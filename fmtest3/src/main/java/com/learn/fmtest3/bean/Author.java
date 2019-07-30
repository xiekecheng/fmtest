package com.learn.fmtest3.bean;

import lombok.Data;

/**
 * @description: 作者
 * @author: Kecheng Xie
 * @since: 2019-07-27 15:44
 **/
@Data
public class Author {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
