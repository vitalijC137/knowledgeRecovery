package com.stringBufferStringBuilder.varioustMethods;

public class ToCharArray {

    public void toCharArrayMethod() {
        String string = "ABC";
        char[] result = string.toCharArray();
        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Element [" + i + "]:" + result[i]);
        }
    }
}
