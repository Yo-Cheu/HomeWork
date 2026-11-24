package com.hstn;

public class Main {

    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = sumArray(array);

            System.out.println("Сумма элементов массива: " + sum);

        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }

        System.out.println("\nПроверка ArrayIndexOutOfBoundsException:");

        try {
            System.out.println(array[5][0]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива!");
        }
    }


    public static int sumArray(String[][] array) {

        if (array.length != 4) {
            throw new MyArraySizeException(
                    "Массив должен иметь 4 строки!"
            );
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].length != 4) {
                throw new MyArraySizeException(
                        "Массив должен иметь 4 столбца!"
                );
            }

            for (int j = 0; j < array[i].length; j++) {

                try {
                    sum += Integer.parseInt(array[i][j]);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Неверные данные в ячейке [" +
                                    i + "][" + j + "]: " + array[i][j]
                    );
                }
            }
        }

        return sum;
    }
}