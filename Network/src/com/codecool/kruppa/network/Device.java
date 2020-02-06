package com.codecool.kruppa.network;

public abstract class Device {
    protected String name;
    protected int age;
    protected int batteryLife;

    public Device(int age) {
        this.age = age;
        this.batteryLife = 100;
    }

    public abstract int calculateRemainingPower();
}
