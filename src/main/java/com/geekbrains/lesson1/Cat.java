package com.geekbrains.lesson1;

public abstract class Cat extends Animal {

    private static int catCount = 0;

    private static final int RUN_DISTANCE_LIMIT = 200;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Кот %s не умеет плавать\n", getName());
    }

    public static int getCatCount(){
        return catCount;
    }

    @Override
    public int getRunDistanceLimit() {
        return RUN_DISTANCE_LIMIT;
    }

    @Override
    public int getSwimDistanceLimit() {
        return 0;
    }
}
