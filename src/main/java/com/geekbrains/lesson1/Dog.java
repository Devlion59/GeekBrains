package com.geekbrains.lesson1;

public class Dog extends Animal {

    private static int count = 0;
    private static final String TYPE = "Собака";
    private static final int RUN_DISTANCE_LIMIT = 500;
    private static final int SWIM_DISTANCE_LIMIT = 10;

    public Dog(String name) {
        super(name, TYPE, RUN_DISTANCE_LIMIT, SWIM_DISTANCE_LIMIT);
        count++;
    }

    public static int getCount(){
        return count;
    }
}
