package com.generics;

import java.util.ArrayList;
import java.util.List;

public class RawTypes {

    public void rawTypesMethod() {
        List rawList = new ArrayList();
        List<String> generalizedList = new ArrayList<>();
        rawList = generalizedList;
        rawList.add("some words");
        String string = generalizedList.get(0);
        System.out.println(string);
    }

}
