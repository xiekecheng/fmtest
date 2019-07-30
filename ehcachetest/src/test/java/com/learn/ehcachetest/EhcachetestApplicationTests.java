package com.learn.ehcachetest;

import com.learn.ehcachetest.bean.Book;
import com.learn.ehcachetest.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EhcachetestApplicationTests {

    @Autowired
    BookService bookService;
    @Test
    public void contextLoads() {
        bookService.getBookById(1);
        bookService.getBookById(1);
        bookService.deleteBookById(1);
        Book book3 = bookService.getBookById(1);
        System.out.println("book3>>>"+book3);

        Book book = new Book();
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        book.setId(1);
        bookService.updateBookById(book);
        Book book4 = bookService.getBookById(1);
        System.out.println("b4>>>"+book4);
    }

}
