package com.aston.Figure;

public class Rectangle extends AbstractFigure {

    private int length;
    private int width;

    public Rectangle(String colorBackground, String colorBorder, int length, int width) {
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return length * 2 + width + 2;
    }

    @Override
    public double square() {
        return length * width;
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
