package com.geekbrains.lesson2.homework_v2;

import com.geekbrains.lesson2.homework_v2.barriers.Treadmill;
import com.geekbrains.lesson2.homework_v2.barriers.Wall;
import com.geekbrains.lesson2.homework_v2.barriers.WaterPath;
import com.geekbrains.lesson2.homework_v2.barriers.Barrier;
import com.geekbrains.lesson2.homework_v2.players.Cat;
import com.geekbrains.lesson2.homework_v2.players.Human;
import com.geekbrains.lesson2.homework_v2.players.Player;
import com.geekbrains.lesson2.homework_v2.players.Robot;

public class MainApp2 {

    public static void main(String[] args) {

        Player[] players = {
                new Human("HumanVas", 200, 2, 50),
                new Human("HumanNick", 100, 3, 100),
                new Cat("CatOl", 300, 5),
                new Human("HumanMark", 500, 2, 500),
                new Robot("RobotT1000", 2000, 10)
        };

        Barrier[] barriers = {
                new Treadmill(20),
                new Wall(1),
                new WaterPath(20),
                new Treadmill(150),
                new Wall(3),
                new Treadmill(80),
                new Wall(4),
                new WaterPath(60),
                new Treadmill(1000),
                new Wall(8)
        };

        for (Player player : players) {
            for (Barrier barrier : barriers) {
                if (!barrier.tryToPass(player)){
                    System.out.println();
                    break;
                }
            }
        }
    }
}
