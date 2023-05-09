package com.satishit.java8.methodreferences;

public class WithLambdaExpression {
    public static void main(String[] args) {
        Runnable r = () -> {
          for (int i =0;i<=10;i++){
              System.out.println("Child Thread....");
          }
        };
        Thread t = new Thread(r);
        t.start(); // Child thread started
        for (int i=0;i<=10;i++){
            System.out.println("Main Thrad..");
        }
        
    }
}
