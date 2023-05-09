package com.satishit.designpattern.creationalpattern.prototypepattern;

public class ProtoTypePatternMainClass {
    public static void main(String[] args) {

        ProfessionCache.loadProfessionCache();

        Profession docProfession1 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession1);

        Profession engProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);

        Profession teachProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(teachProfession);

        Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession2);

    }
}
