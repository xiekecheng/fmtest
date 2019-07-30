package com.learn.fmtest2.Controller;

import com.learn.fmtest2.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-26 16:17
 **/
@Controller
public class BookController {

    @GetMapping("/book")
    @ResponseBody
    public Book book(){
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;

    }
}
