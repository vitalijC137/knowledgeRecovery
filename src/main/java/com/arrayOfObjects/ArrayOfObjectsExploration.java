package com.arrayOfObjects;

public class ArrayOfObjectsExploration {
    ArrayOfObjects1[] arrayOfObjects1 = new ArrayOfObjects1[3];
    public void executive() {
        arrayOfObjects1[0] = new ArrayOfObjects1("first");
        arrayOfObjects1[1] = new ArrayOfObjects1("second");
        arrayOfObjects1[2] = new ArrayOfObjects1("third");

        for (int i = 0; i < arrayOfObjects1.length; i++) {
            System.out.println(arrayOfObjects1[i].name);
        }
    }
}
