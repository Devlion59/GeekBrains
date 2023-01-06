package com.geekbrains.lesson1;

public abstract class Animal {

    private String name;
    private static int animalCount = 0;

    public Animal(String name) {
        animalCount++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int distance){
        String text = distance <= getRunDistanceLimit() ? getName() + " пробежал " + distance + " м"
                                                     : "Расстояние слишком большое";
        System.out.println(text);
    }

    public void swim(int distance){
        String text = distance <= getSwimDistanceLimit() ? getName() + " проплыл " + distance + " м"
                : "Расстояние слишком большое";
        System.out.println(text);
    }

    public static int getAnimalCount(){
        return animalCount;
    }

    public abstract int getRunDistanceLimit();

    public abstract int getSwimDistanceLimit();
}
