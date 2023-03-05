package com.loops;

import java.util.ArrayList;

public class LoopFillingExploration {

    public void loopForFilling() {
        int[] array = new int[3];

        array[0] = 5;
        array[1] = 17;
        array[2] = 350;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void loopForEachFilling() {
        System.out.println(" ");
        int[] array = {51, 136, 387};
        for (int i : array) {
            System.out.println(i);
        }
    }

    public void loopForFillingWithArrayList() {

        System.out.println(" ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(51);
        list.add(156);
        list.add(387);
        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void loopForEachFillingWithArrayList() {

        System.out.println(" ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(51);
        list.add(136);
        list.add(387);

        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
