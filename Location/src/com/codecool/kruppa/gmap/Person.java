package com.codecool.kruppa.gmap;
import com.codecool.kruppa.util.Util;

import java.util.Set;

public class Person {
    private String name;
    private static int counter = 0;
    private int positionX;
    private int positionY;
    private Vehicle type;
    private Set visitable;

    public Person(Vehicle type, Distance visitable) {
        this.name = "Person" + counter++;
        this.positionX = Util.getRandomNumber(20);
        this.positionY = Util.getRandomNumber(20);
        this.type = type;
        this.visitable = visitable.getNearbyPlaces(this.positionX, this.positionY, this.type);

    }



    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Vehicle: " + type +
                ", Able to visit: " + visitable;
    }
}
