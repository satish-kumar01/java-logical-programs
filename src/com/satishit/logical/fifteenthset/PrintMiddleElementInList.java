package com.satishit.logical.fifteenthset;

import java.util.ArrayList;

public class PrintMiddleElementInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);  //0
        list.add(5);  //1
        list.add(7);  //2
        list.add(3);  //3
        list.add(8);  //4
        list.add(2);  //5
        list.add(4);  //6
        //list.add(6);  //7

        if (list.size()%2!=0){
            outer:for (int i=0;i<list.size();i++){
                inner:for (int j=list.size()-1-i;j>=0;j--){
                    if (i==j){
                        System.out.println("Middle elemnet in the list is: "+list.get(i));
                        break outer;
                    }else {
                        break;
                    }
                }
            }
        }else {
            System.out.println("There are even numbers in the Arraylist. Hence middle element can't be found.");
        }
    }
}
