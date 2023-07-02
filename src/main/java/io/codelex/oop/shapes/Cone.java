package io.codelex.oop.shapes;

public class Cone extends Shape3D {
    private double radius;
    private double sideLenght;

    public Cone(double radius, double sideLenght) {
        this.radius = radius;
        this.sideLenght = sideLenght;
    }

    @Override
    public double getArea() {
        return this.getBaseArea() + Math.PI * this.getRadius() * this.getSideLenght();
    }

    public double getBaseArea() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public double calculateVolume() {
        return ((double) 1 / (double) 3) * this.getConeHeight() + Math.PI * this.getRadius();
    }

    public double getConeHeight() {
        return (Math.sqrt((Math.pow(this.getSideLenght(), 2) - Math.pow(this.getRadius(), 2))));
    }

    public double getRadius() {
        return this.radius;
    }

    public double getSideLenght() {
        return sideLenght;
    }
}
