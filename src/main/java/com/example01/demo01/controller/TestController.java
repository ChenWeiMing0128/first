package com.example01.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = {"/","index"})
    public String demo1(){
        return "mySpringBoot";
    }
}
