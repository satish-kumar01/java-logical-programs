package com.satishit.logical.secondset;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        double height = sc.nextDouble();
        System.out.println("Enter the height of the rectangle:");
        double width = sc.nextDouble();
        //Logic for finding the area of rectangle
        System.out.println("The area of rectangle is: "+(height*width));

    }
}
