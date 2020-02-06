package com.codecool.kruppa.company;

import com.codecool.kruppa.util.Util;

public class Electric extends CarWithDriver {
    public Electric(Driver driver) {
        super(driver);
        this.name = "Electric";
        this.cost = 400;
        this.amountOfPassanger = getNumberOfPassanger();
    }

    @Override
    public int getNumberOfPassanger() {
        return driver.handleRides()*Util.getRandomNumber(1,4);
    }

    @Override
    public String toString() {
        return "Electric{" +
                "driver=" + driver +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                ", amountOfPassanger=" + amountOfPassanger +
                '}';
    }
}
