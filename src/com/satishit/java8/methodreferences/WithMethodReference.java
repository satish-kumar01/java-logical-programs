package com.satishit.java8.methodreferences;

public class WithMethodReference {
    public void m1(){
        for (int i=0;i<=10;i++){
            System.out.println("Child Thread:");
        }
    }

    public static void main(String[] args) {
        WithMethodReference wmf = new WithMethodReference();
        //Runnable interface run() method internally refers WithMethodReference class m1() method.
        Runnable r = wmf::m1;
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<=10;i++){
            System.out.println("Main Thread:");
        }
    }
}
