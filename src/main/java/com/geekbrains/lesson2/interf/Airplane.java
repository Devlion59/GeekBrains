package com.geekbrains.lesson2.interf;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }
}
