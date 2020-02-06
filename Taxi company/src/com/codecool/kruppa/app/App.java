package com.codecool.kruppa.app;

import com.codecool.kruppa.company.*;

public class App {
    public static void main(String[] args) {
        Company company = new Company();
        Driver driver = new Driver("Petya", 30, 200, Experience.BEGINNER, company);
        company.addDriver(driver);
        Driver driver1 = new Driver("Dani", 41, 200, Experience.PROFESSIONAL, company);
        company.addDriver(driver1);
        company.addCar(new Gasoline(driver));
        company.addCar(new Electric(driver1));
        company.addCar(new SelfDriving());

        company.simulate();

    }
}
