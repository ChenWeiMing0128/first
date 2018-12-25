package com.example01.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestIndex {
    @RequestMapping("aaa")
    public String show(){
        return "index";
    }
}
