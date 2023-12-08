package com.aston;

import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box(List<T> fruits) {
        this.fruits = fruits;
    }

    public Box() {
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void add(T fruit) {
        if (this.fruits.get(0).getClass() == fruit.getClass())
            fruits.add(fruit);
        else
            System.out.println("Этот фрукт нельзя положить в коробку");
    }
    public double getWeight() {
        return fruits.stream().mapToDouble(Fruit::getFruitWeight).sum();
    }
    public boolean compare(Box box) {
        return (this.getWeight() - box.getWeight()) == 0;
    }
    public Box<T> getBox() {
        Box<T> box = new Box<>(fruits);
        this.fruits = null;
        return box;
    }
}
