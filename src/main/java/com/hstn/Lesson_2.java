
package com.hstn;

import java.util.Arrays;

public class Lesson_2 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(method5());
        method6CheckNumber(100);
        method6CheckNumber(-21);
        System.out.println(method7());
        method8();
        System.out.println(method9Years());
        method10();
        method11();
        method12();
        method13();
        int[] result = method14(6,7 );
        System.out.println(Arrays.toString(result));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -5;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 11;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean method5() {
        int a = 10;
        int b = 11;

        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }
    public static void method6CheckNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean method7() {
        int a = -12;

        return a < 0;
    }
    public static void method8() {
        String text = "Test, ";
        int count = 5;

        System.out.println(text.repeat(count));
    }
    public static boolean method9Years() {

        int year = 400;

        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0){
            return false;
        }else if(year % 4 == 0){
            return true;}
        else {
            return false;
        }
    }
    public static void method10() {

        int[] array = {1, 0, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
    public static void method11() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));
    }
    public static void method12() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        System.out.println(Arrays.toString(array));
    }
    public static void method13() {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static int[] method14(int len, int initialValue) {

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;
    }

}

