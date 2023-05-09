package com.satishit.java8.predicate.predicatejoining;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullEmptyStringsFromList {
    //Predicate Example to remove null values and empty strings from the given list
    public static void main(String[] args) {
        String[] names = {"Satish","",null,"Ravi","","Shine",null};
        Predicate<String> p = s -> s != null && s.length() != 0;
        ArrayList<String> list = new ArrayList<String>();
        // for each
        for (String s : names) {
            if (p.test(s)){
                list.add(s);
            }
        }
        System.out.println("The list of valid strings: "+list);
    }
}
