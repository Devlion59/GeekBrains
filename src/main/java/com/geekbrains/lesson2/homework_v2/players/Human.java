package com.geekbrains.lesson2.homework_v2.players;

public class Human extends Player {

    private static final String TYPE = "Человек";

    public Human(String name, int runLength, int jumpHeight, int swimLength) {
        super(TYPE, name, runLength, jumpHeight, swimLength);
    }
}
