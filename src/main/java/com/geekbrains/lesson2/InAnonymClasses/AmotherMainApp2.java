package com.geekbrains.lesson2.InAnonymClasses;

public class AmotherMainApp2 {

    class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
            System.out.println(outerValue);
            //outerMethod; //имеет доступ
        }
    }

    static class Nested {
        int nestedValue;

        public Nested(int nestedValue) {
            this.nestedValue = nestedValue;
        }

        public void nestedMethod() {
            System.out.println(nestedValue);
            //System.out.println(outerValue); //не имеет доступ
            //outerMethod(); //не имеет доступ
        }
    }

    int outerValue;

    public void outerMethod(){
        System.out.println(outerValue);
        //System.out.println(innerValue); //не имеет доступ
        //innerMethod; //не имеет доступ
        Inner inner = new Inner(10); //можно потому что этот объект будет привязан к объекту внешнего класса, у которого будет вызван метод outerMethod
        //System.out.println(nestedValue); //не имеет доступ
        //nestedMethod(); //не имеет доступ
        Nested nested = new Nested(10);
    }

    public static void main(String[] args) {
        //Inner inner = new Inner(10); //нельзя потому что это статический метод. нужно создать объект внешнего класса и потом создать объект внутреннего
        Inner inner = new AmotherMainApp2().new Inner(10);
        Nested nested = new Nested(10);

        class Local {
            int localValue;

            public Local(int localValue) {
                this.localValue = localValue;
            }

            public void localMethod(){
                System.out.println(localValue);
            }
        }

        Local local = new Local(10);


        //анонимный класс
        Flyable duck = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Утка летит");
            }
        };

        /*
        //что происходит на самом деле
        //созается безымянный класс (имя берется от имени внешнего класса и $номер случайный, имплементирующий интерфейс Flyable
        public class AnothermainApp2$1 implement Flyable

        @Override
        public void fly() {
            System.out.println("Утка летит");
        }
        }

        //создается объект
        AnotherMainApp2$1 duck = new AnotherMainApp2$1()


         */

        //точно также можно создать объект абстрактного класса.

        int x = 1;
        int y = 2;

        doSomething(x, y, ((a, b) -> System.out.println(a+b)));
    }

    public static void doSomething(int a, int b, MyFunctInterface myFunctInterface){
        myFunctInterface.myMethod(a, b);
    }
}
