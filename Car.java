package com.week5.week5;

public class Car extends Vehicle {
    private int doors;

    public Car(int windows, int tires, int doors) {
        super(windows, tires);
        this.doors=doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int carDoors(int doors){
        return doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                '}';
    }
}
