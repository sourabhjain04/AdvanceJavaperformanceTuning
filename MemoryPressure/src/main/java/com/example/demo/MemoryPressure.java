package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pressure")
public class MemoryPressure {

    @GetMapping
    public String pressure() {

        List<String> list = new ArrayList<>();

        for(int i = 0; i < 100000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        return "Created 100K objects";
    }
    
    
    @GetMapping
    public String pressureOptimized() {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10000; i++) {
            sb.append(i);
        }

        return sb.toString();
    }
}

