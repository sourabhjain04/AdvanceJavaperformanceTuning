package com.example.demo;
class ThreadDemo extends Thread {
   ThreadDemo( ) {
   }
   public void run() {
      System.out.println("Thread Name: " + Thread.currentThread().getName() 
         + ", Thread Priority: " +Thread.currentThread().getPriority());
      for(int i = 1000000000; i > 0; i--) {
         System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i); 
      }
      try {
         Thread.sleep(50);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   public void start () {
      super.start();
   }
}
public class TestThread {
   public static void main(String args[]) {
      ThreadDemo thread1 = new ThreadDemo();
      ThreadDemo thread2 = new ThreadDemo();
      ThreadDemo thread3 = new ThreadDemo();
      thread1.setPriority(Thread.MAX_PRIORITY);
      thread2.setPriority(Thread.MIN_PRIORITY);
      thread3.setPriority(Thread.NORM_PRIORITY);
      thread1.start();	  
      thread2.start();
      thread3.start();
   }
}