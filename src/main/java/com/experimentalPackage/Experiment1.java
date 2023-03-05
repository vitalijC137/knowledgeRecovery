package com.experimentalPackage;

public class Experiment1 {

    static int testVar;

    public static int Calculator(int a, int b) {
        int result = a + b;
        Initializator(result);
        return result;
    }

    public static void Initializator(int result) {
        int result2 = result;
        System.out.println(result2);
        testVar += result2;
        System.out.println("this is testVar - " + testVar);

//        Scanner mijScanner = new Scanner(System.in);
//        System.out.println(mijScanner.nextLine());


    }
// дослідження статичних змінних



    /*  DoSomethingGood doSomethingGood = new DoSomethingGood();
        doSomethingGood.Calculator(100, 300);
//        doSomethingGood.Calculator1(101, 51);

        DoSomethingGood doSomethingGood1 = new DoSomethingGood();
        doSomethingGood1.Calculator(33, 33);

        DoSomethingGood.Calculator(17, 17);
        DoSomethingGood.Calculator(25, 25);

        DoSomethingGood doSomethingGood2 = new DoSomethingGood();
        doSomethingGood2.Calculator(25, 25);

        DoSomethingGood.Calculator(3, 3);

        DoSomethingGood.Calculator(300, 93);

 менй модуль
     */



}
