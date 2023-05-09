package com.satishit.designpattern.creationalpattern.singletonpattern;

import com.satishit.designpattern.creationalpattern.factorypattern.Teacher;

public class MainClass {
    public static void main(String[] args) {
        SingletonClass singletonObject1 = SingletonClass.getInstance();
        singletonObject1.simpleMethod();

        SingletonClass singletonObject2 = SingletonClass.getInstance();
        singletonObject2.simpleMethod();

        /*Teacher teacher1 = new Teacher();
        System.out.println(teacher1);

        Teacher teacher2 = new Teacher();
        System.out.println(teacher2);*/
    }
}
