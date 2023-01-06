package com.geekbrains.lesson1;

public class Tiger extends Cat {

    private static int count = 0;
    private static final String TYPE = "Тигр";
    private static final int SWIM_DISTANCE_LIMIT = 5;

    public Tiger(String name) {
        super(name, TYPE, SWIM_DISTANCE_LIMIT);
        count++;
    }

    public static int getCount(){
        return count;
    }
}

