package com.stringBufferStringBuilder.varioustMethods;

public class IndexOf {

    public void indexOfMethod() {
        System.out.println(" ");
        String string = "Hello";
        int index = string.indexOf('H');
        int index2 = string.indexOf('o');
        int index3 = string.indexOf('w');

        System.out.println(string + index);
        System.out.println(string + index2);
        System.out.println(string + index3);

        int index4 = string.indexOf('H', 2);
        int index5 = string.indexOf('o', 2);
        System.out.println(index4);
        System.out.println(index5);
    }

    public void indexOfMethod2() {
        System.out.println("\n to search for a substring need use - \"\" ");
        String string = "Good morning";
        int index = string.indexOf("morni");
        int index2 = string.indexOf("Vertex");
        int index3 = string.indexOf("Good morning", -2);
        int index4 = string.indexOf("Good morning", 2);
        int index5 = string.indexOf("Good morning", 999);
        System.out.println(index + "\n " + index2 + "\n " + index3 + "\n " + index4 + "\n " + index5);
    }
}
