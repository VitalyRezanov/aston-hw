package com.aston.Anumal;

public class Animal {


    private String name;
    private static int countAnimals;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }
    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public String getName() {
        return name;
    }
}
