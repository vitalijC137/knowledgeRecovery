package com.arrayOfObjects;

import java.util.Scanner;

    public class ObjectsCounter {
        Scanner scanner;
        static final private int PASSWORD = 1234;
        static private int counter = 0;
        public String newObjectName;

        public ObjectsCounter(String newObjectName) {
            this.newObjectName = newObjectName;
            counter++;
    }
    public void findOutTheCurrentCount() {
            scanner = new Scanner(System.in);
            System.out.println("please enter a numeric password:");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (PASSWORD == number) {
                System.out.println("current count is:" + counter);
            } else {
                System.out.println("you enter wrong number");
                findOutTheCurrentCount();
            }
        } else if (scanner.hasNextLine()) {
            System.out.println("you entered the word");
            findOutTheCurrentCount();
        } else {
            System.out.println("wrong enter, try again");
        }
    }

    // як себе поводять примітивні і об'єктні типи даних в методах?
        // чому як створити новий об'єкт класу сканер на рівні класу ObjectCounter і
        // в блоці else if (scanner.hasNextLine()) виклакати метод findOutTheCurrentCount(); -
        // програма працюватиме не корректно?


    public int getCounter() {
        return counter;
    }
}
