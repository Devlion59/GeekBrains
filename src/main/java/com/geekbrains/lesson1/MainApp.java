package com.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Bro"),
                new Dog("Krau"),
                new DomesticCat("Murz"),
                new Dog("Frau"),
                new Tiger("Shra"),
                new DomesticCat("Vas")
        };

        System.out.println("Run 600");
        doRun(animals, 600);
        System.out.println("\nRun 250");
        doRun(animals, 250);
        System.out.println("\nRun 150");
        doRun(animals, 150);
        System.out.println("\nRun -50");
        doRun(animals, -50);
        System.out.println("\nSwim 15");
        doSwim(animals, 15);
        System.out.println("\nSwim 5");
        doSwim(animals, 5);
        System.out.println("\nSwim -5");
        doSwim(animals, -5);

        System.out.printf("\nAnimal: %d\n", Animal.getCount());
        System.out.printf("Dog: %d\n", Dog.getCount());
        System.out.printf("Cat: %d\n", Cat.getCount());
        System.out.printf("DomesticCat: %d\n", DomesticCat.getCount());
        System.out.printf("Tiger: %d\n", Tiger.getCount());
    }

    public static void doRun(Animal[] animals, int distance){
        for (Animal animal : animals)
            animal.run(distance);
    }

    public static void doSwim(Animal[] animals, int distance){
        for (Animal animal : animals)
            animal.swim(distance);
    }


}
