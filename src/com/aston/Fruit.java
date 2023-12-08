package com.aston;

public abstract class Fruit {
    private float weight;

    public Fruit(float weightFruit) {
        weight = weightFruit;
    }

    public float getFruitWeight() {
        return weight;
    }
}
