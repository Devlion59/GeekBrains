package com.geekbrains.lesson3.homework;

public class MainAppHomeWork {

    public static void main(String[] args) {
        String[][] matrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            matrixSum(matrix);
        } catch (MyArraySizeException sizeException) {
            System.out.println("Неверная размерность матрицы");
        } catch (MyArrayDataException dataException) {
            System.out.println(dataException.getMessage());
        }
    }


    public static void matrixSum(String[][] matrix) {
        if (!isCorrectMatrix(matrix, 4, 4))
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
            System.out.println("Сумма значений матрицы: " + sum);
        }
    }

    public static boolean isCorrectMatrix(String[][] matrix, int row, int column) {
        if (matrix.length != row)
            return false;
        else {
            for (String[] strings : matrix) {
                if (strings.length != column)
                    return false;
            }
        }
        return true;
    }
}
