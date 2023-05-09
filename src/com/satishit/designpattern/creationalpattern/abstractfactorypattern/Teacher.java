package com.satishit.designpattern.creationalpattern.abstractfactorypattern;

public class Teacher implements Profession{

    @Override
    public void print() {
        System.out.println("InPrint of Teacher class");
    }
}
