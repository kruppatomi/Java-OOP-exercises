package com.codecool.kruppa.network;

public class Connected extends Device {

    private static final int batteryLossPerYear = 7;
    private NumberOfConnectedDevices numberOfConnectedDevices;


    public Connected(int age, NumberOfConnectedDevices numberOfConnectedDevices) {
        super(age);
        this.name = "Connected";
        this.numberOfConnectedDevices = numberOfConnectedDevices;

    }

    public int getNumberOfConnected(){
        return numberOfConnectedDevices.getNumberOfCoectedDevices();
    }

    @Override
    public int calculateRemainingPower() {
        return batteryLife-(batteryLossPerYear*age)+(getNumberOfConnected()*20);
    }


    @Override
    public String toString() {
        return "Connected{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batteryLife=" + batteryLife +
                ", conecteddevices's size: " + getNumberOfConnected() +
                '}';
    }
}
