package com.nestedInnerClasses;

public class NestedInnerClassesExploration {

    public void executive() {

        Bicycle peugeot = new Bicycle("r2d2", 12);
        Bicycle.SteeringWheel wheel = peugeot.new SteeringWheel();
        Bicycle.Seat seat = peugeot.new Seat();

        seat.up();
        seat.down();
        peugeot.start();
        wheel.left();
        wheel.right();

        // static nested inner class

        ElectricCar electricCar = new ElectricCar("Tesla", 1000);
        ElectricCar.Battery battery = new ElectricCar.Battery();
        electricCar.start();
        battery.charging();
    }
}
