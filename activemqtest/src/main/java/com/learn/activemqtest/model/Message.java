package com.learn.activemqtest.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-30 22:48
 **/
public class Message implements Serializable {
    private String content;
    private Date date;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
