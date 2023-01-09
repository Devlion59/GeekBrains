package com.geekbrains.lesson3;

public class MyLibMatrixProcessingException extends RuntimeException {

    private int row;
    private int column;
    private int value;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }

    public MyLibMatrixProcessingException(int row, int column, int[][] array) {
        super("Invalid data in [" + row + "; " + column + "]: " + array[row][column]);
        this.row = row;
        this.column = column;
        this.value = array[row][column];
    }
}
