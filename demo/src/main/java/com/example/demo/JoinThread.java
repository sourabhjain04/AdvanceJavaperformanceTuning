package com.example.demo;

public class JoinThread {
	
	 public static void main(String[] args) throws Exception {

	        Thread t = new Thread(() -> {
	            for (int i = 1; i <= 5; i++) {
	                System.out.println("Child Thread: " + i);
	                try { Thread.sleep(1000); } catch (Exception e) {}
	            }
	        });

	        t.start();

	        t.join(); // main thread waits here

	        System.out.println("Main thread finished");
	    }
	}