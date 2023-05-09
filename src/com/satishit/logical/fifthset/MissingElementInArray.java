package com.satishit.logical.fifthset;

public class MissingElementInArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        //Sum without any miss
        int sumWithoutMiss = 0;
        for (int i=1;i<=6;i++){
            sumWithoutMiss = sumWithoutMiss+i; //21
        }
        //Sum with miss for-each loop
        int sumWithMiss = 0;
        for (int e : a) {
            sumWithMiss = sumWithMiss + e; //16
        }
        System.out.println("The missing elemnet in the array is: "+(sumWithoutMiss-sumWithMiss));
    }
}
