package com.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExploration {

    public void executive() {

        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher matcher = pattern.matcher("my email is mymail@mail.ua");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");

        }
        System.out.println(" ");
    }

}
