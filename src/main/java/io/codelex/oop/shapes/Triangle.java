package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private final double base;
    private final double sideLength;

    /**
     * Triangle is an isosceles triangle. It has a base and two sides of equal length.
     */
    public Triangle(int numSides, double base, double sideLength) {
        super(numSides);
        this.base = base;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 0.5 * this.getBase() * Math.sqrt(
                Math.pow(this.getSideLength(), 2) - Math.pow(this.getBase(), 2) / 4
        );
    }

    @Override
    public double getPerimeter() {
        return this.getBase() + 2 * this.getSideLength();
    }

    public double getBase() {
        return this.base;
    }

    public double getSideLength() {
        return this.sideLength;
    }
}
