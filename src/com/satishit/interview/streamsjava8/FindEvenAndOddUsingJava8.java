package com.satishit.interview.streamsjava8;

import java.util.Arrays;
import java.util.List;

/*Given a List of Integer, Find all the Even and Odd Numbers By Using Java8 Stream API.
        Input: 1,2,3,4,5,6,7,8
        Output: 2,4,6,8  */
public class FindEvenAndOddUsingJava8 {
    public static void main(String[] args) {
        //Find Even Number
        List<Integer> evenNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        evenNumbers.stream().filter(n->n%2==0).forEach(System.out::println);

        //Find Odd number
        List<Integer> oddNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        oddNumbers.stream().filter(n->n%2==1).forEach(System.out::println);
    }
}
