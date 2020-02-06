package com.codecool.kruppa.company;

public class SelfDriving extends Car {
    public SelfDriving() {
        this.name = "SelfDriving";
        this.cost = 740;
        this.amountOfPassanger = 70;
    }

    @Override
    public String toString() {
        return "SelfDriving{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                ", amountOfPassanger=" + amountOfPassanger +
                '}';
    }
}
