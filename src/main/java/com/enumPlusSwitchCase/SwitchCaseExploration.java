package com.enumPlusSwitchCase;

public class SwitchCaseExploration {

    public void switchCaseMethod() {

        Seasons seasons = Seasons.FALL;

        switch (seasons) {
            case WINTER:
                System.out.println("it's winter! Christmas time!"); break;
            case SUMMER:
                System.out.println("it's summer!"); break;
            case SPRING:
                System.out.println("it's spring!"); break;
            case FALL:
                System.out.println("it's fall! Halloween time"); break;

        }
    }
}
