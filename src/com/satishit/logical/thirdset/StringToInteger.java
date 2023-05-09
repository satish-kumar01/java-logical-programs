package com.satishit.logical.thirdset;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "9";
        System.out.println(str+1);
        //int num = Integer.parseInt(str);
        int num = Integer.valueOf(str);
        System.out.println(num+1);
    }
}
