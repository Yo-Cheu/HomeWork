
package com.hstn;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");

        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Рыжик")
        };

        dog1.run(150);
        dog1.run(600);
        dog1.swim(10);
        dog1.swim(20);

        cats[0].run(150);
        cats[0].run(250);
        cats[0].swim(10);

        Bowl bowl = new Bowl(25);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        System.out.println("\nСостояние котов:");

        for (Cat cat : cats) {
            cat.checkSatiety();
        }

        System.out.println("\nОстаток еды: " + bowl.getFood());

        bowl.addFood(20);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        System.out.println("\nСтатистика:");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
    }
}
