package com.comparableComparator;

import java.util.TreeSet;

public class TestComparableHouses {

    public void executive() {

        TreeSet<House> myHouse = new TreeSet<>();
        House firstHouse = new House(100, 120000, "Tokyo", true);
        House secondHouse = new House(40, 70000, "Oxford,", true);
        House thirdHouse = new House(70, 180000, "Paris", false);

        myHouse.add(firstHouse);
        myHouse.add(secondHouse);
        myHouse.add(thirdHouse);

        for (House house : myHouse) {
            System.out.println(house);
        }
    }
}
