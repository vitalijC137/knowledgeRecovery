package com.varioustMethods;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList1 {

    List<String> list;
    String[]stringsArray;
   public ArraysAsList1(String ... strings) {
       stringsArray = new String[strings.length];
       list = Arrays.asList(strings);
       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
       }
    }
}
