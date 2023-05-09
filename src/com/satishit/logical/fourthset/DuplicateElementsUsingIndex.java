package com.satishit.logical.fourthset;

public class DuplicateElementsUsingIndex {
    public static void main(String[] args) {
        int[] a = {3,4,5,3,6,4};
        for (int i=0;i<a.length;i++){
            //inner for loop
            for (int j=i+1;j<a.length;j++){ //inner for loop
                if(a[i]==a[j]){
                    System.out.println(a[i]+" is duplicated in the array");
                }
            }
        }
    }
}
