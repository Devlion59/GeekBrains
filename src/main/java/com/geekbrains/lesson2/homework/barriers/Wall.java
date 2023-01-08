package com.geekbrains.lesson2.homework.barriers;

import com.geekbrains.lesson2.homework.interfaces.Barrier;

public class Wall implements Barrier {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
