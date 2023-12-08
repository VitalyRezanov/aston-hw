package com.aston;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<Apple> apples = new Box<>(List.of(new Apple(), new Apple(), new Apple()));
        Box<Orange> oranges = new Box<>(List.of(new Orange(), new Orange()));

        System.out.println(apples.getWeight());
        Box<Apple> box1 = new Box<>(List.of(new Apple(), new Apple()));
        Box<Apple> box2 = box1.getBox();
        System.out.println("box1:" + box1.getFruits() + " box2:" + box2.getFruits());

        System.out.println(oranges.compare(apples));

    }
}