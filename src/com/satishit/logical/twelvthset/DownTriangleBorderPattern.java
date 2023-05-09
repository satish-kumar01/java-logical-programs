package com.satishit.logical.twelvthset;

public class DownTriangleBorderPattern {
    public static void main(String[] args) {
        for (int i=5;i>0;i--){
            //spaces
            for (int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            //stars
            for (int k=2*i-1;k>0;k--){
                if (i==5 || k==2*i-1 || k==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
