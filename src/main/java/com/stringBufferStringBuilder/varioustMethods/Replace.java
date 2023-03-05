package com.stringBufferStringBuilder.varioustMethods;

public class Replace {

    public void replaceMethod() {
        System.out.println(" ");
        String oldString = "ABC";
        String newString = oldString.replace('A', 'B');
        System.out.println("Old string: " + oldString);
        System.out.println("Nes string: " + newString);
    }

    public void replaceMethod2() {
        System.out.println(" ");
        String oldString = "Java";
        String newString = oldString.replace('a', 'i');
        String oldString1 = "JavaJava";
        String newString1 = oldString1.replace("av", "oshu");

        System.out.println("oldString: " + oldString);
        System.out.println("newString: " + newString);
        System.out.println("oldString1: " + oldString1);
        System.out.println("newString1: " + newString1);
    }
}
