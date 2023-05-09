package com.satishit.logical.fourthset;

import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit number:");
        //int num = sc.nextInt();
        long num = sc.nextLong();
        //Logic for counting the number of even digits and number of odd digits in the given number
        int evenCount=0;
        int oddCount=0;

        while (num > 0) {
            //int reminder = num%10;
            long reminder = num%10;

            if (reminder%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("The number of even digits in the given number is: "+evenCount);
        System.out.println("The number of odd digits in the given number is: "+oddCount);
    }

}
