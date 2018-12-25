package com.example01.demo01.service;

import com.example01.demo01.dao.BookDao;
import com.example01.demo01.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao dao;
    public  List<Book> find(){
        return dao.find();
    }

}
