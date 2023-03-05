package com.stringBufferStringBuilder.varioustMethods;

public class CopyValueOf {

    public void copyValueOfMethod1() {
        System.out.println("\n example without input parameters:");
        char[] chars = {'V', 'e', 'r', 't', 'e', 'x', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        String string1 = "String";
        System.out.println("String string1 before copyValueOf: " + string1);
        string1 = string1.copyValueOf(chars);
        System.out.println("String string1 after copyValueOf:" + string1);
    }
    public void copyValueOfMethod2() {
        System.out.println("\n feature of the method - example without input parameters:");
        char[] chars = {'V', 'e', 'r', 't', 'e', 'x', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        String string1 = "String";
        String string2 = string1.copyValueOf(chars);
        System.out.println("String string1 after copyValueOf:" + string1);
        System.out.println("String string2 after copyValueOf:" + string2);
        System.out.println("copyValueOf() don't create new string");
    }
    public void copyValueOfMethod3() {
        System.out.println("\n example with input parameters");
        char[] chars = {'V', 'e', 'r', 't', 'e', 'x', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        String string1 = "String";
        String string2 = string1.copyValueOf(chars);
        String string3 = string1.copyValueOf(chars, 2, 7);
        System.out.println("String without offset: " + string2);
        System.out.println("String with offset 2 and count 7:" + string3);
    }

}
