package com.devmaster.lesson02.pkg_annotation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/student")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
