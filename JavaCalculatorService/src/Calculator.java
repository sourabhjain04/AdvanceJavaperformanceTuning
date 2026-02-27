public class Calculator {

    public int add(int a, int b) {
        simulateDelay();
        return a + b;
    }

    public int subtract(int a, int b) {
        simulateDelay();
        return a - b;
    }

    public int multiply(int a, int b) {
        simulateDelay();
        return a * b;
    }

    private void simulateDelay() {
        try {
            Thread.sleep(2000);  // simulate blocking work
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}