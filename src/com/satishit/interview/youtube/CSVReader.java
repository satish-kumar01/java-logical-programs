package com.satishit.interview.youtube;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Write a java program to read a CSV file into an Array.
public class CSVReader {
    public static void main(String[] args) /*throws FileNotFoundException*/ {
        String path = "C:\\Users\\satish.kumar7\\Downloads\\organizations-100\\organizations-100.csv";
        String line="";

        try {
            BufferedReader bufferedReader  = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine())!=null){
                String[] values = line.split(",");
                System.out.println("Country : "+values[4]+ " "+"Founded"+values[6]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
