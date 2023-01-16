package com.geekbrains.lesson4;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        SimpleBox strsBox = new SimpleBox("asd");

        //...
        // intBox2 = new SimpleBox("zxc");
        //...

        /*
        Если у нас не будет обобщенных типов и мы хотим создать класс, в котором можем хранить любые объекты, то
        создадим в нем переменную типа Object. и при создании объекта этого класса будем в конструкторе передавать объект.
        у нас появляется ситуация, что мы можем в него положить объекты одного типа, а где то в коде переприсвоить и положить объект другого типа.
        тогда придется либо проверять постоянно какой тип там лежит и проводить привидение типа для дальнешей работы, либо ловить исключения.
        Решает проблему обобщение класса
        */
        int sum = 0;
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            sum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();
        }

        /*
        тогда мы уже не сможем создать переменную обобщенную одним типом, а передать другой.
        нет необходимости приведение типа делать.
        */
        GenBox<String> strBox = new GenBox<>("String");
        GenBox<Integer> intBox = new GenBox<>(10);
        sum = intBox.getObj();


        BoxWithNumber<Integer> boxWithInt1 = new BoxWithNumber<>(1, 2, 3, 4, 5, 6);
        System.out.println(boxWithInt1.average());
        BoxWithNumber<Integer> boxWithInt2 = new BoxWithNumber<>(1, 2, 3, 4, 5, 6);
        System.out.println(boxWithInt2.average());
        //скомпилируется даже если метод compareAverage(BoxWithNumber<N> another)
        System.out.println(boxWithInt1.compareAverage(boxWithInt2));

        BoxWithNumber<Double> boxWithDouble = new BoxWithNumber<>(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        System.out.println(boxWithDouble.average());
        // не скомпилируется если compareAverage(BoxWithNumber<N> another)
        //System.out.println(boxWithInt1.compareAverage(boxWithDouble));

        //скомпилируется когда compareAverage(BoxWithNumber<?> another)
        System.out.println(boxWithInt1.compareAverage(boxWithDouble));

        //BoxWithNumber><String> boxWithStr = new BoxWithNumber<>("1", "2", "3"); //нельзя


        //наследование и обобщение
        GenBox<Number> gbN = new GenBox<>(1);
        GenBox<Integer> gbI = new GenBox<>(1);
        doSomething1(gbN);
        doSomething2(gbN);
        doSomething1(gbI);
        //doSomething2(gbI); //не сработает. т.к. gbI никак не относится к GenBox<Number>, но относится к GenBox<? extends Number>
    }

    public static void doSomething1(GenBox<? extends Number> box){

    }

    public static void doSomething2(GenBox<Number> box){

    }

    //обобщенный метод. в сигнатуре метода запись <T> означает, что мы собираемся этот тип использовать
    //если подадим List<String>, то он возвращает String, и T становится String
    //параметризированный метод также можно ограничить - public static <T extends Number> T getFirstelement(List<T> list)
    public static <T> T getFirstelement(List<T> list){
        return list.get(0);
    }
}
