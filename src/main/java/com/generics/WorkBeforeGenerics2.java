package com.generics;

public class WorkBeforeGenerics2 {

    public void whatInside() {
        WorkBeforeGenerics workBeforeGenerics = new WorkBeforeGenerics();
        workBeforeGenerics.setItem(new Integer(5));
        Object object = workBeforeGenerics.getItem();
        System.out.println(object.getClass());

        workBeforeGenerics = new WorkBeforeGenerics();
        workBeforeGenerics.setItem(new String("string"));
        object = workBeforeGenerics.getItem();
        System.out.println(object.getClass());
        // to check out what inside
    }
}
