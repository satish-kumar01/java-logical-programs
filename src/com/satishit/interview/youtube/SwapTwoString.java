package com.satishit.interview.youtube;

/*Write a program to Swap two Strings Without Using 3rd Variable.
        Input: String1 = "Satish"
               String2 = "Kumar"

        Output: String1 = Kumar
                String2 = Satish   */
public class SwapTwoString {
    public static void main(String[] args) {
        String str1 = "Satish";
        String str2 = "Kumar";
        System.out.println("First String Before Swap:: "+str1);
        System.out.println("Second String Before Swap:: "+str2);

        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());

        str1 = str1.substring(str2.length());
        System.out.println("First String After Swap:: "+str1);
        System.out.println("Second String After Swap:: "+str2);


    }
}
