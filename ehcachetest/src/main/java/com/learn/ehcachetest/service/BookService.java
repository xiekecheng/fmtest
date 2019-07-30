package com.learn.ehcachetest.service;

import com.learn.ehcachetest.bean.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-29 23:26
 **/
@Repository
@CacheConfig(cacheNames = "book_cache")
public class BookService {

    @Cacheable
    public Book getBookById(Integer id){
        System.out.println("getBookById()");
        Book book = new Book();
        book.setId(id);
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        return book;

    }

    @CachePut
    public Book updateBookById(Book book){
        System.out.println("updateBookById()");
        book.setName("三国演义2");
        return book;
    }

    @CacheEvict(key = "#id")
    public void deleteBookById(Integer id){
        System.out.println("deleteBookById");
    }

}
