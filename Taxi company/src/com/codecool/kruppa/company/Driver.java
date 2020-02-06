package com.codecool.kruppa.company;

import com.codecool.kruppa.util.Util;

import java.util.List;

public class Driver {
    private int maintenance;
    private double sizeOfIncrease;
    protected int mobileNumber;
    private MobileNumber mobilenumbers;
    private String name;
    private int age;
    private int salary;
    private Experience experience;

    public Driver(String name, int age, int salary, Experience experience, MobileNumber mobilenumbers) {
        this.maintenance = 20;
        this.sizeOfIncrease = 0.1;
        this.mobileNumber = Util.getRandomNumber(10000,99999);
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
        this.mobilenumbers = mobilenumbers;
    }

    public int handleRides(){
        return this.experience.getExperience();
    }

    public List getOthersMobileNumber(){
        return mobilenumbers.getMObileNumber();
    }

    public void setMobilenumbers(MobileNumber mobilenumbers) {
        this.mobilenumbers = mobilenumbers;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "maintenance=" + maintenance +
                ", sizeOfIncrease=" + sizeOfIncrease +
                ", mobileNumber=" + mobileNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", experience=" + experience +
                ", other's mobileNumber"+ getOthersMobileNumber() +
                '}';
    }
}
