package com.abstractClass;

public class Dog extends Animal {

    public void voice() {
        System.out.println("wof");
    }

    public void run(int distance, String location) {
        System.out.println("run to stay alive" + "\ndistance:" + distance + " location:" + location);
    }

    public void sleep() {
        System.out.println("sweet dream");
    }

    @Override
    public void hunting() {
        System.out.println("dog can hunting for survival");
    }
}
