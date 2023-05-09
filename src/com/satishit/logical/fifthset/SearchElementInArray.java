package com.satishit.logical.fifthset;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] a = {8,1,5,9,12,33,23,7,4,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number that you want to search in the array:"); //9
        int searchNumber = sc.nextInt();
        //Logic for searching the number given by the user in the array
        boolean found = false;
        for (int i=0;i<a.length;i++){
            if (searchNumber==a[i]){
                found = true;
                System.out.println(searchNumber+" is found in this array at the index "+i);
                break;
            }
        }
        if (!found){
            System.out.println(searchNumber+" is not available in the array");
        }
    }
}
