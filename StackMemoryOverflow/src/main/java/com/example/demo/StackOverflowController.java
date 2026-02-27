package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StackOverflowController {

    @Autowired
    private StackOverflowService service;

    @GetMapping("/overflow")
    public String triggerOverflow() {
        service.recursiveMethod(1);
        return "This will never execute";
    }
}