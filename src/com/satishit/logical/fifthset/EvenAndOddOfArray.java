package com.satishit.logical.fifthset;

public class EvenAndOddOfArray {
    public static void main(String[] args) {
        int[] ar = {6,1,2,4,7,5,9};
        System.out.println("The below are the even numbers available in this array:");
        //we can use for loop and for-each loop, So here I am going to use for-each
        // because for-each loop is recommended for arrays concept. e=even number:
        //Logic for checking even numbers
        for (int e : ar) {
            if (e%2==0){
                System.out.print(e+" ");
            }
        }
        System.out.println();
        System.out.println("The below are the odd numbers available in this array:");
        //Logic for checking odd numbers
        for (int e : ar) {
            if (e%2!=0){
                System.out.print(e+" ");
            }

        }
    }
}
