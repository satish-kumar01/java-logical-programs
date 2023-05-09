package com.satishit.logical.eightset;

public class ReminderWithoutModulusOperator {
    public static void main(String[] args) {
        int a =9,b=4;
        int dividend = a/b;
        int reminder = a-(dividend*b);
        System.out.println("Reminder is: "+reminder);
    }
}
