package com.satishit.logical.tenthset;

public class SwapTwoNumberWithout3rdVariable {
    public static void main(String[] args) {
        int a=2,b=3;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a is:"+a);
        System.out.println("b is:"+b);

    }
}
