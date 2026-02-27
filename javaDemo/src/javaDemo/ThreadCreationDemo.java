package javaDemo;
public class ThreadCreationDemo {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            Thread t = new Thread(() -> {});
            t.start();
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));
    }
}
