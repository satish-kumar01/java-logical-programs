package com.satishit.designpattern.creationalpattern.builderdesignpattern;

public class MainClass {
    public static void main(String[] args) {

        //create object of required home builder
        EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();

        //create object of director that will keep an eye on your builder
        Director director = new Director(earthQuakeResistantBuilder);

        director.manageRequiredHomeConstruction();
        Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();

        System.out.println(homeConstructedAtTheEnd);
        System.out.println(homeConstructedAtTheEnd.floor);
    }
}
