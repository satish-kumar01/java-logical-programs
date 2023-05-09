package com.satishit.interview.strings;

/*Q2)Write a Java Program to reverse a String.
        Input:  hello
        Output: olleh

        4-Ways to reverse a String
        --------------------------
        Approach-1: using toCharArray() method
        Approach-2: using charAt(int index) method
        Approach-3: using java.lang.StringBuffer class provided reverse() method
        Approach-4: using java.lang.StringBuilder class provided reverse() method

        Note: Without using reverse() method, We should go for Approach-1 and Approach-2.
        With using reverse() method, We should go for Approach-3 and Approach-4*/
public class ReverseOfString2 {
    public static void main(String[] args) {
        String str = "hello";
        //Approach-1: using toCharArray() method
        char[] charArr = str.toCharArray();
        for (int i = charArr.length-1;i>=0;i--){
            System.out.print(charArr[i]);
        }
        System.out.println("");

        //Approach-2: using charAt(int index) method
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("");

        //Approach-3: using java.lang.StringBuffer class provided reverse() method
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1.reverse());

        //Approach-4: using java.lang.StringBuilder class provided reverse() method
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println(sb2.reverse());

    }
}
