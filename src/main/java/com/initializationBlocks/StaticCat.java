package com.initializationBlocks;

public class StaticCat {

    private static String name;
    private static String breed;
    private static int age = 3;

    private int nonStaticVariable;

    static {
        name = "jack";
        breed = "siamese";
    }

    public StaticCat() {

    }

    public StaticCat(String string, String string2, int integer) {
        name = string;
        breed = string2;
        age = integer;
    }

    public void print() {
        System.out.println("name:" + name + "\nbreed:" + breed + "\nage:" + age);
    }

    public static void staticMethod() {
//        nonStaticVariable = 10; демонстрація статичного контексту - статичний метод не може посилатися на
        //не статичну змінну - (котра просто не існуватиме, бо об'єкт не оголошений).
    }
}
