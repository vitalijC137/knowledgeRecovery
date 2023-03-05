package com.collection;

import java.util.ArrayList;

public class ListExploration {

    public void withoutArrayListOperationExample() {

        System.out.println(" ");
        String[] deliveryCities = {"Chicago", "NewYork", "Toronto", "Paris"};
        String[] deliveryCities2 = new String[deliveryCities.length + 1];

        for (int i = 0; i < deliveryCities.length; i++) {
            deliveryCities2[i] = deliveryCities[i];
        }
        deliveryCities2[deliveryCities.length] = "London";
        System.out.println(deliveryCities2[4]);
    }

    public void withArrayLIstOperationExample() {

        System.out.println(" ");
        ArrayList<String> deliveryCities = new ArrayList<>();
        deliveryCities.add("Chicago");
        deliveryCities.add("NewYork");
        deliveryCities.add("Toronto");
        deliveryCities.add("Paris");
        deliveryCities.add("London");
        System.out.println(deliveryCities.get(4));
        System.out.println(deliveryCities.size());

        System.out.println(" ");
        System.out.println(deliveryCities.get(0));
        deliveryCities.add(0, "Prague");
        System.out.println(deliveryCities.get(0) + "\n" + deliveryCities.get(1));
        System.out.println(" ");
        deliveryCities.set(0, "Berlin");
        System.out.println(deliveryCities.get(0) + "\n" + deliveryCities.get(1));
        System.out.println(" ");
        deliveryCities.remove(0);
        System.out.println(deliveryCities.get(0) + "\n" + deliveryCities.get(1));
        deliveryCities.clear();
        System.out.println(deliveryCities.size());
    }

}
