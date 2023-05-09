package com.satishit.interview.streamsjava8;

import java.util.Arrays;

public class SortListOfString {
    public static void main(String[] args) {
        String[] strArray = {"Jan","Feb","Mar","Apr","May","Jun","july","aug","Sep","Oct","nov","Dec"};
        Arrays.sort(strArray);

        for (String newString : strArray) {
            System.out.println(newString+" ");
        }
        System.out.println(" ");
        System.out.println("=================================================");
        Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);
        for (String newString : strArray) {
            System.out.println(newString+" ");
        }
    }
}
