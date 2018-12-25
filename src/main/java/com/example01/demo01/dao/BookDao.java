package com.example01.demo01.dao;



import com.example01.demo01.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookDao {
    List<Book> find();
}
