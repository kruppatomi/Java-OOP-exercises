package com.codecool.kruppa.network.com.codecool.kruppa.app;

import com.codecool.kruppa.network.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Network");

        Network network = new Network();

            network.addSmartDevice(new Smart(10, ScreenSize.FULLHD, network));
            network.addNormalDevice(new Normal(5, ScreenSize.UHD, 2010));
            network.addConnectedDevice(new Connected(3, network));
            network.addConnectedDevice(new Connected(4, network));
                network.simulate();
            }

        }




