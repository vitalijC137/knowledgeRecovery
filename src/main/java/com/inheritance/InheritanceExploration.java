package com.inheritance;

public class InheritanceExploration {

    public void executive() {


        InheritanceExplorationSuper inheritanceExplorationSuper = new InheritanceExplorationDerived();
        inheritanceExplorationSuper.carCreating("endurance1", "blue");
        InheritanceExplorationSuper inheritanceExplorationSuper1 = new InheritanceExplorationDerived();
        inheritanceExplorationSuper1.carCreating("endurance2", "red");
        InheritanceExplorationSuper inheritanceExplorationSuper2 = new InheritanceExplorationDerived();
        inheritanceExplorationSuper2.carCreating("endurance3", "yellow");

        InheritanceExplorationDerived inheritanceExplorationDerived = new InheritanceExplorationDerived();
        inheritanceExplorationDerived.firstTestingMethod();
        inheritanceExplorationDerived.secondTestingMethod();
        inheritanceExplorationDerived.carCreating("endurance4", "gray");

        InheritanceExplorationDerived inheritanceExplorationDerived1 = new InheritanceExplorationDerived();
        inheritanceExplorationDerived1.secondTestingMethod();

        InheritanceExplorationDerived inheritanceExplorationDerived2 = new InheritanceExplorationDerived();
        inheritanceExplorationDerived2.carCreating("endurance5", "white");
    }
}
