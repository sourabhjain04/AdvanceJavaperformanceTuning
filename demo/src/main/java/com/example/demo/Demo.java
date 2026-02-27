package com.example.demo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}