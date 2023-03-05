package com.loops;

public class LoopFor {

    int variable1;
    int variable2;
    int result;

    public void Initialization(int initFrom, int initTo) {
        variable1 = initFrom;
        variable2 = initTo;
        result = variable1;
        LoopFor();
        result = variable1;
        System.out.println("this is result - " + result + " that statement show a nature of loop \"for\"");
    }

    void PrintMaster() {
        System.out.print(" " + result);
    }

    void LoopFor() {

        for (this.variable1 = variable1; variable1<=variable2; variable1++) {
            result = variable1;
            PrintMaster();
            if (variable1 == variable2) {
                System.out.println(" ");
            }
        }
    }

}
