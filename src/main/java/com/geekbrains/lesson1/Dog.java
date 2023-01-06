package com.geekbrains.lesson1;

public class Dog extends Animal {

    private static int dogCount = 0;

    private static final int RUN_DISTANCE_LIMIT = 500;
    private static final int SWIM_DISTANCE_LIMIT = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount(){
        return dogCount;
    }

    @Override
    public int getRunDistanceLimit() {
        return RUN_DISTANCE_LIMIT;
    }

    @Override
    public int getSwimDistanceLimit() {
        return SWIM_DISTANCE_LIMIT;
    }
}
