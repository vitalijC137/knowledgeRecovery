package com.interfaceExploration;

public class InterfaceExploration {

    public void executive() {

        Calculation calculation = new Calculation();
        calculation.calculationMaster(5, "+", 3);
        calculation.calculationMaster(8, "/", 2);
        calculation.calculationMaster(8, "-", 3);
        calculation.calculationMaster(3, "*", 5);
        calculation.calculationMaster(5, "/", 2);
        FunctionalInterfaceExploration functionalInterfaceExploration = new FunctionalInterfaceExploration();
        functionalInterfaceExploration.executive();
    }
}
