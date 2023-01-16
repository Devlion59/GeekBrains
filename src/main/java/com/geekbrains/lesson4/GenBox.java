package com.geekbrains.lesson4;

public class GenBox<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public GenBox(T obj) {
        this.obj = obj;
    }

    public void doSomething(T[] arr, T t){ //можно передавать в агрумент
        //T obj = new T(); //нельзя
        //T[] arr = new T[10] //нельзя
    }
}
