package com.comparableComparator;

public class House implements Comparable<House> {

    int area;
    int price;
    String city;
    boolean hasFurniture;

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString(){
        final StringBuffer stringBuffer = new StringBuffer("House {");
        stringBuffer.append("area= ").append(area)
        .append(",price= ").append(price)
        .append(",city= ").append(city).append('\'')
        .append(",hasFurniture= ").append(hasFurniture)
        .append('}');
        return stringBuffer.toString();
    }

    public int compareTo(House anotherHouse) {
        if (this.area == anotherHouse.area) {
            return 0;
        } else if (this.area<anotherHouse.area) {
            return -1;
        } else {
            return 1;
        }

    }
}
