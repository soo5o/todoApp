package com.example.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//spring MVC
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello"; //=> hello.html을 사용하겠다는 의미
    }
}
