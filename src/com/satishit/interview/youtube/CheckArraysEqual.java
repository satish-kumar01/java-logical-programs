package com.satishit.interview.youtube;

import java.util.Arrays;

/*Java program to check if two Arrays are equal or not.
        Input: a1[] = {1,2,5,4,0}
               a2[] = {1,2,5,4,0}
        Output: Two arrays are equal

        Input: a1[] = {1,2,5,4,0,2}
               a2[] = {2,4,5,0}
        Output: Two arrays are not equal */
public class CheckArraysEqual {
    public static void main(String[] args) {
        int a1[] = {1,2,5,4,0};
        int a2[] = {1,2,5,4,0};
        //Arrays.equals(a1,a2) function is used to check whether two Arrays are equal or not.
        boolean status = Arrays.equals(a1, a2);
        if (status==true){
            System.out.println("Two Arrays are equal");
        }else {
            System.out.println("Two Arrays are not equal");
        }

    }
}
