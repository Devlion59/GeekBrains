package com.geekbrains.lesson1;

public abstract class Cat extends Animal {

    private static int count = 0;
    private static final int RUN_DISTANCE_LIMIT = 200;

    public Cat(String name, String type, int swimDistanceLimit) {
        super(name, type, RUN_DISTANCE_LIMIT, swimDistanceLimit);
        count++;
    }

    public static int getCount(){
        return count;
    }
}
