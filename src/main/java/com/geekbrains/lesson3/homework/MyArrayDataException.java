package com.geekbrains.lesson3.homework;

public class MyArrayDataException extends MyArrayException {

    private int row;
    private int column;
    private String value;

    public MyArrayDataException(int row, int column, String[][] matrix) {
        super("Invalid data in [" + row + "; " + column + "]: " + matrix[row][column]);
        this.row = row;
        this.column = column;
        this.value = matrix[row][column];
    }
}
