package javaDemo;
import java.util.ArrayList;
import java.util.List;

public class GCComparisonDemo {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            List<byte[]> list = new ArrayList<>();

            for (int i = 0; i < 3000; i++) {
                list.add(new byte[1024 * 100]);
            }

            Thread.sleep(100);
        }
    }
}
