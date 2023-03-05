package com.conditionalOperatorIf;

import java.util.Scanner;

public class ConditionalOperatorIfExploration {

    public void ConditionalOperatorIf() {
        System.out.println(" ");
        System.out.println("Enter number 1, 2 or 3");

        Scanner inputNumber = new Scanner(System.in);
        int i = inputNumber.nextInt();
        if (i == 1) {
            System.out.println("you enter number 1");
        } else if (i == 2) {
            System.out.println("you enter number 2");
        } else if (i == 3) {
            System.out.println("you enter number 3");
        } else {
            System.out.println("you enter incorrect number");
        }
    }

}
