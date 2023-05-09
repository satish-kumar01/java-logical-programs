package com.satishit.logical.eleventhset;

public class RightRotateStringPositionBy1 {
    public static void main(String[] args) {
        String str = "satish";
        char[] ca = str.toCharArray(); //{'s','a','t','i','s','h'}
        int size = ca.length;
        char last = ca[size-1];

        for (int i=size-1;i>0;i--){
            ca[i] = ca[i-1];
        }
        ca[0] = last;
        StringBuffer sb =new StringBuffer();
        //for-each
        for (char c : ca) {
            sb.append(c);

        }
        System.out.println(sb);

    }
}
