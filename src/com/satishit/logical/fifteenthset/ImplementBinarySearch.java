package com.satishit.logical.fifteenthset;

import java.util.Scanner;

public class ImplementBinarySearch {
    public static void main(String[] args) {
        //Binary search is not performed for unsorted array
        int[] ar = {1,3,5,6,9,12,14,19,21,22,23};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search"); //6
        int searchNum = sc.nextInt();
        //Logic for binary search
        int low = 0;
        int high = ar.length-1;
        int mid = 0;

        while (low <= high){
            mid = (low+high)/2;
            if (searchNum==ar[mid]){
                System.out.println("Given number is available in the array at the index: "+mid);
                break;
            } else if (searchNum<ar[mid]) {
                high = mid-1;
            } else if (searchNum > ar[mid]) {
                low = mid + 1;
            }
        }
        if (low > high){
            System.out.println("Given number is not available in the array");
        }
    }
}
