package org.example.springsecuritykap123a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {


    @GetMapping("/test")
    public String getTest() {
        return "Hello";
    }


}
