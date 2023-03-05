package com.varArgs;

public class VarArgsExploration {

    public void executive() {
        adding(1, 2);
        adding(1, 2, 3);
        adding2(100, 1, 2, 3, 4, 5);
        adding3();
    }

    public void adding(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            System.out.println("adding " + numbers[i] + ": get " + sum);
        }
    }
    public void adding2(int firstNumber, int ...secondNumber) {
        int sum = 0;
        for (int i = 0; i < secondNumber.length; i++) {
            sum = firstNumber + secondNumber[i];
            System.out.println(firstNumber + " adding " + secondNumber[i] + ": get " + sum);
        }
    }
    public void adding3(int ... varArgs) {
        System.out.println("arguments don't added");
    }

}
