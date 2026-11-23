
package com.hstn;

public class Cat extends Animal {

    private static int catCount = 0;

    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной.");
        } else if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int foodAmount) {

        if (isFull) {
            System.out.println(name + " уже сыт.");
        } else if (bowl.decreaseFood(foodAmount)) {
            isFull = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не стал кушать: недостаточно еды.");
        }
    }

    public void checkSatiety() {
        if (isFull) {
            System.out.println(name + " сыт.");
        } else {
            System.out.println(name + " голоден.");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}

