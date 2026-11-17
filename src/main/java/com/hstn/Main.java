
package com.hstn;

public class Main {

    public static void main(String[] args) {

        Park park = new Park();

        Park.Attraction rollerCoaster = park.new Attraction(
                "Американские горки", "10:00", "22:00", 15.0);

        Park.Attraction ferrisWheel = park.new Attraction(
                "Колесо обозрения", "11:00", "21:00", 10.0);

        Park.Attraction carousel = park.new Attraction(
                "Карусель", "09:00", "20:00", 5.0);

        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        carousel.printInfo();
    }
}
