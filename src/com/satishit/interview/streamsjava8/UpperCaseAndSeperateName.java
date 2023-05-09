package com.satishit.interview.streamsjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Convert all the Country names to Upper case and Seperate name By Using Java8
        Input: "India","USA","Canada","Japan","France","Italy","Germany"
        Output: INDIA,USA,CANADA,JAPAN,FRANCE,ITALY,GERMANY*/
public class UpperCaseAndSeperateName {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("India","USA","Canada","Japan","France","Italy","Germany");
        String str = countries.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(str);
    }
}
