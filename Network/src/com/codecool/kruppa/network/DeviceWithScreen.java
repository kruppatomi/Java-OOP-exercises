package com.codecool.kruppa.network;


public abstract class DeviceWithScreen extends Device {
    protected ScreenSize screenSize;

    public DeviceWithScreen(int age, ScreenSize screenSize) {
        super(age);
        this.screenSize = screenSize;
    }

}

