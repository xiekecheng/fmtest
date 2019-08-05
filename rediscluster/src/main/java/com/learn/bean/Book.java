package com.learn.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-03 22:53
 **/
@Data
public class Book implements Serializable {
    private String name;
    private String author;

}
