package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExploration {

    public void hashMapMaster() {

        HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1980, "John");
        hashMap.put(1981, "Jack");
        hashMap.put(1983, "Bob");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("the value for 1980 is " + hashMap.get(1980));

        System.out.println("do you have 1980?" + hashMap.containsKey(1980));

        System.out.println("do you have value John?" + hashMap.containsValue("John"));

        System.out.println("the size of current hashMap is" + hashMap.size());

        hashMap.remove(1983);

        System.out.println("the size of current hashMap is" + hashMap.size());
    }

}
