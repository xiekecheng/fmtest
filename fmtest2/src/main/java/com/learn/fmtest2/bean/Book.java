package com.learn.fmtest2.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-26 16:07
 **/
@Data
public class Book {
    private String name;
    private String author;
    @JsonIgnore
    private Float price;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;
}
