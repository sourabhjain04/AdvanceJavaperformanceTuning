package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public int calculate(int number) {
        int result = number * 2;  // Primitive (Stack)
        return result;
    }
}