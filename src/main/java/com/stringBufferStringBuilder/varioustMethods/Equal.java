package com.stringBufferStringBuilder.varioustMethods;

public class Equal {

    public void equalMethod() {
        String string1 = "Good morning";
        String string2 = "Good morning";
        String string3 = "Good evening";

        String string4 = "10";
        Integer integer = 10;

        System.out.println("String " + string1 + "'equals'" + string2 + "':'" + string1.equals(string2));
        System.out.println("String " + string1 + "'equals'" + string3 + "':'" + string1.equals(string3));

        System.out.println("String: " + string4.equals(integer));
    }
}
