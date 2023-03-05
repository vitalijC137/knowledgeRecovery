package com.abstractClass;

public class Cat extends Animal {

    public void voice() {
        System.out.println("mew");
    }

    public void run(int distance, String location) {
        System.out.println("run to stay alive" + "\ndistance:" + distance  + " location:" + location);
    }

    public void sleep() {
        System.out.println("sweet dream");
    }

    @Override
    public void hunting() {
        System.out.println("cat can do it for survival");
    }

}
