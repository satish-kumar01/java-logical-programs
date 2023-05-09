package com.satishit.designpattern.creationalpattern.abstractfactorypattern;

import java.util.Optional;

public class FactoryPatternMainClass {
    public static void main(String[] args) {
        //first get factory instance from factory of factory class, if u want trainees.
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
        Profession engg = abstractFactory.getProfession("Engineer");
        engg.print();

        /*Optional<String> vehicle = Optional.of("Car");
        vehicle = Optional.ofNullable(null);
        System.out.println(""+vehicle.map(s -> "This is" + s + "!").orElse("this is not a car"));*/
    }
}
