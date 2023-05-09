package com.satishit.logical.eleventhset;

public class LeftRotateStringPositionBy3 {
    public static void main(String[] args) {
        String str = "satish";
        //Logic for left rotating this string by 1 position
        char[] ca = str.toCharArray(); // {'s','a','t','i','s','h'}
        int size = ca.length;
        int n = 3;

        for (int j =1;j<=n;j++){
            char first = ca[0];

            for (int i=0;i<size-1;i++){
                ca[i] = ca[i+1];
            }
            ca[size-1] = first;

        }
        //Logic for convert charArray to String, Best approach to follow StringBuffer
        StringBuffer sb = new StringBuffer();
        //for-each
        for (char c : ca) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
