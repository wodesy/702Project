package com.example.lilinproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/adminPage")
    public String adminPage(){
        return "admin";
    }

}
