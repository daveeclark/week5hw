package com.week5.week5;

public class Vehicle {
    private int windows;
    private int tires;

    public Vehicle (int windows, int tires){
        this.windows=windows;
        this.tires=tires;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public int vehicleWindows(int windows){
        return windows;
    }

    public int vehicleTires(int tires){
        return tires;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "windows=" + windows +
                ", tires=" + tires +
                '}';
    }
}
