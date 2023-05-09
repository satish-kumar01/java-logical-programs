package com.satishit.logical.secondset;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of the rectangle:");
        double height = sc.nextDouble();
        System.out.println("Enter width of the rectangle:");
        double width = sc.nextDouble();
        //Logic for finding perimeter of rectangle
        System.out.println("Perimeter of rectangle is: "+2*(height+width));
    }
}
