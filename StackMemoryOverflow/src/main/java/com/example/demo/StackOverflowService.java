package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StackOverflowService {

	public int recursiveMethod(int count) {
	    if (count > 1000) {  // base condition
	        return count;
	    }
	    return recursiveMethod(count + 1);
	}
}