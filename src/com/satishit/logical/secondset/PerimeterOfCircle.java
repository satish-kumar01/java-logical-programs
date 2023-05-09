package com.satishit.logical.secondset;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius:");
        double radius = sc.nextDouble();
        //Logic for printing the perimeter of the circle
        System.out.println("Perimeter of the circle having radius "+radius+" is :"+(2*Math.PI*radius));

    }
}
