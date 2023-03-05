package com.twoDimensionalArray;

public class TwoDimensionalArrayExploration {

    public void executive() {
        twoDimensionalArray();
        twoDimensionalArray2();
    }
    public void twoDimensionalArray() {
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        System.out.println("first array length is - " + array.length);
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array[1][0]);
        System.out.println(array[1][1]);
    }

    public void twoDimensionalArray2() {
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < array[i].length; i2++) { // для чого тут цей елемент - array[i].length ?
                System.out.print(array[i][i2] + "\t");
            }
            System.out.println();
        }
    }
}
