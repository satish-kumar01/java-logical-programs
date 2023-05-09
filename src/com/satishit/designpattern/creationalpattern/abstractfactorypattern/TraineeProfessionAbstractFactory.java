package com.satishit.designpattern.creationalpattern.abstractfactorypattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory{

    @Override
    Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null) {
            return null;
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new Teacher();
        }
        return null;
    }
}
