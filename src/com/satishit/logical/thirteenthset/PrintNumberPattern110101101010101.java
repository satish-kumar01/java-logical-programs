package com.satishit.logical.thirteenthset;

public class PrintNumberPattern110101101010101 {
    public static void main(String[] args) {
        //print rows
        for (int i=1;i<=5;i++){
            //print number of numbers
            for (int j=1;j<=i;j++){
                if (j%2==0){
                    System.out.print(0);
                }else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
