package javaDemo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            executor.submit(() -> {});
        }

        executor.shutdown();

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));
    }
}
