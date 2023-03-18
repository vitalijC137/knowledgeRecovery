package com.comparableComparator;

import java.util.ArrayList;

public class TestComparatorHouses {

    public void executive() {

        ArrayList<House> myHouseArrayList = new ArrayList<>();

        House firstHouse = new House(100, 120000, "Tokyo", true);
        House secondHouse = new House(40, 70000, "Oxford", true);
        House thirdHouse = new House(70000, 180000, "Paris", false);

        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondHouse);
        myHouseArrayList.add(thirdHouse);

        PriceComparator priceComparator = new PriceComparator();
        myHouseArrayList.sort(priceComparator);
        System.out.println("sorted price:");

        for (House house : myHouseArrayList) {
            System.out.println(house);
        }
    }
}
