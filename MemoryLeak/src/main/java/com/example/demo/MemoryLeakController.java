package com.example.demo;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/leak")
public class MemoryLeakController {
	//private static final int MAX_SIZE=10;
	
	
	
	private static List<WeakReference<byte[]>> memoryList = new ArrayList<>();
	
    @GetMapping
	public String Leak() {
		byte[] data = new byte[1024 * 1024]; // 1MB
		
		memoryList.add(new WeakReference<>(data));
		
	//	if (memoryList.size() > MAX_SIZE) {
	//		memoryList.remove(0); // Remove the oldest entry to prevent OutOfMemoryError
	//	}
		
		
		int aliveCount =0;
		int ClearedCount =0;
		for (WeakReference<byte[]> ref : memoryList) {
			if (ref.get() != null) {
				aliveCount++;
			} else {
				ClearedCount++;
			}
		}
		
		return "Total References: " + memoryList.size() + ", Alive: " + aliveCount + ", Cleared: " + ClearedCount;
		
		
		
	}
	
	
	

}
