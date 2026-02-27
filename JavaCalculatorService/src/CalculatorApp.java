import java.util.Scanner;
import java.util.concurrent.*;

public class CalculatorApp {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");

        int choice = scanner.nextInt();
 
        try (ExecutorService executor =
                 Executors.newVirtualThreadPerTaskExecutor()) {

            Future<Integer> result = executor.submit(() -> {

                System.out.println("Running in: " + Thread.currentThread());
                return switch (choice) {
                    case 1 -> calculator.add(a, b);
                    case 2 -> calculator.subtract(a, b);
                    case 3 -> calculator.multiply(a, b);
                    default -> throw new IllegalArgumentException("Invalid choice");
                };
            });

            System.out.println("Processing...");
            System.out.println("Result: " + result.get());
        }

        scanner.close();
    }
}