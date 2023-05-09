package com.satishit.interview.youtube;

/* Replace a Character at a Specific index in a String in Java.
        Input: "Eelcome to java"
        Output: "Welcome to java"    */
public class ReplaceSpecificIndex {
    public static void main(String[] args) {
        String str = "Eelcome to java";
        int index = 0;
        char ch = 'W';
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index,ch);
        System.out.println(sb);
    }
}
