package com.inheritance;

public class InheritanceExplorationDerived extends InheritanceExplorationSuper {

    @Override
    public void firstTestingMethod() {
        String string = "hello world";
        System.out.println(string);
    }

    @Override
    public void secondTestingMethod() {
        super.secondTestingMethod();
        String string = "castle blue rock";
        System.out.println(string);
    }

}
