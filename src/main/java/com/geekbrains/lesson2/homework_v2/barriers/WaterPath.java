package com.geekbrains.lesson2.homework_v2.barriers;

import com.geekbrains.lesson2.homework_v2.players.Player;

public class WaterPath extends Barrier {

    public WaterPath(int value) {
        super(value);
    }

    @Override
    public boolean tryToPass(Player player) {
        return player.swim(this.getValue());
    }
}
