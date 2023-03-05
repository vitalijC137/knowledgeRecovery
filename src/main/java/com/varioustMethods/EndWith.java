package com.varioustMethods;

public class EndWith {

    public void endWithMethod() {
        String string = " Good morning";
        boolean b1 = string.endsWith("morning");
        boolean b2 = string.endsWith("evening");
        System.out.println("string " + string + "ends with 'morning'? " + b1);
        System.out.println("string " + string + "ends with 'evening'? " + b2);
    }
}
