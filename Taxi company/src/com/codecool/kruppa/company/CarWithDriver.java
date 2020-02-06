package com.codecool.kruppa.company;

import com.codecool.kruppa.util.Util;

public abstract class CarWithDriver extends Car{
    protected Driver driver;

    public CarWithDriver(Driver driver) {
        this.driver = driver;
    }

    public abstract int getNumberOfPassanger();
}
