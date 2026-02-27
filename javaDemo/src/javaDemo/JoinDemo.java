package javaDemo;
public class JoinDemo {

    public static void main(String[] args) throws Exception {

        Thread t = new Thread(() -> {
            try { Thread.sleep(3000); } catch (Exception e) {}
        });

        long start = System.currentTimeMillis();

        t.start();
        t.join();

        long end = System.currentTimeMillis();
        System.out.println("Waited: " + (end - start));
    }
}
