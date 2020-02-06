package com.codecool.kruppa.company;

import java.util.ArrayList;
import java.util.List;

public class Company implements MobileNumber{
    private List<Car> cars = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Integer> mobileNumbers = new ArrayList<>();


    public void addCar(Car car){
        cars.add(car);
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
        mobileNumbers.add(driver.mobileNumber);
        driver.setMobilenumbers(this);
    }

    public void simulate(){
        for(Car car:cars)
        System.out.println(car);
    }

    @Override
    public List getMObileNumber() {
        return mobileNumbers;
    }
}
