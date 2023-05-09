package com.satishit.logical.tenthset;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:"); //9
        double firstNumber = sc.nextDouble();
        System.out.println("Enter any operator from(+,-,*,/):"); //+
        char operator = sc.next().charAt(0);
        System.out.println("Enter second number:"); //3
        double secondNumber = sc.nextDouble();
        //Logic for performing calculator operations
        double result = 0;
        boolean status = true;
        switch (operator){
            case '+': result = firstNumber+secondNumber;
                      break;
            case '-': result = firstNumber-secondNumber;
                      break;
            case '*': result = firstNumber*secondNumber;
                      break;
            case '/': result = firstNumber/secondNumber;
                      break;
            default:
                System.out.println("Invalid operator given by the user,hence operation cannot be performed");
                status = false;
        }
        if (status){
            System.out.println(firstNumber+""+operator+""+secondNumber+" = "+result);
        }
    }
}
