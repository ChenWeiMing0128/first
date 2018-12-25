package com.example01.demo01.controller;

import com.example01.demo01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowBooksController {
    @Autowired
    BookService service;
    @RequestMapping("book/list")
    public String findBooks(Model model){
        model.addAttribute("bookList",service.find());
        return "bookList";
    }
}
