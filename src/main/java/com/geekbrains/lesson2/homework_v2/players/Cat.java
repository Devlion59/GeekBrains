package com.geekbrains.lesson2.homework_v2.players;

public class Cat extends Player {

    private static final String TYPE = "Кот";

    public Cat(String name, int runLength, int jumpHeight) {
        super("Кот", name, runLength, jumpHeight, 0);
    }

    @Override
    public boolean swim(int length) {
        System.out.printf("%s %s не умеет плавать\n", this.getType(), this.getName());
        return false;
    }
}
