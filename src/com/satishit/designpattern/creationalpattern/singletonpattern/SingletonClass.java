package com.satishit.designpattern.creationalpattern.singletonpattern;

public class SingletonClass {

    private static SingletonClass singletonInstance = new SingletonClass();

    private SingletonClass() {
    }

    //get the only object available
    public static SingletonClass getInstance(){
        return singletonInstance;
    }
    public void simpleMethod(){
        System.out.println("hashcode of singleton object" + singletonInstance);
    }
}
