package com.overloading;

public class Overloading {

   public Overloading(int firstInteger, int secondInteger) {
        print(firstInteger, secondInteger);
    }
   public Overloading(float firstFloat, float secondFloat) {
        print(firstFloat, secondFloat);
    }
   public Overloading(String firstString, String secondString) {
        print(firstString, secondString);
    }

    public int adding(int a, int b) {
        return a += b;
    }
    public float adding(float a, float b) {
        return a += b;
    }
    public String adding(String a, String b) {
        return a.concat(b);
    }

    public void print(int a, int b) {
        System.out.println(adding(a, b));
    }
    public void print(float a, float b) {
        System.out.println(adding(a, b));
    }
    public void print(String a, String b) {
        System.out.println(adding(a, b));
    }

}
