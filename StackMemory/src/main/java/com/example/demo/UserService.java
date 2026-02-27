package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public int process(int input) {
        int value = repository.calculate(input); // Stack variable
        return value + 10;
    }
}