package io.codelex.classesandobjects.practice;

public class Car {
    private final double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double firstOdometerReading) {
        this.startKilometers = firstOdometerReading;
        this.liters = 0;
    }

    public double calculateConsumption() {

        return (this.liters / (this.endKilometers - this.startKilometers)) * 100;
    }

    public boolean gasHog() {
        return (calculateConsumption() > 15.0);
    }

    public boolean economyCar() {
        return (calculateConsumption() < 5.0);
    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters += liters;

    }

}
