package com.geekbrains.lesson2.homework.players;

import com.geekbrains.lesson2.homework.barriers.Treadmill;
import com.geekbrains.lesson2.homework.barriers.Wall;
import com.geekbrains.lesson2.homework.interfaces.Action;

public class Cat implements Action {

    private final int runLength;
    private final int jumpHeight;
    private final String name;
    private static final String TYPE = "Кот";

    public Cat(String name, int runLength, int jumpHeight) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (getRunLength() >= treadmill.getLength()){
            System.out.printf("%s %s успешкно пробежал %d м.\n", TYPE, getName(), treadmill.getLength());
            return true;
        } else {
            System.out.printf("%s %s не смог пробежать %d м.\n", TYPE, getName(), treadmill.getLength());
            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (getJumpHeight() >= wall.getHeight()){
            System.out.printf("%s %s успешкно перепрыгнул %d м.\n", TYPE, getName(), wall.getHeight());
            return true;
        } else {
            System.out.printf("%s %s не смог перепрыгнуть %d м.\n", TYPE, getName(), wall.getHeight() );
            return false;
        }
    }
}
