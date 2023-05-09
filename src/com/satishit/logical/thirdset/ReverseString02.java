package com.satishit.logical.thirdset;

public class ReverseString02 {
    public static void main(String[] args) {
        String str = "Alexander";

        char[] ca = str.toCharArray();
        int size = ca.length;
        String reversedString = "";
        for (int i=size-1;i>=0;i--){
            reversedString=reversedString+ca[i];
        }
        System.out.println(reversedString);
    }

}
