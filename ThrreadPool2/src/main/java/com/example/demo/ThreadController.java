package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ThreadController {

    ExecutorService executor = Executors.newFixedThreadPool(20);

    @GetMapping("/thread-test")
    public String testThreads() {

        for (int i = 0; i < 200; i++) {

            executor.submit(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        return "Tasks Submitted";
    }
}
