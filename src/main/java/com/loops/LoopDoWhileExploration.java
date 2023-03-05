package com.loops;

public class LoopDoWhileExploration {

    int variable1;
    int variable2;
    int result;

    public void Initialization(int initFrom, int initTo) {
        variable1 = initFrom;
        variable2 = initTo;
        result = variable1;
        LoopMaster();
        System.out.println("result is - " + result + " that statement show a nature of loop \"Do...While\"");
    }

    void PrintMaster() {
        System.out.print(" " + result);
    }

    void LoopMaster() {

        do {
            PrintMaster();
            if (variable1 == variable2) {
                System.out.println(" ");
            }
            variable1++;
            result = variable1;
        } while (variable1 <= variable2);
    }

}
