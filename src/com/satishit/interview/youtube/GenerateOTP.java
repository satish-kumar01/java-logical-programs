package com.satishit.interview.youtube;

/*Write a Java program to Generate OTP one time Password.
        Output: OTP: 7588   */
public class GenerateOTP {
    public static void main(String[] args) {
        int randomNo = (int)(Math.random()*9000)+1000;
        String otp = String.valueOf(randomNo);
        System.out.println("OTP: "+otp);
    }
}
