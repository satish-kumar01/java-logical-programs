package com.satishit.interview.arrays;

/*Q6)Write a Java Program to Remove Specific Element Of the Given Array.
        Input:  {10,20,30,40,50}
        Output: 10,20,40,50*/

public class RemoveSpecificElement6 {
    public static void main(String[] args) {
        //Input Array
        int[] a = {10,20,30,40,50};
        int del_element = 30;
        for(int i = 0; i<a.length; i++){
            if(del_element == a[i]){
                for(int j = i; j<a.length-1; j++){
                    a[j] = a[j+1];
                }
                break;
            }
        }//End of For Loop
        for(int i = 0; i<a.length-1; i++){
            System.out.println(a[i]+" ");
        }
    }
}
