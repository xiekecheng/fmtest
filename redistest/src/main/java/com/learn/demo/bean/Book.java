package com.learn.demo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-29 21:06
 **/
@Data
public class Book implements Serializable {
    private Integer Id;
    private String name;
    private String author;

}
