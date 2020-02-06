package com.codecool.kruppa.gmap;

import com.codecool.kruppa.util.Util;

public class Place {
    private String name;
    private int positionX;
    private int positionY;
    private static int counter = 0;

    public Place() {
        this.name = "Place" + counter++;
        this.positionX = Util.getRandomNumber(20);
        this.positionY = Util.getRandomNumber(20);
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    @Override
    public String toString() {
        return name ;
    }
}
