package com.codecool.kruppa.util;

import java.util.Random;

public class Util {
    private static Random random = new Random();

    public static int getRandomNumber(int bound){
        return random.nextInt(bound + 1);
    }

    public static double getDistance(int placex, int placey, int personx, int persony){
        return Math.sqrt(Math.pow(Math.abs(placex-personx),2)+Math.pow(Math.abs(placey-persony),2));
    }
}
