package com.geekbrains.lesson2.interf;

public class MainApp {

    static class Human {
        private Transport currentTransport;

        public void drive(Transport transport){
            transport.start();
            this.currentTransport = transport;
        }

        public void stop() {
            if (currentTransport != null){
                currentTransport.stop();
                currentTransport = null;
            } else {
                System.out.println("Я никуда не еду");
            }
        }
    }

    static class Car implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать на машине");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил свою машину");
        }
    }

    static class Bicycle implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать на велосипеде");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил свой велосипед");
        }
    }

    public static void main(String[] args) {
/*        Flyable[] flyables = {
                new Duck(),
                new Airplane()
        };

        for (Flyable flyable : flyables)
            flyable.fly();

        Flyable somethingFlyable = new Duck();
        somethingFlyable.fly();*/

        Transport car = new Car();
        Transport transport = new Car();
        Human human = new Human();
        human.stop();
        human.drive(car);
        human.stop();
    }
}
