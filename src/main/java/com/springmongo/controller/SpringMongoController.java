package com.springmongo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-mongo")
public class SpringMongoController {
    @GetMapping("/test")
    public String testMethod() {
        return "Spring Mongo Controller";
    }
}
