package com.codecool.kruppa.gmap;


import java.util.Set;

public interface Distance {
    Set getNearbyPlaces(int posX, int posY, Vehicle vehicle);
}
