package com.interfaceExploration;

public class Calculation {
    MathOperation mathOperation;

    public void calculationMaster(float number1, String operator, float number2) {

        switch (operator) {
            case "+":
                mathOperation = new Add(); break;
            case "-":
                mathOperation = new Subtract(); break;
            case "*":
                mathOperation = new Multiple(); break;
            case "/":
                mathOperation = new Divide(); break;
        }
        System.out.println(mathOperation.math(number1, number2));
    }
}
