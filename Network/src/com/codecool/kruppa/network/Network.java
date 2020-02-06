package com.codecool.kruppa.network;

import java.util.ArrayList;
import java.util.List;

public class Network implements NumberOfNormalDevices, NumberOfConnectedDevices {

    private  List<Device> devices = new ArrayList<>();
    private List<Normal> normalDevices = new ArrayList<>();
    private List<Smart> smartDevices = new ArrayList<>();
    private List<Connected> connectedDevices = new ArrayList<>();



    public void addNormalDevice(Normal normal) {
        normalDevices.add(normal); devices.add(normal);
    }

    public void addSmartDevice(Smart smart) {
        smartDevices.add(smart); devices.add(smart);
    }

    public void addConnectedDevice(Connected connected) {
        connectedDevices.add(connected); devices.add(connected);
    }

    @Override
    public int getNumberOfNormalDevices() {
        return normalDevices.size();
    }



    @Override
    public int getNumberOfCoectedDevices() {
        return connectedDevices.size();
    }


    public void simulate() {
        for(Device device:devices) {
            System.out.println(device + " remaining power: " + device.calculateRemainingPower() + "\n");
        }
    }


}
