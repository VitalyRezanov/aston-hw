import com.aston.Anumal.Animal;
import com.aston.Anumal.Cat;
import com.aston.Anumal.Dog;
import com.aston.Anumal.PlateFood;
import com.aston.Figure.Circle;
import com.aston.Figure.IFigure;
import com.aston.Figure.Rectangle;
import com.aston.Figure.Triangle;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("animal1");
        animal1.run(120);
        animal1.swim(200);
        System.out.println("Кол-во животных" + Animal.getCountAnimals());

        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        Dog dog3 = new Dog("Dog3");
        dog1.run(501);
        dog1.run(500);
        dog1.swim(11);
        dog1.swim(10);
        System.out.println("Кол-во собак" + Dog.getCountDogs());


        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        Cat cat3 = new Cat("Cat3");
        Cat cat4 = new Cat("Cat4");
        cat1.run(201);
        cat1.run(200);
        cat1.swim(12);
        System.out.println("Кол-во котов" + Cat.getCountCats());

        System.out.println("Кол-во животных" + Animal.getCountAnimals());

        System.out.println("===================================================");

        Cat[] cats = new Cat[12];
        PlateFood plate = new PlateFood(100);
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("cat" + (i + 1));
        }
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Кот " + cat.getName() + " сытость:" + cat.isSatiety());
        }

        IFigure circle = new Circle("Красный", "Синий", 11);
        System.out.println("[Периметр:" + circle.perimeter() + " Площадь:" + circle.square() +
                " Цвет границ:" + circle.getColorBorder() + " Цвет заливки:" + circle.getColorBackground());

        IFigure triangle = new Triangle("Синий", "Зеленый", 1, 2, 5, 2);
        System.out.println("[Периметр:" + triangle.perimeter() + " Площадь:" + triangle.square() +
                " Цвет границ:" + triangle.getColorBorder() + " Цвет заливки:" + triangle.getColorBackground());

        IFigure rectangle = new Rectangle("Зеленый", "Красный",19, 9);
        System.out.println("[Периметр:" + rectangle.perimeter() + " Площадь:" + rectangle.square() +
                " Цвет границ:" + rectangle.getColorBorder() + " Цвет заливки:" + rectangle.getColorBackground());

    }
}