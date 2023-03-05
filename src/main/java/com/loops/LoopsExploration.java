package com.loops;

public class LoopsExploration {

    public void executive() {
        LoopWhileExploring loopExploring = new LoopWhileExploring();
        loopExploring.InitMachine(1, 10);

        LoopDoWhileExploration loopDoWhileExploration = new LoopDoWhileExploration();
        loopDoWhileExploration.Initialization(1, 10);

        LoopFor loopFor = new LoopFor();
        loopFor.Initialization(1, 10);

        OperatorsBreakContinueExploration operatorsBreakContinueExploration = new OperatorsBreakContinueExploration();
        operatorsBreakContinueExploration.loopForContinue();
        operatorsBreakContinueExploration.loopForBreak();

        LoopForEachExploration loopForEachExploration = new LoopForEachExploration();
        loopForEachExploration.LoopForEach();

        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.sorting();

        LoopFillingExploration loopFillingExploration = new LoopFillingExploration();
        loopFillingExploration.loopForFilling();
        loopFillingExploration.loopForEachFilling();
        loopFillingExploration.loopForFillingWithArrayList();
        loopFillingExploration.loopForEachFillingWithArrayList();
    }
}
