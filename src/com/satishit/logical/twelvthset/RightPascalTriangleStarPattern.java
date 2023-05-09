package com.satishit.logical.twelvthset;

public class RightPascalTriangleStarPattern {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){

            //stars first part
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=4;i>=0;i--){
            //stars second part
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
