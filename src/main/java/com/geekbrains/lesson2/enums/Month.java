package com.geekbrains.lesson2.enums;

public enum Month {
    JANUARY(1, "Январь", 31),
    FEBRUARY(2, "Февраль", 28),
    MARCH(3, "Март", 31),
    APRIL(4, "Апрель", 30),
    MAY(5, "Май", 31),
    JUNE(6, "Июнь", 30),
    JULY(7, "Июль", 31),
    AUGUST(8, "Август", 31),
    SEPTEMBER(9, "Сентябрь", 30),
    OCTOBER(10, "Октябрь", 31),
    NOVEMBER(11, "Ноябрь", 30),
    DECEMBER(12, "Декабрь", 31);

    private int number;
    private String name;
    private int daysCount;

    Month(int number, String name, int daysCount) {
        this.number = number;
        this.name = name;
        this.daysCount = daysCount;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getDaysCount() {
        return daysCount;
    }
}
