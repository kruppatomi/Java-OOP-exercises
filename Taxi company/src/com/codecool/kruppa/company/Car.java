package com.codecool.kruppa.company;

public abstract class Car {
    protected String name;
    private static  int counter = 1;
    protected int id;
    protected int cost;
    protected int amountOfPassanger;

    public Car() {
        this.id = counter++;
    }
}
