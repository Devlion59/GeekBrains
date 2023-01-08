package com.geekbrains.lesson2.homework_v2.players;

import com.geekbrains.lesson2.homework_v2.actions.Action;

public abstract class Player implements Action {
    private final String type;
    private final String name;
    private int runLength;
    private int jumpHeight;
    private int swimLength;

    public Player(String type, String name, int runLength, int jumpHeight, int swimLength) {
        this.type = type;
        this.name = name;
        setParams(runLength, jumpHeight, swimLength);
    }

    private void setParams(int runLength, int jumpHeight, int swimLength){
        if (runLength < 0 && jumpHeight < 0 && swimLength < 0)
            throw new IllegalArgumentException("Значение должно быть больше 0");
        else {
            this.runLength = runLength;
            this.jumpHeight = jumpHeight;
            this.swimLength = swimLength;
        }
    }

    public String getName() {
        return name;
    }

    public int getRunLength() {
        return runLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getSwimLength() {
        return swimLength;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean jump(int height) {
        if (this.getJumpHeight() >= height) {
            System.out.printf("%s %s успешно перепрыгнул %d м.\n", this.getType(), this.getName(), height);
            return true;
        }
        System.out.printf("%s %s не смог перепрыгнуть %d м.\n", this.getType(), this.getName(), height);
        return false;
    }

    @Override
    public boolean run(int length) {
        if (this.getRunLength() >= length) {
            System.out.printf("%s %s успешно пробежал %d м.\n", this.getType(), this.getName(), length);
            return true;
        }
        System.out.printf("%s %s не смог пробежать %d м.\n", this.getType(), this.getName(), length);
        return false;
    }

    @Override
    public boolean swim(int length) {
        if (this.getSwimLength() >= length) {
            System.out.printf("%s %s успешно проплыл %d м.\n", this.getType(), this.getName(), length);
            return true;
        }
        System.out.printf("%s %s не смог проплыть %d м.\n", this.getType(), this.getName(), length);
        return false;
    }
}
