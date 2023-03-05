package com.generics.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WildcardsExploration {

    public void executive() {
        iterateAnimalsFirstMethod();
        iterateAnimalsSecondMethod();
    }

    public void iterateAnimals(Collection<? extends Animal> animals) {

        for(Animal animal: animals) {

            System.out.println("Ще один крок в циклі пройдений!");
        }
    }

    public void iterateAnimals2(Collection<? super Cat> animals) {

        for(int i = 0; i < animals.size(); i++) {

            System.out.println("Ще один крок в циклі пройдений!");
        }
    }

    public void iterateAnimalsFirstMethod() {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        iterateAnimals(animals);
        iterateAnimals(pets);
        iterateAnimals(cats);
        iterateAnimals(dogs);
    }

    public void iterateAnimalsSecondMethod() {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        iterateAnimals2(animals);
        iterateAnimals2(pets);
        iterateAnimals2(cats);
      //  iterateAnimals2(dogs); compilation error
    }
}
