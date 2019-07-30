package com.learn.mybatistest.mapper;

import com.learn.mybatistest.bean.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: xiekecheng
 * @since: 2019-07-29 06:30
 **/
@Mapper
public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(Integer id);
    int updateBookById(Book book);
    Book getBookById(Integer id);
    List<Book> getAllBooks();
}
