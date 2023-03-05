package com.constructor;

public class ConstructorExploration {

    public void executive() {
        Constructor constructor = new Constructor("Canada");
        System.out.println("first country:" + constructor.firstCountry);
        Constructor constructorExploration1 = new Constructor("Canada", "USA");
        System.out.println("second country:" + constructorExploration1.secondCountry +
                "\nthird country:" + constructorExploration1.thirdCountry);
    }
}
