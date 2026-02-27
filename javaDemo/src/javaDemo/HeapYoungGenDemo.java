package javaDemo;
public class HeapYoungGenDemo {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            createObjects();
            Thread.sleep(100);
        }
    }

    public static void createObjects() {
        for (int i = 0; i < 10000; i++) {
            String s = new String("MemoryTest" + i);
        }
    }
}
