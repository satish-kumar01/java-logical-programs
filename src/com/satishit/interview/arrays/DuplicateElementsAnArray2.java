package com.satishit.interview.arrays;

/*Q2)Write a Java Program To Find Duplicate Elements is an Array.
        -> There are three ways to find Duplicate Elements in the Given Array.
        1) By Using BRUTE FORCE Method
        2) By Using Set interface
        3) By Using HashTable*/
public class DuplicateElementsAnArray2 {
    public static void main(String[] args) {

        //1) By Using BRUTE FORCE Method
        //input array
        int[] a = {1,2,3,2,3,4,5,2,3};
        System.out.println("Duplicate Elements are::");
        for(int i = 0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    System.out.println(a[i]);
                }
            }
        }//End Of For Loop

        //2) By Using Set interface
        //input array
        int[] arr = {2,2,3,3,2};
        /*Set<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            if(set.add(arr[i]) == false){
                System.out.println("Duplicate Elements::"+arr[i]);
            }
        }//End Of For Loop*/

        //3) By Using HashTable
        //input array
        /*int[] arr1 = {1,2,1,1,1,2,2,3,3,4,5,5,4,4,4,4,4,4,4,4,4,4,4};
        Map<Integer, Integer> hm = new HashMap<>();
        for(int no : arr1){
            Integer count = hm.get(no);
            if(count == null){
                hm.put(no, 1);
            }
            else{
                count = count + 1;
                hm.put(no, count);
            }
        }//End Of For Loop
        System.out.println("Duplicate Elements are::");
        Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
        for(Map.Entry<Integer, Integer> me : es){
            if(me.getValue() > 1){
                System.out.println(me.getKey()+"");
            }
        }//End Of For loop*/

    }
}
