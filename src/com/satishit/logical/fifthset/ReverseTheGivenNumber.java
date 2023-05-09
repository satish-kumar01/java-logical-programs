package com.satishit.logical.fifthset;

import java.util.Scanner;

public class ReverseTheGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:"); //1234
        int num = sc.nextInt();
        //Logic for reversing the number
        int reversedNum = 0;
        while (num>0){
            int reminder = num%10;
            reversedNum = (reversedNum*10) + reminder;
            num = num/10;
        }
        System.out.println("The reversed number is: "+reversedNum);
    }
}
