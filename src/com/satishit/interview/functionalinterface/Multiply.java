package com.satishit.interview.functionalinterface;

public class Multiply {
    public static void main(String[] args) {
        FInterface total = (a,b) -> a*b;
        System.out.println(total.multiply(30,50));
    }
}
