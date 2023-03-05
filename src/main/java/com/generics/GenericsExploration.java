package com.generics;

import com.generics.wildcards.WildcardsExploration;

public class GenericsExploration {

    public void executive() {
        WorkBeforeGenerics2 workBeforeGenerics2 = new WorkBeforeGenerics2();
        workBeforeGenerics2.whatInside();
        GenericType2 genericType2 = new GenericType2();
        genericType2.genericTypeMethod();
        genericType2.genericTypeMethod2();
        genericType2.genericTypeMethod3();
        genericType2.genericTypeMethod4();
        RawTypes rawTypes = new RawTypes();
        rawTypes.rawTypesMethod();
        WildcardsExploration wildcardsExploration = new WildcardsExploration();
        wildcardsExploration.executive();
    }
}
