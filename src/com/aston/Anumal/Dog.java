package com.aston.Anumal;

public class Dog extends Animal{
    private static int countDogs;

    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
        countDogs++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500 && distance > 0)
            super.run(distance);
        else
            System.out.println(this.getName() + " не может пробежать " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance > 0)
            super.swim(distance);
        else
            System.out.println(this.getName() + " не может проплыть " + distance + " м.");
    }

    public static int getCountDogs() {
        return countDogs;
    }
}
