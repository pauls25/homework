package io.codelex.oop.shapes;

public abstract class Shape3D extends Shape {
    private double height;

    public Shape3D(int numSides, double height) {
        super(numSides);
        this.height = height;
    }

    public Shape3D(double height) {
        this.height = height;
    }

    public Shape3D() {
        super();
    }

    public double getHeight() {
        return this.height;
    }

    public abstract double calculateVolume();
}
