package com.arrayOfObjects;

public class ArrayOfObjectsGeneralExploration {

    public void executive() {
        ArrayOfObjectsExploration arrayOfObjectsExploration = new ArrayOfObjectsExploration();
        arrayOfObjectsExploration.executive();

        ObjectsCounter objectsCounter = new ObjectsCounter("first name");
        System.out.println(objectsCounter.getCounter());
        objectsCounter.findOutTheCurrentCount();
        objectsCounter = new ObjectsCounter("second name");
        System.out.println(objectsCounter.getCounter());
        objectsCounter.findOutTheCurrentCount();
        ObjectsCounter objectsCounter1 = new ObjectsCounter("third name");
        System.out.println(objectsCounter1.getCounter());
        objectsCounter1.findOutTheCurrentCount();
        ObjectsCounter[] objectsCountersArray = new ObjectsCounter[11];
        objectsCountersArray[0] = new ObjectsCounter("a");
        objectsCountersArray[1] = new ObjectsCounter("b");
        objectsCountersArray[2] = new ObjectsCounter("c");
        objectsCountersArray[3] = new ObjectsCounter("d");
        objectsCountersArray[4] = new ObjectsCounter("e");
        objectsCountersArray[5] = new ObjectsCounter("f");
        objectsCountersArray[6] = new ObjectsCounter("g");
        objectsCountersArray[7] = new ObjectsCounter("h");
        objectsCountersArray[8] = new ObjectsCounter("i");
        objectsCountersArray[9] = new ObjectsCounter("j");
        objectsCountersArray[10] = new ObjectsCounter("k");

        for (int i = 0; i < objectsCountersArray.length; i++) {
            System.out.println(objectsCountersArray[i].newObjectName);
        }

        ObjectsCounter objectsCounter2 = new ObjectsCounter("fourth name");
        System.out.println(objectsCounter2.getCounter());
        objectsCounter2.findOutTheCurrentCount();
    }
}
