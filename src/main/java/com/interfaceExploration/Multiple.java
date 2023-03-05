package com.interfaceExploration;

public class Multiple implements MathOperation {

    @Override
    public float math(float number1, float number2) {
        return number1 *= number2;
    }
}
