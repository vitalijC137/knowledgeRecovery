package com.initializationBlocks;

public class NotStaticDog {

    private String name;
    private String breed;
    private int age = 10;

    {
        name = "dog name";
        breed = "husky";
    }

    {
        System.out.println("hello from initialization block (class NonStaticDog)");
    }
    public NotStaticDog() {

    }

    public NotStaticDog(String string, String string2, int integer ) {
        name = string;
        breed = string2;
        age = integer;
    }

    public void print() {
        System.out.println("name:" + name + "\nbreed:" + breed + "\nage:" + age);
    }
}
