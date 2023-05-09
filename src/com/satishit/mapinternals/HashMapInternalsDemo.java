package com.satishit.mapinternals;

import java.util.HashMap;
/*
Agenda
------
    1) What is hashing concept -> HashMap internally uses HashTable to store the elements
    2) How it uses hashcode() to store the objects -> uses hashCode(key); index = hash & (n-1)
    3) How it uses equals() to store the objects -> uses the key.equals() to find the key from the nodes
    4) What is Collision? -> more than one element needs to be stored in the same index
    5) Before java 8 -> HashMap uses LinkedList = o(n)
    6) After java 8 -> HashMap uses Balanced Tree if an index reaches 8 elements = o(log n)
*/
public class HashMapInternalsDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap(); // Default capacity = 16
        map.put("Channel Name", "Satish IT"); // index = 4
        map.put("Course Name", "Java"); //index = 13
        map.put("Course Id", 0001); // index = 0
        map.put(null, 0001); // hashCode(null) = 0; and hence the index = 0
        System.out.println(map);

    }
}
