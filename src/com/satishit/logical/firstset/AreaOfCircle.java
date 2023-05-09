package com.satishit.logical.firstset;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double raidus = sc.nextDouble();
        // Logic for calculating the area of the circle
        System.out.println("Area of the circle having the given radius "+raidus+" is:"+(Math.PI*raidus*raidus));
    }
}
