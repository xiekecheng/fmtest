package com.learn.mybatistest.service;

import com.learn.mybatistest.bean.Book;
import com.learn.mybatistest.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-29 07:04
 **/
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    //增加
    public int addBook(Book book){
        return bookMapper.addBook(book);
    }

    /**
     * 更新
     * @param book
     * @return
     */
    public int updateBookById(Book book){
        return bookMapper.updateBookById(book);
    }

    public int deleteBookById(Integer id){
        return bookMapper.deleteBookById(id);
    }

    public Book getBookById(Integer id){
        return bookMapper.getBookById(id);
    }

    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }
}
