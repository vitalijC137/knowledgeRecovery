package com.loops;

public class BubbleSorting {

    int[] intArray = {9, 3, 7, 2, 5, 10, 1, 8, 4, 6};
    int buffer;
    boolean logic;

    public void sorting() {
        for (int index = 0; index < intArray.length - 1; index++) {
            for (int index2 = 0; index2 < intArray.length - 1; index2++) {
                logic = intArray[index2] > intArray[index2 + 1];
                if (logic) {
                    buffer = intArray[index2];
                    intArray[index2] = intArray[index2 + 1];
                    intArray[index2 + 1] = buffer;
                }
            }
            System.out.print("index:" + index + " iteration:" + (index + 1) + " - ");
            for (int index3 : intArray)
                System.out.print(index3);

            System.out.println("");
        }
        System.out.println("only 6 iterations were required \n");
        for (int index4 : intArray)
            System.out.print(index4 + " ");
        System.out.println("\n");
        for (int index5 = 0; index5 < intArray.length; index5++)
            System.out.println(index5 + 1 + ":" + intArray[index5]);


    }
}

// upgrade kit (don't work yet)


   /*

     int logicCounter

      if(!logic){
        logicCounter++;
        if(logicCounter==intArray.length-1)
            break;
            else if(logic)
             logicCounter=1;

    System.out.println("\n"+"logicCounter:"+logicCounter+"\nintArray.length:"+(intArray.length-1));

    */