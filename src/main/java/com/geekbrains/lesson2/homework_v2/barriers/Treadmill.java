package com.geekbrains.lesson2.homework_v2.barriers;

import com.geekbrains.lesson2.homework_v2.players.Player;

public class Treadmill extends Barrier {

    public Treadmill(int value) {
        super(value);
    }

    @Override
    public boolean tryToPass(Player player) {
        return player.run(this.getValue());
    }
}
