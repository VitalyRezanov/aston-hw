package com.aston.Anumal;

public class Cat extends Animal{

    private static final int EAT_COUNT = 10;
    private boolean satiety;
    private static int countCats;

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
        countCats++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance > 0)
            super.run(distance);
        else
            System.out.println(this.getName() + " не может пробежать " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.getName() + " не умеет плавать");
    }

    public static int getCountCats() {
        return countCats;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(PlateFood plate) {
        if (plate.getPlateFood() >= EAT_COUNT) {
            plate.setPlateFood(plate.getPlateFood() - EAT_COUNT);
            satiety = true;
        }
    }

}
