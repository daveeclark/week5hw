package com.week5.week5;

public class SUV extends Car {

    public SUV(int windows, int tires, int doors) {
        super(windows, tires, doors);
    }

    @Override
    public int carDoors(int doors) {
        return super.carDoors(doors);
    }

    @Override
    public int vehicleWindows(int windows) {
        return super.vehicleWindows(windows);
    }

    @Override
    public int vehicleTires(int tires) {
        return super.vehicleTires(tires);
    }
}
