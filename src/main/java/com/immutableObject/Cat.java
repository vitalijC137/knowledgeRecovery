package com.immutableObject;

public final class Cat {

    private String breed;
    private String eyeColor;

    public Cat(String breed, String eyeColor) {
        this.breed = breed;
        this.eyeColor = eyeColor;
        System.out.println("New cat created! It's " + this.breed + " and has " + this.eyeColor + " eyes!");
    }

    public Cat setBreed(String breed) {
        Cat cat = new Cat(breed, this.eyeColor);
        return cat;
    }

    public Cat setEyeColor(String eyeColor) {
        Cat cat = new Cat(this.breed, eyeColor);
        return cat;
    }
}
