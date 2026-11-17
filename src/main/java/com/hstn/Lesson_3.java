package com.hstn;

public class Lesson_3 {

    public static void main(String[] args) {

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product(
                "Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);

        productsArray[1] = new Product(
                "iPhone 16 Pro", "15.09.2024",
                "Apple Inc.", "USA", 4999, false);

        productsArray[2] = new Product(
                "Xiaomi 15", "20.01.2025",
                "Xiaomi", "China", 2999, false);

        productsArray[3] = new Product(
                "Samsung Galaxy Z Fold", "12.11.2024",
                "Samsung", "South Korea", 2199, true);

        productsArray[4] = new Product(
                "iPhone Duo", "05.03.2025",
                "Apple Inc.", "USA", 3999, false);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
        }
    }
}


