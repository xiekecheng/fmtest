package com.learn.fmtest3.bean;

import lombok.Data;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-27 15:42
 **/
@Data
public class Book {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
