package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    private final double width;
    private final double height;


    public Rectangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }
}
