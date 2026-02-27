package javaDemo;
public class ThreadStateDemo {

    public static void main(String[] args) {

        Object lock = new Object();

        Runnable task = () -> {
            synchronized (lock) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                }
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }
    }
}
