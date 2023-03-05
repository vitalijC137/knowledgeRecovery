package com.stringBufferStringBuilder;

import java.util.Arrays;

public class StringBufferExploration {

    public void StringBufferMaster() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new Integer(2))
                .append(";")
                .append(false)
                .append(";")
                .append(Arrays.asList(1, 2, 3))
                .append(";");
        System.out.println(stringBuffer);

        StringBuffer stringBuffer2 = new StringBuffer("hi i'm stringBuffer2: ");
        stringBuffer2.append(new Integer(2))
                .append(";")
                .append(false)
                .append(";")
                .append(Arrays.asList(1, 2, 3))
                .append(";");
        System.out.println(stringBuffer2);
    }

    public void StringBufferMethods() {
        String numbers = "0123456789";
        StringBuffer stringBuffer = new StringBuffer(numbers);
        System.out.println(stringBuffer.substring(3));
        System.out.println(stringBuffer.substring(4, 8));
        System.out.println(stringBuffer.replace(3, 5, "ABCDE"));

        stringBuffer = new StringBuffer(numbers);
        System.out.println(stringBuffer.reverse());
        stringBuffer.reverse();

        stringBuffer = new StringBuffer(numbers);
        System.out.println(stringBuffer.delete(5, 9));
        System.out.println(stringBuffer.deleteCharAt(1));
        System.out.println(stringBuffer.insert(1, "One"));
    }
}
