package com.satishit.java8.predicate.softwareengineer;

//Program to check whether SoftwareEngineer is allowed into pub or not by using Predicate
public class SoftwareEngineer {
    String name;
    int age;
    boolean isHavingGf;

    public SoftwareEngineer(String name,int age,boolean isHavingGf){
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }
    public String toString(){
        return name+":"+age+":"+isHavingGf;
    }
}
