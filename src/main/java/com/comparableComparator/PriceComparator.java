package com.comparableComparator;

import java.util.Comparator;

public class PriceComparator implements Comparator<House> {

    public int compare(House house1, House house2) {
        if (house1.price == house2.price) {
            return 0;
        } else if (house1.price > house2.price) {
            return 1;
        } else {
            return -1;
        }
    }
}
