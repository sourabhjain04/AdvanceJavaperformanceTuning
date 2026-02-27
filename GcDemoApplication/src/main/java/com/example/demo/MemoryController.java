package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MemoryController {

    @GetMapping("/load")
    public String generateLoad() {
        List<byte[]> memoryConsumer = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            memoryConsumer.add(new byte[1024 * 1024]);
        }
        return "Memory Allocated";
    }
}
