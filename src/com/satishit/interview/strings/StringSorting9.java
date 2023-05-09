package com.satishit.interview.strings;

import java.util.Arrays;
import java.util.Collections;

/*Q9)Write a Java Program to Sort an Array of Strings in Ascending And Descending Order Using Arrays.sort().(Not)
        Sort array in Ascending order:-
        Input:-  {"satish","Rahul","Rohit","Deepak","Ganesh"}
        Output:- [Deepak, Ganesh, Rahul, Rohit, satish]

        Sort array in Descending order:-
        Input:-  {"satish","Rahul","Rohit","Deepak","Ganesh"}
        Output:- [satish, Rohit, Rahul, Ganesh, Deepak]*/
public class StringSorting9 {
    public static void main(String[] args){
        String arr[] = {"satish","Rahul","Rohit","Deepak","Ganesh"};
        //Sort array in ascending order
        Arrays.sort(arr);
        System.out.printf("Modified Array::\n%s\n\n",Arrays.toString(arr));
        //Sort array in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.printf("Modified Array::\n%s\n\n",Arrays.toString(arr));
    }

}
