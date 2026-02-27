package com.example.demo;
public class GCModernDemo {

    public static void main(String[] args) throws Exception {

        while (true) {

            // Allocate 10MB repeatedly
            byte[] data = new byte[10 * 1024 * 1024];

            Thread.sleep(200);
        }
    }
}