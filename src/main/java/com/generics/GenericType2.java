package com.generics;

public class GenericType2 {

    public void genericTypeMethod() {

        GenericType<Integer> genericType = new GenericType<>();
        genericType.setItem(5);
        System.out.println(genericType.getItem());
        int integer = genericType.getItem();
        System.out.println("it's integer variable:" + integer);
    }

    public void genericTypeMethod2() {
        GenericType<Integer> genericType = new GenericType<>();
        GenericType<String> genericType1 = new GenericType<>();
        System.out.println("that's new local variable have the same name :genericType: " + genericType.getItem());
        System.out.println(genericType.getClass().equals(genericType1.getClass()));
        System.out.println(genericType.getClass() == genericType1.getClass());
        // why result is true? genericType don't equals genericType1
    }

    public void genericTypeMethod3() {
        int z;
        GenericType<Integer> integerGenericType = new GenericType<>();
        GenericType<String> stringGenericType = new GenericType<>();
        GenericType<Number> numberGenericType = new GenericType<>();

        integerGenericType.setItem(555);
        stringGenericType.setItem("five, five, five");
        numberGenericType.setItem(5.555);

        System.out.println(integerGenericType.getItem()
                + "\n" + stringGenericType.getItem()
                + "\n" + numberGenericType.getItem());
        z = integerGenericType.getItem();
        System.out.println(z);
    }

    public void genericTypeMethod4() {
        GenericExtendsType<Integer> integerGenericExtendsType = new GenericExtendsType<>();
        integerGenericExtendsType.setItem(999);
        System.out.println("hi! i'm working only with types that extends number class: "  + integerGenericExtendsType.getItem());
//        GenericExtendsType<String> stringGenericExtendsType = new GenericExtendsType<>();
//          не працюватиме зі стрічкою, бо обмежений рівень дженералізації
        }
    }

