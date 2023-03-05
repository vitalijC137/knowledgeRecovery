package com.generics;

public class GenericExtendsType<T extends Number>{

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}
