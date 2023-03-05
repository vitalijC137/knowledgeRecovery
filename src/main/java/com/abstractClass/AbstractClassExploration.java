package com.abstractClass;

public class AbstractClassExploration {

    public void executive() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cat.voice();
        cat.run(100, "plains");
        cat.sleep();
        cat.hunting();

        dog.voice();
        dog.run(200, "forest");
        dog.sleep();
        dog.hunting();

        cow.voice();
        cow.run(50, "green plains");
        cow.sleep();
    }

}
