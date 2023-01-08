package com.geekbrains.lesson2.homework.interfaces;

import com.geekbrains.lesson2.homework.barriers.Treadmill;
import com.geekbrains.lesson2.homework.barriers.Wall;

public interface Action {

    boolean run(Treadmill treadmill);
    boolean jump(Wall wall);
}
