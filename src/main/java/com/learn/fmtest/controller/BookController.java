package com.learn.fmtest.controller;

import com.learn.fmtest.bean.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-26 06:58
 **/
public class BookController {
    @GetMapping("/books")
    public ModelAndView books(){
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1);
        book1.setName("三国演义");
        book1.setAuthor("罗贯中");
        Book book2 = new Book();
        book2.setId(2);
        book2.setName("红楼梦");
        book2.setAuthor("曹雪芹");
        ModelAndView mv = new ModelAndView();
        books.add(book1);
        books.add(book2);
        mv.addObject("books",books);
        mv.setViewName("books");
        return mv;
    }
}
