package com.nestedInnerClasses;

public class Bicycle {

    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("go!");
    }

    public class SteeringWheel {

        public void right() {
            System.out.println("SteeringWheel turn write");
        }

        public void left() {
            System.out.println("SteeringWheel turn left");
        }

    }

    public class Seat {

        public void up() {
            System.out.println("Seat up");
        }

        public void down() {
            System.out.println("Seat down");
        }

    }
}

