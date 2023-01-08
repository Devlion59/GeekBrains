package com.geekbrains.lesson2.homework.barriers;

import com.geekbrains.lesson2.homework.interfaces.Barrier;

public class Treadmill implements Barrier {

    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
