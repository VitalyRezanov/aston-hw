package com.aston.Figure;

public class Circle extends AbstractFigure {
    private int radius;

    public Circle(String colorBackground, String colorBorder, int r) {
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
        radius = r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.sqrt(radius);
    }

    @Override
    public String getColorBackground() {
        return colorBackground;
    }

    @Override
    public String getColorBorder() {
        return colorBorder;
    }
}
