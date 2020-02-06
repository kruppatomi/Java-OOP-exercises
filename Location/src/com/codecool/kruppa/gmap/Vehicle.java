package com.codecool.kruppa.gmap;


import com.codecool.kruppa.util.Util;

public enum Vehicle {
    BIKE(5),
    FOOT(2);

    private int vehicle;

    Vehicle(int vehicle){
        this.vehicle = vehicle;
    }

    public int getVehicle() {
        return vehicle;
    }

    public static Vehicle getRandomVehicle() {
        Vehicle[] vehicles = Vehicle.values();
        return vehicles[Util.getRandomNumber(1)];
    }
}
