package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContorller {
    @RequestMapping("/index")
    //ssadsdsadsads
    public String index() {

        return "index";
    }
}
