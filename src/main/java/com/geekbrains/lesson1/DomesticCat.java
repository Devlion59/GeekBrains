package com.geekbrains.lesson1;

public class DomesticCat extends Cat {

    private static int count = 0;
    private static final String TYPE = "Домашний кот";
    private static final int SWIM_DISTANCE_LIMIT = 0;

    public DomesticCat(String name) {
        super(name, TYPE, SWIM_DISTANCE_LIMIT);
        count++;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s %s не умеет плавать\n", getType(), getName());
    }
}
