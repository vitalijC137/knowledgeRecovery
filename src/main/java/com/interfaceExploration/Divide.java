package com.interfaceExploration;

public class Divide implements MathOperation {

    @Override
    public float math(float number1, float number2) {
        return number1 /= number2;
    }
}
