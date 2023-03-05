package com.inheritance;

public class InheritanceExplorationSuper {

    public static int counter;
    public String model;
    public String color;

    InheritanceExplorationSuper() {
        counter++;
    }

    public void carCreating(String model, String color) {
        this.model = model;
        this.color = color;

        System.out.println("new car created!" + "\ncounter:" + counter + "\nmodel:" + model + "\ncolor:" + color);
    }

    public void firstTestingMethod() {
        String string = "hello";
        System.out.println(string);
    }

    public void secondTestingMethod() {
        String string = "castle";
        System.out.println(string);
    }

}
