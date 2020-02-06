package com.codecool.kruppa.app;

import com.codecool.kruppa.gmap.Gmap;
import com.codecool.kruppa.gmap.Person;
import com.codecool.kruppa.gmap.Place;
import com.codecool.kruppa.gmap.Vehicle;

public class App {
    public static void main(String[] args) {
        Gmap gmap = new Gmap();
        for(int i=0; i< 20; i++) {
            gmap.addPlace(new Place());
        }
    for(int i = 0; i < 4; i++) {
        Person person = new Person(Vehicle.getRandomVehicle(), gmap);
        gmap.getNearbyPlaces(person.getPositionX(), person.getPositionY(), Vehicle.getRandomVehicle());
        System.out.println(person);
    }
    }
}
