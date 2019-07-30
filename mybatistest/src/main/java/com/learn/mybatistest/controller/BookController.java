package com.learn.mybatistest.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.learn.mybatistest.bean.Book;
import com.learn.mybatistest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-29 07:11
 **/
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/bookOps")
    public void book(){
        //addBook()
        Book book = new Book();
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        int i = bookService.addBook(book);
        System.out.println("addBook()>>>"+i);

        Book book1 = new Book();
        book1.setId(1);
        book1.setAuthor("谢克成");
        book1.setName("悟空传");
        int i1 = bookService.updateBookById(book1);
        System.out.println("updateBookById>>>"+ i1);


        Book bookById = bookService.getBookById(2);
        System.out.println("getBookById>>>"+bookById);

        List<Book> allBooks = bookService.getAllBooks();
        System.out.println("getAllBooks>>>"+allBooks);

        int i2 = bookService.deleteBookById(2);
        System.out.println("deleteBookById>>>"+i2);


    }
}
