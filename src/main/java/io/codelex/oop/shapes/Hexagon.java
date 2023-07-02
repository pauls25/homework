package io.codelex.oop.shapes;

public class Hexagon extends Shape {
    private final double sideLength;

    public Hexagon(int numSides, double sideLength) {
        super(numSides);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    @Override
    public double getArea() {
        return ((double) 3 * Math.sqrt(3 * Math.pow(this.getSideLength(), 2)) / 2);
    }

    @Override
    public double getPerimeter() {
        return 6 * getSideLength();
    }
}
