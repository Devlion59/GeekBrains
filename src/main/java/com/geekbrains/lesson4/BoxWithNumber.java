package com.geekbrains.lesson4;

public class BoxWithNumber<N extends Number> {
    private N[] array;

    public BoxWithNumber(N... array) {
        this.array = array;
    }

    public double average() {
        double avg = 0.0;
        for (int i = 0; i < array.length; i++) {
            //avg += array[i]; // если бы мы не ограничели тип N, то мы бы не смогли взять объект. или получить значение по нему
            avg += array[i].doubleValue(); //так как мы ограничели тип N extends Number, то мы можем вызвать у объекта метод .doubleValue()
            //который возвращает значение объекта-числа
        }
        return avg / array.length;
    }

/*    public boolean compareAverage(BoxWithNumber<N> another){
        //если мы оставим N, то в метод можно будет передать объект обобщенный только тем типом, которым обобщен объект ,у которого этот метод вызывается
        //boxWithInt1.compareAverage(boxWithInt2)
        //BoxWithNumber<Integer> boxWithInt1
        //BoxWithNumber<Integer> boxWithInt2
        return Math.abs(this.average() - another.average()) < 0.0001;
    }*/

    public boolean compareAverage(BoxWithNumber<?> another){
        //если мы поставим ?, то в метод можно будет передать объект, обобщенный любым типом
        //
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
}
