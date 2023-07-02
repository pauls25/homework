package io.codelex.classesandobjects.practice;

public class Odometer {
    private double currentMileage;

    public Odometer(double currentMileage) {
        this.currentMileage = currentMileage;
    }

    public double getCurrentMileage() {
        return currentMileage;
    }

    public void printCurrentMileage() {
        System.out.println("Current odometer mileage: " + currentMileage);
    }

    public void increaseCurrentMileage(FuelGauge fuelGauge) {

        if (this.currentMileage < 999.999 && (999.999 - this.currentMileage) >= 1) {
            this.currentMileage += 1;
            fuelGauge.decreaseFuelAmount(0.1);
        } else {
            this.currentMileage = 0;
        }
    }

}
