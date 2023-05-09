package com.satishit.interview.strings;

/*12)Write a Java Program To Replace a Character with It's Occurrence in Given String.
        Input : OPENTEXT
                Note: Replace character 'T' With it's Occurrence.
        Output: OPEN1EX2*/
public class CharWithOccurrence6 {
    public static void main(String[] args) {
        String input = "deloitte"; //deloitte
        char charToReplace = 't'; //z
        //excepted output = open1ex2

        //checking character presence in string
        if (input.indexOf(charToReplace)==-1){
            System.out.println("Given character Not Available In Input String..");
            System.exit(0);
        }
        //Logic to replace char occurrence in string
        int count =1;
        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (ch == charToReplace){
                input = input.replaceFirst(String.valueOf(charToReplace),String.valueOf(count));
                count++;
            }
        }
        System.out.println(input);

        //Logic to replace char occurrence in string
        /*char[] arr = input.toCharArray(); //o p e n t e x t
        int count = 1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==charToReplace){ //o==t p==t e==t n==t t==t e==t x==t t==t
                arr[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));*/
    }
}
