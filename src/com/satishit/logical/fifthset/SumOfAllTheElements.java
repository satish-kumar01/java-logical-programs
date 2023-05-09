package com.satishit.logical.fifthset;

public class SumOfAllTheElements {
    public static void main(String[] args) {
        int[] ar = {6,3,4,2,7,9,5};
        int sum = 0;
        //For Each Loop
        for (int e : ar) {
            sum=sum+e;
        }
        System.out.println("The sum of all the elements in the given array is: "+sum);
    }
}
