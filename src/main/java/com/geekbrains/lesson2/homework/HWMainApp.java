package com.geekbrains.lesson2.homework;
import com.geekbrains.lesson2.homework.barriers.Treadmill;
import com.geekbrains.lesson2.homework.barriers.Wall;
import com.geekbrains.lesson2.homework.interfaces.Action;
import com.geekbrains.lesson2.homework.interfaces.Barrier;
import com.geekbrains.lesson2.homework.players.Cat;
import com.geekbrains.lesson2.homework.players.Human;
import com.geekbrains.lesson2.homework.players.Robot;

public class HWMainApp {

    public static void main(String[] args) {

        Action[] players = {
                new Human("HA", 200, 2),
                new Human("HB", 100, 3),
                new Cat("CC", 50, 4),
                new Robot("RD", 2000, 10)
        };

        Barrier[] barriers = {
                new Wall(1),
                new Treadmill(20),
                new Wall(3),
                new Treadmill(150),
                new Wall(4),
                new Treadmill(80),
                new Wall(8),
                new Treadmill(1000)
        };

        for (Action player : players){
            for (Barrier barrier : barriers) {
                if (barrier instanceof Treadmill){
                    if (!player.run((Treadmill)barrier))
                        break;
                } else {
                    if (!player.jump((Wall)barrier))
                        break;
                }
            }
        }
    }
}
