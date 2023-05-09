package com.satishit.logical.fourteenthset;

public class DiamondNumberPattern {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;
        int spaces = 3;
        //Printing rows
        for (int i=1;i<=7;i++){
            //spaces
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            if (i<=4){
                count = 2*i - 1;
                number = i;
                spaces--;

                if (i==4){
                    spaces+=2;
                }
            }else {
                count = count - 2;
                number = 8 - i;
                spaces++;
            }
            //printing stars
            for (int j=1;j<=count;j++){
                System.out.print(number);
                int middleNumPosition = count/2 + 1;
                if (j<middleNumPosition){
                    number--;
                }else {
                    number++;
                }
            }
            System.out.println();
        }
    }
}
