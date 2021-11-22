package com.waters.rain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @ResponseBody
    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
