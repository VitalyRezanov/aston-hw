package com.aston.Figure;

public interface IFigure {

    String getColorBackground();
    String getColorBorder();
    default double perimeter() {
        System.out.println("Периметр по умолчанию 0.0");
        return 0.0;
    }


    default double square(){
        System.out.println("Площадь по умолчанию 0.0");
        return 0.0;
    }

}
