package com.geekbrains.lesson3.homework;

public class MainAppHomeWork {

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            matrixSum(array);
        } catch (MyArraySizeException sizeException) {
            System.out.println("Неверная размерность массива");
        } catch (MyArrayDataException dataException) {
            System.out.println(dataException.getMessage());
        }
    }


    public static void matrixSum(String[][] matrix) {
        if (!isMatrix(matrix))
            throw new MyArraySizeException();
        int sum = 0;
        int row = 0;
        int column = 0;
        try {
            for (int i = 0; i < matrix.length; i++) {
                row = i;
                for (int j = 0; j < matrix[i].length; j++) {
                    column = j;
                    sum += Integer.parseInt(matrix[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(row, column, matrix);
        } finally {
            System.out.println(sum);
        }
    }

    public static boolean isMatrix(String[][] matrix) {
        if (matrix.length != 4)
            return false;
        else {
            for (String[] strings : matrix) {
                if (strings.length != 4)
                    return false;
            }
        }
        return true;
    }
}
