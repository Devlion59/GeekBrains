package com.geekbrains.lesson3;

public class MainApp {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 7)
                    try {
                        throw new MyLibMatrixProcessingException(i, j, array);
                    } catch (MyLibMatrixProcessingException e) {
                        array[e.getRow()][e.getColumn()] = 0;
                    }
            }
        }


    }
}
