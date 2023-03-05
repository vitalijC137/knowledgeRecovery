package com.nestedInnerClasses;

public class ElectricCar {

    private String name;
    private int weight;

    public ElectricCar(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void start() {
        System.out.println("go!");
    }

    public static class Battery {

        public void charging() {
            System.out.println("battery is charging...");
        }
    }
}
