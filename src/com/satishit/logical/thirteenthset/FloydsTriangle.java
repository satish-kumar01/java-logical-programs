package com.satishit.logical.thirteenthset;

public class FloydsTriangle {
    public static void main(String[] args) {
        // No of rows to be printed
        int n = 5;
        // Creating and initializing variable for rows, columns and display value
        int i, j, c = 1;
        // Outer loop for rows
        for (i = 1; i <= n; i++) {
            // Inner loop for columns or numbers
            for (j = 1; j <= i; j++) {
                //Printing value to be displayed
                System.out.print(c + " ");
                //Incremeting value displayed
                c++;
            }
            //Print elements of next row
            System.out.println();
        }
    }
}
