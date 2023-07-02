package io.codelex.oop.shapes;

public class Cube extends Shape3D {

    private double sideLenght;

    public Cube(double height, double sideLenght) {
        super(height);
        this.sideLenght = sideLenght;
    }

    public double getSideLenght() {
        return sideLenght;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(this.getSideLenght(), 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * (4 * this.getSideLenght()) + 4 * this.getHeight();
    }

    @Override
    public double calculateVolume() {
        return Math.pow(this.getSideLenght(), 2) * this.getHeight();
    }
}
