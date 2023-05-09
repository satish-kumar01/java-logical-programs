package com.satishit.logical.thirteenthset;

public class DiamondBorderStarPattern {
    public static void main(String[] args) {
        //1st part
        for (int i=1;i<=5;i++){
            //Spaces
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int k=1;k<=2*i-1;k++){
                if (k==1 || k==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        //2nd part
        for (int i=4;i>=1;i--){
            //spaces
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int k=1;k<=2*i-1;k++){
                if (k==1 || k==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
