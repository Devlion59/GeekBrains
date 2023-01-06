package com.geekbrains.lesson1;

public class DomesticCat extends Cat {
    private static int domesticCatCount = 0;
    public DomesticCat(String name) {
        super(name);
        domesticCatCount++;
    }
    public static int getDomesticCatCount(){
        return domesticCatCount;
    }
}
