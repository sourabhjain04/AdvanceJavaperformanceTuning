package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // ❌ STATIC LIST CAUSING MEMORY LEAK
    private static List<Employee> cache = new ArrayList<>();

    public List<Employee> getAllEmployees() {

        List<Employee> list = repository.findAll();

        // Every request adds to static list
        cache.addAll(list);

        return list;
    }
}