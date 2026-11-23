
package com.hstn;

public class Bowl {

    private int food;

    public Bowl(int food) {
        if (food < 0) {
            this.food = 0;
        } else {
            this.food = food;
        }
    }

    public boolean decreaseFood(int amount) {

        if (amount <= 0 || amount > food) {
            return false;
        }

        food -= amount;
        return true;
    }

    public void addFood(int amount) {

        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавлено " + amount + " еды.");
        } else {
            System.out.println("Количество еды должно быть положительным.");
        }
    }

    public int getFood() {
        return food;
    }
}
