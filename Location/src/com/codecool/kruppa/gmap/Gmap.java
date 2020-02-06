package com.codecool.kruppa.gmap;

import com.codecool.kruppa.util.Util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Gmap implements Distance {
    private List<Place> places = new ArrayList<>();
    Set<Place> visitablePlaces = new HashSet<>();

    public void addPlace(Place place){ places.add(place);}

    @Override
    public Set getNearbyPlaces(int posX, int posy, Vehicle vehicle) {
        for (Place place : places) {
            if (Util.getDistance(place.getPositionX(), place.getPositionY(), posX, posy) <= Vehicle.getRandomVehicle().getVehicle()) {
                visitablePlaces.add(place);
            }
        }
        return visitablePlaces;
    }

}
