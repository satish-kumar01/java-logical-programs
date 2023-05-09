package com.satishit.logical.fifthset;

public class CompareTwoArraysWithoutInBuiltMethod {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        boolean comparisionStatus = true;
        //Logic for comparing the two arrays
        if (a.length==b.length){
            for (int i=0;i<a.length;i++){
                if (a[i]!=b[i]){
                    comparisionStatus = false;
                    break;
                }
            }
        }else {
            comparisionStatus =false;
        }
        if (comparisionStatus){
            System.out.println("Both the arrays are equal");
        }else {
            System.out.println("The given arrays are not equal");
        }
    }
}
