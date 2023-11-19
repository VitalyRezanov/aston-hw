package com.aston.Figure;

public class Triangle extends AbstractFigure {
    private int side1;
    private int side2;
    private int footing;

    private int height;

    public Triangle(String colorBackground, String colorBorder, int side1, int side2, int footing, int height) {
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.footing = footing;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + footing;
    }

    @Override
    public double square() {
        return (footing * height) * 0.5;
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
