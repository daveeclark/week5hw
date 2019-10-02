package com.week5.week5;

public class MotorCycle extends Vehicle {
    private String color;

    public MotorCycle(int windows, int tires, String color) {
        super(windows, tires);
        this.color = color;
    }

    public String mcColor(String color){
        return color;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "color='" + color + '\'' +
                '}';
    }
}
