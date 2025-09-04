package com.petscope.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("@/constants/categories")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
