package com.tianmaying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @GetMapping
    public String get() {
        return "register";
    }

    @PostMapping
    public String post() {
        //Your code goes here
        return "";
    }

}
