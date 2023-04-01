package com.immutableObject;

public class ImmutableObjectExploration {

    public void executive() {

        Cat first = new Cat("Bengal", "green");
        Cat second = first.setBreed("Sphynx");
        Cat third = first.setEyeColor("blue");
        Cat fourth = first.setBreed("Sphynx");
        Cat fifth = third.setEyeColor("red");
    }
}
