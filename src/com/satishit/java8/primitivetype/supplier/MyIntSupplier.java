package com.satishit.java8.primitivetype.supplier;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

//Program to generate 6 digit random OTP by using IntSupplier
public class MyIntSupplier {
    public static void main(String[] args) {
        //Normal supplier Autoboxing
        /*Supplier<Integer> s = () -> (int)(Math.random()*10);
        String otp = "";
        for (int i=0;i<6;i++){
            otp = otp + s.get();
        }*/
        IntSupplier s = () -> (int)(Math.random()*10);
        String otp = "";
        for (int i=0;i<6;i++){
            otp = otp + s.getAsInt();
        }
        System.out.println("The 6 digit OTP "+otp);
        //System.out.println("The 6 digit OTP "+otp);
        //System.out.println("The 6 digit OTP "+otp);
        //System.out.println("The 6 digit OTP "+otp);

    }
}
