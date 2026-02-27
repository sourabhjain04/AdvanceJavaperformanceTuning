package javaDemo;
public class StackDemo {

    public static void main(String[] args) {
        System.out.println("Main started");
        methodA();
        System.out.println("Main finished");
    }

    public static void methodA() {
        int a = 10;
        methodB();
    }

    public static void methodB() {
        int b = 20;
        System.out.println("Inside methodB");
    }
}