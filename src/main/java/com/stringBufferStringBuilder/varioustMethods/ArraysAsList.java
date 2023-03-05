package com.stringBufferStringBuilder.varioustMethods;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

    public void arraysAsListExecutive() {
        ArraysAsListMethod();
        ArrayAsListMethod2();
        ArrayAsListMethod3();
        ArrayAsListMethod4();
    }
    public void ArraysAsListMethod() {
        String[] strings = {"first", "second", "third"};
        List<String> list = Arrays.asList(strings);
        System.out.println(list);
        strings[0] = "wordInstead";
        System.out.println(list);
    }

    public void ArrayAsListMethod2() {
        String[] strings = {"first", "second", "third"};
        List<String> list = Arrays.asList(strings);
        System.out.println(list);
        list.set(0, "wordInstead");
        System.out.println(Arrays.toString(strings));
    }

    public void ArrayAsListMethod3() {
        Object[] objects = {new Object(), new Object(), new Object()};
        List<Object> list = Arrays.asList(objects);
        System.out.println(objects[0] == list.get(0));
    }

    public void ArrayAsListMethod4() {
        List<ArraysAsList1> list = Arrays.asList(new ArraysAsList1("a", "b", "c"),
                new ArraysAsList1("d", "e", "f"),
                new ArraysAsList1("g", "h", "i"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        //in this method used varArgs
    }
}
