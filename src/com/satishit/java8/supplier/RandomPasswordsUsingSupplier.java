package com.satishit.java8.supplier;

import java.util.function.Supplier;
/*
Rules:
1) Length should be 8-characters
2) 2,4,6,8 places only digits
3) 1,3,5,7 places only Upper case alphabet synbols (+ @ # $)*/
public class RandomPasswordsUsingSupplier {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String pwd = "";
            //let me write a supplier to generate random digit
            Supplier<Integer> digit = () -> (int)(Math.random()*10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$"; //Charcater 0 to 28
            //Writing Supplier to generate character
            Supplier<Character> c = () -> symbols.charAt((int)(Math.random()*29));
            for (int i=1;i<=8;i++){
                if (i%2==0){
                    pwd = pwd + digit.get();
                }else {
                    pwd = pwd + c.get();
                }
            }
            return pwd;
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }

}



