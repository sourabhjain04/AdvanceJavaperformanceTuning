package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ThreadController {

    @GetMapping("/thread-test")
    public String testThreads() {

        for (int i = 0; i < 200; i++) {

            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            t.start();
        }

        return "Threads Created";
    }
}
