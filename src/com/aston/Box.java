package com.aston;

import java.util.List;

public class Box {
    private List<Fruit> apples;
    private List<Fruit> oranges;

    public Box(List<Fruit> apples, List<Fruit> oranges) {
        this.apples = apples;
        this.oranges = oranges;
    }

    public List<Fruit> getApples() {
        return apples;
    }

    public List<Fruit> getOranges() {
        return oranges;
    }

    public void add(Fruit fruit) {
        if (fruit instanceof Apple)
            apples.add(fruit);
        else
            oranges.add(fruit);
    }
    public double getWeight() {

        return apples.stream().mapToDouble(Fruit::getFruitWeight).sum()
                + oranges.stream().mapToDouble(Fruit::getFruitWeight).sum();
    }
    public boolean compare(Box box) {
        return (this.getWeight() - box.getWeight()) == 0;
    }
    public Box getBox() {
        Box box = new Box(this.apples, this.oranges);
        this.apples = null;
        this.oranges = null;
        return box;
    }
}
