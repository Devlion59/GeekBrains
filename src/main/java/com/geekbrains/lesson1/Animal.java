package com.geekbrains.lesson1;

public abstract class Animal {

    private String type;
    private String name;
    private static int count = 0;
    private int runDistanceLimit;
    private int swimDistanceLimit;

    public Animal(String name, String type, int runDistanceLimit, int swimDistanceLimit) {
        count++;
        this.name = name;
        this.type = type;
        this.runDistanceLimit = runDistanceLimit;
        this.swimDistanceLimit = swimDistanceLimit;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public static int getCount(){
        return count;
    }

    public int getRunDistanceLimit() {
        return runDistanceLimit;
    }

    public int getSwimDistanceLimit() {
        return swimDistanceLimit;
    }

    public void run(int distance){
        String text = distance <= runDistanceLimit ? distance < 0 ? "Недопустимое значение"
                                                                       : getType() + " " + getName() + " пробежал " + distance + " м"
                                                        : "Для " + getType() + " " + getName() + " расстояние слишком большое";
        System.out.println(text);
    }

    public void swim(int distance){
        String text = distance <= swimDistanceLimit ? distance < 0 ? "Недопустимое значение"
                                                                        : getType() + " " + getName() + " проплыл " + distance + " м"
                                                         : "Для " + getType() + " "  + getName() + " расстояние слишком большое";
        System.out.println(text);
    }


}
