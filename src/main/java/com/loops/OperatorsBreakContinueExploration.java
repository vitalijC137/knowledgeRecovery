package com.loops;

public class OperatorsBreakContinueExploration {

    public void loopForContinue() {
        System.out.println(" ");
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " i'm executed before \"continue\" ");
            if (i > 2)
                continue;
            System.out.println(i + ") i'm executed only 2 times");
        }
    }

    public void loopForBreak() {
        System.out.println(" ");
        int ii = 2;
        for (int i = 1; i < 7; i++) {
            System.out.println(i + " i'm executed only 2 times");
            if (i == ii)
                break;
        }
    }

}
