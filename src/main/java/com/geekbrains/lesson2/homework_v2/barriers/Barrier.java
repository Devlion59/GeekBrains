package com.geekbrains.lesson2.homework_v2.barriers;

import com.geekbrains.lesson2.homework_v2.players.Player;

public abstract class Barrier {

    private int value;

    public Barrier(int value) {
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value){
        if (value < 0)
            throw new IllegalArgumentException("Значение не может быть отрицательным");
         else
             this.value = value;
    }

    public abstract boolean tryToPass(Player player);
}
