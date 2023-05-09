package com.satishit.logical.twelvthset;

import java.util.Scanner;

public class CheckGivenNumberIsPowerOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        //Logic for checking whether the given number is a power of 4
        boolean power = false;
        while (num>0){
            int reminder = num%4; //64%4 = 0
            if (reminder!=0){
                break;
            }
            num = num/4;  //16
            if (num==1){
                System.out.println("Given number is a power of 4");
                power = true;
                break;
            }
        }
        if (!power){
            System.out.println("Given number is not a power of 4");
        }

    }
}
