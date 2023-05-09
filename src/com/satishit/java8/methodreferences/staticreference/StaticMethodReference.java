package com.satishit.java8.methodreferences.staticreference;

public class StaticMethodReference {
    //static method
    public static void m1(){
        for (int i=0;i<=10;i++){
            System.out.println("Child Thread..");
        }
    }
    //In the above example Runnable interface run() method referring to WithMethodReference class static method m1().
    public static void main(String[] args) {
        Runnable r = StaticMethodReference::m1;
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<=10;i++){
            System.out.println("Main Thread...");
        }
    }

}
