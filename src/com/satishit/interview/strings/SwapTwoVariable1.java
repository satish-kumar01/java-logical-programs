package com.satishit.interview.strings;

/*Q1)Write a Java Program to Swap two variables values without using Third Variable.
       Input:  x = 10, y = 20
       Output: x = 20, y = 10
*/
public class SwapTwoVariable1 {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        System.out.println("Before Swaping::x = "+ x + " and y = "+ y);
        //Logic for Swapping
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After  Swaping::x = "+ x + " and y = "+ y);
    }
}
