package com.codecool.kruppa.network;

public enum ScreenSize {
    EDTV(5),
    HD(10),
    FULLHD(15),
    UHD(20);

    private int screenSize;

    ScreenSize(int screenSize){this.screenSize = screenSize;}

    public int getScreenSize() { return screenSize; }

}
