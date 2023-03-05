package com.getterSetter;

public class GetterSetterExploration {

    public void executive() {
        GetterSetter getterSetter = new GetterSetter();
        getterSetter.setCount(5);
        getterSetter.setSize(12.5F);
        getterSetter.setColor("Green");
        System.out.println("count:" + getterSetter.getCount() +
                "\n" + "size:" + getterSetter.getSize() +
                "\n" + "color:" + getterSetter.getColor());
    }

}
