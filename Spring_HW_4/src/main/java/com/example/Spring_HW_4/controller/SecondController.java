package com.example.Spring_HW_4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SecondController {
    @GetMapping("/second")
    public String openPage(Model model){
        model.addAttribute("firstName","Ivan");
        model.addAttribute("lastName","Ivanov");
        model.addAttribute("dateOfBirth","02.01.1985");
        return "second";
    }
}
