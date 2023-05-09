package com.satishit.logical.fifteenthset;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayListAscendingAndDescendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(7);
        list.add(1);
        list.add(3);

        //Default order
        System.out.println("Default order: "+list);
        //Ascending order
        Collections.sort(list);
        System.out.println("Ascending order: "+list);
        // Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order: "+list);

    }
}
