package com.satishit.interview.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*11)Write a Java Program to find First non-repeating character in given String.
        Input:  simplest
        Output:  i
      There are two Approach to Solve this problem
            Approach-1: Without using Collections
            Approach-2: Using Java8 */
public class FirstNonRepeatedCharacter5 {
    public static void main(String[] args) {
        //Approach-1: Without using Collections
        String input = "stress simplest";
        /*for (int i=0;i<input.length();i++){

            boolean unique = true;

            for (int j=0;j<input.length();j++){
                if (i != j && input.charAt(i) == input.charAt(j)){
                    unique =false;
                }
            }
            if (unique){
                System.out.println(input.charAt(i));
                break;
            }
        }*/
        //Approach-2: Using Collections
        Map<Character,Long> map = input.chars().mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstNonRepeat =
                map.entrySet().stream()
                        .filter((e) -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();

        /*Optional<Character> firstRepeat =
                map.entrySet().stream()
                        .filter((e) -> e.getValue() > 1).map(Map.Entry::getKey).findFirst();*/

        firstNonRepeat.ifPresent(System.out::println);

        //System.out.println(firstRepeat.orElse(null));
    }
}
