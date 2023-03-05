package com.abstractClass;

abstract class Animal {

    abstract void voice();

    abstract void run(int distance, String location);

    abstract void sleep();

    void hunting() {
        System.out.println("do it for survival");
    }

}
