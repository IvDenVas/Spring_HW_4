package com.example.Spring_HW_4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class FirstController {
    @GetMapping()
    public String openPage(){
        return "hello";
    }
}
