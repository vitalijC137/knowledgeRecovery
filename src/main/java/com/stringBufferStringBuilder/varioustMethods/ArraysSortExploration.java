package com.stringBufferStringBuilder.varioustMethods;

import java.util.Arrays;

public class ArraysSortExploration {

    int[] integerArray = {9, 3, 7, 2, 5, 10, 1, 8, 4, 6};
    int[] sortedIntegerArray;

    public void ArraysSortMethod() {
        Arrays.sort(integerArray);
        System.out.println(Arrays.toString(integerArray));
        sortedIntegerArray = integerArray;
        System.out.println(Arrays.toString(sortedIntegerArray));
    }
}
