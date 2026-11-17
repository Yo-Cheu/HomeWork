
package com.hstn;

public class Park {

    public class Attraction {

        private String name;
        private String openingTime;
        private String closingTime;
        private double price;

        public Attraction(String name, String openingTime,
                          String closingTime, double price) {

            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + openingTime
                    + " - " + closingTime);
            System.out.println("Стоимость: " + price + " BYN");
            System.out.println("-------------------------");
        }
    }
}
