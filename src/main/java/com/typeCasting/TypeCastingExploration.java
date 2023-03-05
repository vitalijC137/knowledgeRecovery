package com.typeCasting;

public class TypeCastingExploration {

    public void TypeCasting() {

        int integer;
        int integer2 = 20;
        int integer3;
        long longNumber = 1000L;
        double doublePrecision = 1000.2000;

        System.out.println(" ");

        integer = (int) longNumber;
        System.out.println(integer);

        longNumber = integer2;
        System.out.println(longNumber);

        integer3 = (int) doublePrecision;
        System.out.println(integer3);

    }

}
