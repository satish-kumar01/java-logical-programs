package com.satishit.logical.thirdset;

public class ReverseString01 {
    public static void main(String[] args){
        String input = "hello";
        System.out.println("Original String::"+input);
        String reverse = "";
        for(int i = input.length()-1; i>=0; i--){
            reverse = reverse + input.charAt(i);
        }
        System.out.println("Reverse String ::"+reverse);
    }

}
