package com.codecool.kruppa.util;

import java.util.Random;

public class Util {

    private static Random random = new Random();

    public static int getRandomNumber(int from, int to){
        return  random.nextInt((to-from)+1)+from;
    }
}
