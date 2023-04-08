package com.interfaceExploration;

import java.util.function.Predicate;

public class FunctionalInterfaceExploration {

    public void executive() {

        MyPredicate<Integer> myPredicate = x -> System.out.println(x);
        myPredicate.apply(5);

        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(10));

        LambdaExpressionExploration<Integer> lambdaExpressionExploration = (a,b,c) -> System.out.println(a + b + c);
        lambdaExpressionExploration.math(1,5,9);

    }
}
