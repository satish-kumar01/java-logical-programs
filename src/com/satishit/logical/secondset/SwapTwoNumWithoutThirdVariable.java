package com.satishit.logical.secondset;

public class SwapTwoNumWithoutThirdVariable {
        public static void main(String[] args){
            int x = 10;
            int y = 20;
            System.out.println("Before Swaping::x = "+ x + " and y = "+ y);
            //Logic for Swapping
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("After  Swaping::x = "+ x + " and y = "+ y);
        }

}
