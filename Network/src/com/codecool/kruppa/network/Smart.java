package com.codecool.kruppa.network;

public class Smart extends DeviceWithScreen {
    private static final int batteryLossPerYear = 15;
    private static int nextNameNumber = 0;
    private NumberOfNormalDevices numberOfNormalDevices;




    public Smart(int age, ScreenSize screenSize, NumberOfNormalDevices numberOfNormalDevices) {
        super(age, screenSize);
        this.name = generateName();
        this.numberOfNormalDevices = numberOfNormalDevices;
    }

    public int getNumberOfNormal(){
        return numberOfNormalDevices.getNumberOfNormalDevices();
    }

    public String generateName(){
        return "smart" + nextNameNumber++;
    }

    @Override
    public int calculateRemainingPower() {
        return batteryLife-(batteryLossPerYear+screenSize.getScreenSize())*age;
    }

    @Override
    public String toString() {
        return "Smart{" +
                "screenSize=" + screenSize +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", batteryLife=" + batteryLife +
                ", normal devices's size: " + getNumberOfNormal() +
                '}';
    }
}
