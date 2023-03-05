package com.collection;

import java.util.HashSet;

public class SetExploration {

    public void hashSetMaster() {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        for (int i : hashSet) {
            System.out.println(i);
        }
        System.out.println("hashSet is empty?:" + hashSet.isEmpty());
        System.out.println("hashSet size:" + hashSet.size());
        hashSet.add(4);
        System.out.println("hashSet size:" + hashSet.size());
        hashSet.remove(4);
        System.out.println("hashSet size:" + hashSet.size());
        System.out.println("hashSet contains item 3?:" + hashSet.contains(3));
        hashSet.clear();
        System.out.println("hashSet size:" + hashSet.size());
        System.out.println("hashSet is empty?:" + hashSet.isEmpty());

    }

}
