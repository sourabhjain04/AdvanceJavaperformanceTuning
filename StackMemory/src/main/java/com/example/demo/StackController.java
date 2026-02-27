package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stack")
public class StackController {

    @Autowired
    private UserService service;

    @GetMapping
    public String stackDemo() {

        int result = service.process(5);

        return "Result: " + result;
    }
}