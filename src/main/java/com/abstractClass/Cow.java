package com.abstractClass;

public class Cow extends Animal{

    public void voice() {
        System.out.println("mu");
    }

    public void run(int distance, String location) {
        System.out.println("run to stay alive" + "\ndistance:" + distance + " location:" + location);
    }

    public void sleep() {
        System.out.println("sweat dream");
    }
}
