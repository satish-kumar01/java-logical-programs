package com.satishit.logical.eleventhset;

public class LeftRotateStringPositionBy1 {
    public static void main(String[] args) {
        String str = "Satish";
        char[] ca = str.toCharArray(); //'S','a','t','i','s','h'
        char first = ca[0];
        int size = ca.length;
        for (int i=0;i<size-1;i++){
            ca[i] = ca[i+1];
        }
        ca[size-1] = first;
        StringBuffer sb = new StringBuffer();
        // for-each
        for (char c : ca) {
            sb.append(c);
        }
        System.out.println(sb);
    }

}
