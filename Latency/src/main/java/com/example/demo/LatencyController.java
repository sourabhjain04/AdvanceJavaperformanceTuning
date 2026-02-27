package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.LatencyService;

@RestController
@RequestMapping("/latency")
public class LatencyController {

    @Autowired
    private LatencyService service;

    @GetMapping("/low")
    public String low() {

        long start = System.currentTimeMillis();

        service.lowLatencyOperation();

        long end = System.currentTimeMillis();

        return "Low Allocation Time: " + (end - start) + " ms";
    }

    @GetMapping("/high")
    public String high() {

        long start = System.currentTimeMillis();

        service.highLatencyOperation();

        long end = System.currentTimeMillis();

        return "High Allocation Time: " + (end - start) + " ms";
    }
}