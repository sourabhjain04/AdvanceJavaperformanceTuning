package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product getProduct(Long id) {
        simulateSlowDbCall();
        return repository.findById(id).orElse(null);
    }

    private void simulateSlowDbCall() {
        try {
            Thread.sleep(2000); // Simulate DB latency
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}