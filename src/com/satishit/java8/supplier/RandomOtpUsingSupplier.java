package com.satishit.java8.supplier;

import java.util.function.Supplier;

// Write a Supplier to supply 6-digit(Coming from 0to9) Random OTP
public class RandomOtpUsingSupplier {
    public static void main(String[] args) {
        Supplier<String> otps = () -> {
          String otp ="";
          for (int i=1;i<=6;i++){
              //Using Type casting
              otp = otp + (int)(Math.random()*10); //10 means 0 to 9
          }
          return otp;
        };
        System.out.println(otps.get());
        //System.out.println(otps.get());
        //System.out.println(otps.get());
        //System.out.println(otps.get());
    }

}


