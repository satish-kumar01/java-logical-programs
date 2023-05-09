package com.satishit.designpattern.creationalpattern.abstractfactorypattern;

//This is factory of factory, gives u factory instance which will in true give u required class object
public class AbstractFactoryProducer {

    public static AbstractFactory getProfession(boolean isTrainee){
        if (isTrainee){
            return new TraineeProfessionAbstractFactory();
        }
        else {
            return new ProfessionAbstractFactory();
        }
    }
}
