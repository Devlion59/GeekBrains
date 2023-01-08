package com.geekbrains.lesson2.homework_v2.barriers;

import com.geekbrains.lesson2.homework_v2.players.Player;

public class Wall extends Barrier {

    public Wall(int value) {
        super(value);
    }

    @Override
    public boolean tryToPass(Player player) {
        return player.jump(this.getValue());
    }
}
