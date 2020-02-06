package com.codecool.kruppa.network;

public class Normal extends DeviceWithScreen {
    private int manufacturedTime;
    private static final int batteryLossPerYear = 3;

    public Normal(int age, ScreenSize screenSize ,int manufacturedTime) {
        super(age,  screenSize);
        this.manufacturedTime = manufacturedTime;
        this.name = "Normal";
    }

    public boolean jail() {
        return true;
    }

    @Override
    public int calculateRemainingPower() {
        if(manufacturedTime>=2000){
            batteryLife*=2;
        }
        else{
            batteryLife/=2;
        }

        return batteryLife -batteryLossPerYear*age;
    }

    @Override
    public String toString() {
        return "Normal{" +
                "manufacturedTime=" + manufacturedTime +
                ", screenSize=" + screenSize +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", batteryLife=" + batteryLife +
                '}';
    }
}
