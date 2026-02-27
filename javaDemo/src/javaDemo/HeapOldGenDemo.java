package javaDemo;
import java.util.ArrayList;
import java.util.List;

public class HeapOldGenDemo {

    static List<byte[]> storage = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            storage.add(new byte[1024 * 1024]); // 1MB
            Thread.sleep(500);
        }
    }
}
