package com.codecool.kruppa.company;

public enum Experience {
    BEGINNER(15),
    ADVANCED(25),
    PROFESSIONAL(40);

    private int experience;

    Experience(int experience){
        this.experience = experience;
    }

    public int getExperience(){return experience; }
}
