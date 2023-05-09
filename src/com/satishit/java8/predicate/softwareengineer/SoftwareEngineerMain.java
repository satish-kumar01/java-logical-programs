package com.satishit.java8.predicate.softwareengineer;

import java.util.function.Predicate;

public class SoftwareEngineerMain {
    public static void main(String[] args) {
        SoftwareEngineer[]  list = { new SoftwareEngineer("Satish",60,false),
                                     new SoftwareEngineer("Pratik",25,true),
                                     new SoftwareEngineer("Shashank",26,true),
                                     new SoftwareEngineer("subbu",28,false),
                                     new SoftwareEngineer("Ravi",17,true)
                                   };
        Predicate<SoftwareEngineer> allowed = softwareEngineer -> softwareEngineer.age>18 && softwareEngineer.isHavingGf;
        System.out.println("The allowed members into pub are:");
        //for-each
        for (SoftwareEngineer se : list) {
            if (allowed.test(se)){
                System.out.println(se);
            }
        }
    }
}
