package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class LatencyService {

    // LOW MEMORY ALLOCATION
    public String lowLatencyOperation() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }

        return sb.toString();
    }

    // HIGH MEMORY ALLOCATION (Memory Pressure)
    public String highLatencyOperation() {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        return "Generated objects: " + list.size();
    }
}