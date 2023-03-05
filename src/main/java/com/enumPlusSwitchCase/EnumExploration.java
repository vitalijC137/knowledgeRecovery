package com.enumPlusSwitchCase;

public class EnumExploration {
    public void printMethod() {
        System.out.println(Seasons.WINTER);
        System.out.println(Seasons.SUMMER);
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.FALL);
    }

    public void loopApplication() {
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons);
        }
    }

//    Seasons seasons = new Seasons(); не можна створити об'єкт типу enum
}
