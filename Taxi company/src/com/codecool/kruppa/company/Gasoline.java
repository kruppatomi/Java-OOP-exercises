package com.codecool.kruppa.company;

import com.codecool.kruppa.util.Util;

public class Gasoline extends CarWithDriver {
    public Gasoline(Driver driver) {
        super(driver);
        this.name = "Gasoline";
        this.cost = 350;
        this.amountOfPassanger = getNumberOfPassanger();
    }
    @Override
    public int getNumberOfPassanger(){
    return driver.handleRides()*Util.getRandomNumber(1,4);
    }

    @Override
    public String toString() {
        return "Gasoline{" +
                "driver=" + driver +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                ", amountOfPassanger=" + amountOfPassanger +
                '}';
    }
}
