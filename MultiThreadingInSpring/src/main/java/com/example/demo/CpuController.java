package com.example.demo;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.*;

@RestController
@RequestMapping("/cpu")
public class CpuController {

    @GetMapping("/compute")
    public String compute(@RequestParam int threads) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(threads);

        long start = System.currentTimeMillis();

        for (int i = 0; i < threads; i++) {
            executor.submit(() -> heavyTask());
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        long end = System.currentTimeMillis();

        return "Threads: " + threads + 
               " Time Taken: " + (end - start) + " ms";
    }

    private void heavyTask() {
        long sum = 0;
        for (long i = 0; i < 1_000_000_000L; i++) {
            sum += i;
        }
    }
}
