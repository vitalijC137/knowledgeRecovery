package com.loops;

public class LoopWhileExploring {

    int variable1;
    int variable2;
    int result;

    public void InitMachine(int iterateFrom, int iterateTo) {
        variable1 = iterateFrom;
        variable2 = iterateTo;
        result = variable1;
        LoopWhile();
        System.out.println("result is - " + result + " that statement show a nature of loop \"While\"");
    }

    public void PrintMaster() {
        System.out.print(" " + result);
    }

    public int LoopWhile() {

        while (variable1 <= variable2) {
            PrintMaster();
            if (variable1 == variable2) {
                System.out.println(" ");
            }
            variable1++;
            result = variable1;
        }
        return result;
    }

}
